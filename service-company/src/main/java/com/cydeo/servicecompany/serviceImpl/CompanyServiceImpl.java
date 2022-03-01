package com.cydeo.servicecompany.serviceImpl;

import com.cydeo.servicecommon.client.UserServiceClient;
import com.cydeo.servicecommon.contract.CompanyDto;
import com.cydeo.servicecommon.contract.UserDto;
import com.cydeo.servicecompany.entity.Company;
import com.cydeo.servicecompany.mapper.MapperUtil;
import com.cydeo.servicecompany.repository.CompanyRepository;
import com.cydeo.servicecompany.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;
    private final MapperUtil mapperUtil;
    private final UserServiceClient userServiceClient;

    @Override
    public List<CompanyDto> getAll() {
        return companyRepository
                .findAll()
                .stream()
                .map(company -> mapperUtil.convert(company, new CompanyDto()))
                .collect(Collectors.toList());
    }

    @Override
    public CompanyDto get(Long id) {
        return mapperUtil.convert(companyRepository.findById(id).get(), new CompanyDto());
    }

//    @Override
//    public CompanyDto get(String companyName) {
//        return mapperUtil.convert(companyRepository.findCompanyByCompanyName(companyName), new CompanyDto());
//    }

    @Override
    public List<UserDto> getAllUsersOfCompany(Long companyId) {
        List<UserDto> userDtoList = userServiceClient.getAllUsersOfCompany(companyId).getBody();
        System.out.println("userDtoList = " + userDtoList);
        return userDtoList;
    }

    @Override
    public CompanyDto create(CompanyDto companyDto) {
        Company company = mapperUtil.convert(companyDto, new Company());
        companyRepository.save(company);
        return mapperUtil.convert(company, new CompanyDto());
    }

    @Override
    public CompanyDto update(CompanyDto companyDto) {
        Company company = mapperUtil.convert(companyDto, new Company());
        companyRepository.save(company);
        return mapperUtil.convert(company, new CompanyDto());
    }

    @Override
    public void delete(Long id)  {
        companyRepository.delete(companyRepository.findById(id).get());
    }
}
