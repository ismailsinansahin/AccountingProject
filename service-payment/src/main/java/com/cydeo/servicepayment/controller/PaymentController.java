package com.cydeo.servicepayment.controller;

import com.cydeo.servicepayment.dto.Institution;
import com.cydeo.servicepayment.dto.InstitutionsResponse;
import com.cydeo.servicepayment.dto.PaymentAuthorizationBody;
import com.cydeo.servicepayment.dto.ResultEnvelope;
import com.cydeo.servicepayment.service.PaymentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.sun.istack.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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

//    @GetMapping("/institutions")
//    public ResultEnvelope<List<Institution>> getInstitutions() {
//
//        var body = this.paymentService.getInstitutions();
//        log.info(body.toString());
//        return ResultEnvelope.ok(body);
//    }


    @GetMapping("/institutions")
    public ResponseEntity<InstitutionsResponse> getInstitutions() {

        var body = this.paymentService.getInstitutions();
        log.info(body.toString());
        return ResponseEntity.ok(body);
    }

    @GetMapping("/auth")
    public ResultEnvelope auth() throws JsonProcessingException {
        log.info("Authentication request");
        return ResultEnvelope.ok(this.paymentService.accountAuth());
    }


    @GetMapping("/yapily/callback")
    public ResultEnvelope<String> yapilyCallback(@RequestParam("consent") String consent) {

        log.info("callback");
        return ResultEnvelope.ok(consent);
    }




}
