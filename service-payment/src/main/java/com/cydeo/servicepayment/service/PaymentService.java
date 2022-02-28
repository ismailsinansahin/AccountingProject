package com.cydeo.servicepayment.service;

import com.cydeo.servicepayment.dto.Institution;

import java.util.List;

public interface PaymentService {
    public List<Institution> getInstitutions();
}
