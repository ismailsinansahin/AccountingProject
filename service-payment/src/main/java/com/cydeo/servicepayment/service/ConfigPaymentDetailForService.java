package com.cydeo.servicepayment.service;

import com.cydeo.servicepayment.dto.paymentReqBody.*;

public interface ConfigPaymentDetailForService {

    Amount getAmount();
    Address getAddress();
    Payee getPayee();
    PaymentRequest getPaymentRequest();
    PaymentAuthorizationBody getPaymentAuthorizationBody();
}
