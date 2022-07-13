package com.cydeo.servicepayment.controller;



import com.cydeo.servicepayment.dto.ResultEnvelope;
import com.cydeo.servicepayment.dto.stripe.ChargeRequest;
import com.cydeo.servicepayment.service.stripeservice.StripeService;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@CrossOrigin
@RequestMapping("/api/v1/payment/stripe")
public class StripeController {


    @Value("${STRIPE_PUBLIC_KEY}")
    private String stripePublicKey;

    private StripeService stripeService;

    public StripeController(StripeService stripeService) {
        this.stripeService = stripeService;
    }

    @PostMapping("/checkout")
    public void checkout(){

    }
    @PostMapping("/charge")
    public ResultEnvelope<com.stripe.model.Charge> charge(@RequestBody ChargeRequest chargeRequest,@RequestParam("stripePublicKey") String stripePublicKey) throws StripeException {
        Charge charge = stripeService.charge(chargeRequest);

        return ResultEnvelope.ok(charge);
    }




}
