package com.cydeo.servicepayment.dto.paymentReqBody;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

//@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Payee {
    private String name;
    Address address;
    public List<AccountIdentification> accountIdentifications;

    public Payee() {
        this.name = "Cocoon comp";
        this.address = new Address();

    }




}