package com.cydeo.servicepayment.controller;

import com.cydeo.servicepayment.dto.Institution;
import com.cydeo.servicepayment.dto.ResultEnvelope;
import com.cydeo.servicepayment.service.PaymentService;
import com.sun.istack.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/institutions")
    public ResultEnvelope<List<Institution>> getInstitutions() {

        var body = this.paymentService.getInstitutions();
        return ResultEnvelope.ok(body);
    }


    @PostMapping("/auth")
    public ResultEnvelope auth(@RequestBody @Valid @NotNull MinimalPaymentAuthorisationRequest request) throws JsonProcessingException {
        return this.paymentService.authPaymentRequest(request);
    }


    @GetMapping("/yapily/callback")
    public ResultEnvelope<String> yapilyCallback(@RequestParam("consent") String consent) {

        return ResultEnvelope.ok(consent);
    }




}
