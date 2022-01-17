package com.cydeo.servicecompany.service;

import com.cydeo.servicecommon.contract.CompanyDto;

import java.util.List;

public interface CompanyService {

    List<CompanyDto> getAll();

    CompanyDto get(Long id);

    CompanyDto get(String companyName);

    CompanyDto create(CompanyDto userDto);

    CompanyDto update(CompanyDto userDto);

    void delete(Long id);

}
