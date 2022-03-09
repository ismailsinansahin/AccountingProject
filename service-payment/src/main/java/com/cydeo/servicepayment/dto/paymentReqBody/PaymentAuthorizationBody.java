package com.cydeo.servicepayment.dto.paymentReqBody;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
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

//    @Value("${applicationUserId}")
//    private String applicationUserId;
    private String applicationUserId = "tommy@gmail.com";

//    @Value("${institutionId}")
//    private String institutionId  ;
    private String institutionId = "modelo-sandbox";


//    private String callback;
   PaymentRequest paymentRequest ;

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

