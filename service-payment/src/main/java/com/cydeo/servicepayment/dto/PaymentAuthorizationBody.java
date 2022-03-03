package com.cydeo.servicepayment.dto;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class PaymentAuthorizationBody {

    private String applicationUserId;
    private String institutionId;
    private String callback;
    PaymentRequest PaymentRequestObject;



}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
class PaymentRequest {
    private String type = "DOMESTIC_PAYMENT";
    private String paymentIdempotencyId = "1d54cf71bfe44b1b8e64547ae45455d96";
    Payer PayerObject;
    Amount AmountObject;
    private String reference;
    Payee PayeeObject;



    // Getter Methods


}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Payee {
    private String name = "Cocoon Company";
    Address AddressObject;
    ArrayList<Object> accountIdentifications = new ArrayList<Object>();

}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Address {
    private String country="GB";



}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Amount {
    private String amount = "7.00";
    private String currency = "GB";


}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Payer {
    private String name = "Costumer";
    ArrayList<Object> accountIdentifications = new ArrayList<Object>();

}

