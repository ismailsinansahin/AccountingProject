package com.cydeo.servicepayment.service.stripeservice;

import com.cydeo.servicepayment.dto.stripe.ChargeRequest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class StripeService {

    @Value("${STRIPE_PRIVATE_KEY}")
    private String secretKey;

    @PostConstruct
    public void init() {
        Stripe.apiKey = secretKey;

    }


    public Charge charge(ChargeRequest chargeRequest) throws StripeException {

        Map<String, Object> chargeParams = new HashMap<>();
        chargeParams.put("amount",chargeRequest.getAmoun());
        chargeParams.put("currency",chargeRequest.getCurrency());
        chargeParams.put("description",chargeRequest.getDescription());
        chargeParams.put("source",chargeRequest.getStripeToken());


        return Charge.create(chargeParams);
    }
}
