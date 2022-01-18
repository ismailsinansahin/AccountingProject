package com.cydeo.servicecompany.service;

import com.cydeo.servicecommon.contract.CompanyDto;
import com.cydeo.servicecommon.contract.UserDto;

import java.util.List;

public interface CompanyService {

    List<CompanyDto> getAll();

    CompanyDto get(Long id);

    CompanyDto get(String companyName);

    List<UserDto> getAllUsers(String companyName);

    CompanyDto create(CompanyDto companyDto);

    CompanyDto update(CompanyDto companyDto);

    void delete(Long id);

}
