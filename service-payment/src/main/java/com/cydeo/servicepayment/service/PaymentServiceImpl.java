package com.cydeo.servicepayment.service;


import com.cydeo.servicepayment.dto.Institution;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

 @Autowired
 private WebClient.Builder webClient;

 private final String BASE_URI = "https://api.yapily.com";



/**
 * curl --location --request GET 'https://api.yapily.com/institutions' \
 *   --header 'Authorization: Basic {authToken}'
 */
 public List<Institution> getInstitutions(){


  var institutionsList = webClient.build()
          .get()
          .uri(BASE_URI+"/institutions")
          .retrieve()
          .bodyToFlux(Institution.class)
          .collectList()
          .block();

  return institutionsList;
 }




}
