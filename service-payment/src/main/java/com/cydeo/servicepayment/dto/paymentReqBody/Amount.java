package com.cydeo.servicepayment.dto.paymentReqBody;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Amount {
    private String amount = "7.00";
    private String currency = "GBP";


}