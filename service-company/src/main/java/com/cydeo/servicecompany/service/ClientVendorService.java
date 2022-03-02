package com.cydeo.servicecompany.service;

import com.cydeo.servicecommon.contract.ClientVendorDto;
import com.cydeo.servicecommon.contract.CompanyDto;
import com.cydeo.servicecommon.contract.UserDto;

import java.util.List;

public interface ClientVendorService {

    List<ClientVendorDto> getAll();

    ClientVendorDto getById(Long id);

    ClientVendorDto create(ClientVendorDto clientVendorDto);

    ClientVendorDto update(ClientVendorDto clientVendorDto, Long id);

    void delete(Long id);
}
