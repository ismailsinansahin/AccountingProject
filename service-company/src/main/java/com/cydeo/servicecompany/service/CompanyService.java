package com.cydeo.servicecompany.service;

import com.cydeo.servicecommon.contract.CompanyDto;
import com.cydeo.servicecommon.contract.UserDto;

import java.util.List;

public interface CompanyService {

    List<CompanyDto> getAll();

    CompanyDto get(Long id);

    CompanyDto getByName(String companyName);

    List<UserDto> getAllUsersOfCompany(Long companyId);

    CompanyDto create(CompanyDto companyDto);

    CompanyDto update(CompanyDto companyDto, Long id);

    void delete(Long id);

}
