package com.cydeo.servicepayment.service;

import com.cydeo.servicepayment.dto.Institution;
import com.cydeo.servicepayment.dto.InstitutionsResponse;
import com.cydeo.servicepayment.dto.PaymentResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import reactor.core.publisher.Mono;

import java.util.List;

public interface PaymentService {
    InstitutionsResponse getInstitutions();
    String generateToken();
    String accountAuth() throws JsonProcessingException;
    PaymentResponse makePayment();
    void authForPayment();
    String createPaymentAuthorization() throws JsonProcessingException;

}
