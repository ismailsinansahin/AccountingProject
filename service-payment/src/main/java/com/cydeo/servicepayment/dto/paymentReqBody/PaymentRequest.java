package com.cydeo.servicepayment.dto.paymentReqBody;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentRequest {
    private String type = "DOMESTIC_PAYMENT";
    private String paymentIdempotencyId = "1d54cf71bfe44b1b8e64547ae45455d22";
    private String reference= "REFERENCE";
    private String contextType= "OTHER";
    Amount amount = new Amount();
    Payee payee = new Payee();




}