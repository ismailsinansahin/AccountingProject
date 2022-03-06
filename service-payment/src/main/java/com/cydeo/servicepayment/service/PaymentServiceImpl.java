package com.cydeo.servicepayment.service;


import com.cydeo.servicepayment.dto.*;
import com.cydeo.servicepayment.dto.Institution;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;
import yapily.ApiClient;
import yapily.Configuration;
import yapily.auth.HttpBasicAuth;
import yapily.sdk.*;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Base64;
import java.util.List;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    private final String BASE_URI = "https://api.yapily.com";
    private final String client_id = "3fda055a-77f7-4496-a93e-adbc39b39011";
    private final String client_secret = "40316b6d-4656-409c-bd1b-ac1f11738ae8";
    //These lines are for Yapily
    private final String APPLICATION_ID = client_id;
    private final String APPLICATION_SECRET = client_secret;
    @Autowired
    private WebClient.Builder webClient;
    @Autowired
    private ObjectMapper jacksonMapper;
    private String institutionId = "aibgb-sandbox";
    private String callback = "https://display-parameters.com/";


// @Value("${client_secret}")
// private String client_secret;

    public String generateToken() {

        String token = Base64.getEncoder().encodeToString(new String(this.client_id + ":" + this.client_secret).getBytes(StandardCharsets.UTF_8));
        log.info(token);
        return token;

    }


    /**
     * curl --location --request GET 'https://api.yapily.com/institutions' \
     * --header 'Authorization: Basic {authToken}'
     */
    public InstitutionsResponse getInstitutions() {

        InstitutionsResponse authorization = webClient.build()
                .get()
                .uri(BASE_URI + "/institutions")
                .header("Authorization", "Basic " + generateToken())
                .retrieve()
                .bodyToMono(InstitutionsResponse.class)
                .retryWhen(Retry.fixedDelay(3, Duration.ofMillis(100)))
                .doOnError(error -> log.error("An error has occurred {}", error.getMessage()))
                .block();


        return authorization;
    }

    @Override
    public String accountAuth() {

        log.info(getPayment().toString());
        return
                webClient.build()
                        .post()
                        .uri(BASE_URI + "/payment-auth-requests")
                        .header("Authorization", "Basic " + generateToken())
                        .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                        .body(Mono.just(getPayment()), PaymentAuthorizationRequest.class)
                        .retrieve()
                        .bodyToMono(Object.class)
                        .retryWhen(Retry.fixedDelay(3, Duration.ofMillis(100)))
                        .doOnError(error -> log.error("An error has occurred {}", error.getMessage()))
                        .block().toString();
    }

    public PaymentAuthorizationBody getPayment() {
        PaymentAuthorizationBody paymentAuthorizationBody = new PaymentAuthorizationBody();
        paymentAuthorizationBody.setApplicationUserId(this.client_id);
        paymentAuthorizationBody.setInstitutionId(this.institutionId);
        paymentAuthorizationBody.setCallback(this.callback);

        return paymentAuthorizationBody;

    }

    public void loginWithSdk() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure the API authentication
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
// Replace these demo constants with your application credentials
        basicAuth.setUsername(APPLICATION_ID);
        basicAuth.setPassword(APPLICATION_SECRET);
    }

    public void getInstitutionsWithSdk() {
        InstitutionsApi institutionsApi = new InstitutionsApi();
        List<Institution> institutions = institutionsApi.getInstitutionsUsingGET().getData();
    }

    public void loginWithSdkForMultipleApplicationCases() {
        ApiClient applicationClient = new ApiClient();
// Configure the API authentication
        HttpBasicAuth basicAuth = (HttpBasicAuth) applicationClient.getAuthentication("basicAuth");
// Replace these demo constants with your application credentials
        basicAuth.setUsername(APPLICATION_ID);
        basicAuth.setPassword(APPLICATION_SECRET);
        InstitutionsApi institutionsApi = new InstitutionsApi();
        institutionsApi.setApiClient(applicationClient);
    }

    public void getUrlwitSdk(){
        final AccountsApi accountsApi = new AccountsApi();
          AccountAuthorisationRequest accountAuthorisationRequest = new AccountAuthorisationRequest();
        accountAuthorisationRequest.setApplicationUserId(APPLICATION_ID);
        accountAuthorisationRequest.setInstitutionId(institutionId);
/**
 * Use the defaults
 */
        accountAuthorisationRequest.setAccountRequest(new AccountRequest());
        ApiResponseOfAuthorisationRequestResponse authorizationResponse = accountsApi.initiateAccountRequestUsingPOST(accountAuthorisationRequest, null, null, null);
        String directUrl = authorizationResponse.getData().getAuthorisationUrl();
    }

    public static void main(String[] args) {
        PaymentServiceImpl  paymentService = new PaymentServiceImpl();
        paymentService.getInstitutionsWithSdk();
    }
}
