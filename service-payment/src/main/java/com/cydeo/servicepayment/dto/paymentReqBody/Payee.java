package com.cydeo.servicepayment.dto.paymentReqBody;

import lombok.*;


import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Payee {
     String name;
     Address address;
     List<AccountIdentification> accountIdentifications;

    public Payee() {
        this.name = "Cocoon comp";
        this.address = new Address();

    }




}