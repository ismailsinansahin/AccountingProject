package com.cydeo.servicepayment.dto;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import yapily.sdk.AccountIdentification;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class PaymentAuthorizationBody {


    /**
     * {
     *    "applicationUserId": "{{application-user-id}}",
     *    "institutionId": "{{institution-id}}",
     *    "paymentRequest": {
     *       "type": "DOMESTIC_PAYMENT",
     *       "paymentIdempotencyId": "1d54cf71bfe44b1b8e67247aed455d96",
     *       "reference": "REFERENCE",
     *       "contextType": "OTHER",
     *       "amount": {
     *          "amount": "4.00",
     *          "currency": "GBP"
     *       },
     *       "payee": {
     *          "name": "John Doe",
     *          "address": {
     *             "country": "GB"
     *          },
     *          "accountIdentifications": [
     *             {
     *                "type": "SORT_CODE",
     *                "identification": "123456"
     *             },
     *             {
     *                "type": "ACCOUNT_NUMBER",
     *                "identification": "12345678"
     *             }
     *          ]
     *       }
     *    }
     * }
     */
    @Value("${applicationUserId}")
    private String applicationUserId;

    @Value("${institutionId}")
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
//    Payer PayerObject;
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
    private String name = "Cocoon comp";
    Address AddressObject;
    ArrayList<AccountIdentification> accountIdentifications = new ArrayList<AccountIdentification>();

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

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//class Payer {
//    private String name = "Costumer";
//    ArrayList<Object> accountIdentifications = new ArrayList<Object>();
//
//}

