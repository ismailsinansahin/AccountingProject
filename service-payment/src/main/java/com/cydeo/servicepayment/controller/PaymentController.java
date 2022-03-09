package com.cydeo.servicepayment.controller;

import com.cydeo.servicepayment.dto.Institution;
import com.cydeo.servicepayment.dto.InstitutionsResponse;
import com.cydeo.servicepayment.dto.ResultEnvelope;
import com.cydeo.servicepayment.service.PaymentService;
import com.cydeo.servicepayment.service.PaymentServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yapily.ApiException;

import java.util.List;


@RestController
@Slf4j
@CrossOrigin
@RequestMapping("/api/v1/payment")
public class PaymentController {

//    @Autowired
//    private final PaymentServiceFactoryBean paymentServiceFactory;

    @Autowired
    private PaymentService paymentService;

    //this method works properly

    @GetMapping("/institutions/sdk")
    public ResultEnvelope<List<Institution>> getInstitutionswithsdk() throws ApiException, JsonProcessingException {

        PaymentServiceImpl paymentService = new PaymentServiceImpl();
        paymentService.getInstitutionsWithSdk();
//        var body = this.paymentService.
//        log.info(body.toString());
        return ResultEnvelope.ok(paymentService.getPayment().getInstitutionId());
    }


    @GetMapping("/institutions")
    public ResponseEntity<InstitutionsResponse> getInstitutions() {

        var body = this.paymentService.getInstitutions();
        log.info(body.toString());
        return ResponseEntity.ok(body);
    }

    @GetMapping("/create-payment-auth-request")
    public ResultEnvelope auth() throws JsonProcessingException {
        log.info("Authentication request");
        return ResultEnvelope.ok(this.paymentService.createPaymentAuthorization());
    }


    @GetMapping("/yapily/callback")
    public ResultEnvelope<String> yapilyCallback(@RequestParam("consent") String consent) {

        log.info("callback");
        return ResultEnvelope.ok(consent);
    }

    @PostMapping("/make-payment")
    public ResultEnvelope<String> yapilyMakePayment(@RequestParam("amount") Double amount) {

        log.info("make-payment endpoint called ");
        return ResultEnvelope.ok("");
    }





}
