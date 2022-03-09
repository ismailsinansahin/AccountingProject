package com.cydeo.servicepayment.service;

import com.cydeo.servicepayment.dto.paymentReqBody.*;

import java.util.List;

public interface ConfigPaymentDetailForService {

    Amount getAmount();
    Address getAddress();
    Payee getPayee();
    PaymentRequest getPaymentRequest();
    PaymentAuthorizationBody getPaymentAuthorizationBody();
    List<AccountIdentification> getAccountIdentificationList();
}
