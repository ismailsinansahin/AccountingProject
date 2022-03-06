package com.cydeo.servicecompany.serviceImpl;

import com.cydeo.servicecommon.client.CompanyServiceClient;
import com.cydeo.servicecommon.contract.ClientVendorDto;
import com.cydeo.servicecompany.entity.ClientVendor;
import com.cydeo.servicecompany.mapper.MapperUtil;
import com.cydeo.servicecompany.repository.ClientVendorRepository;
import com.cydeo.servicecompany.service.ClientVendorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ClientVendorServiceImpl implements ClientVendorService {

    private final ClientVendorRepository clientVendorRepository;
    private final MapperUtil mapperUtil;
    private final CompanyServiceClient companyServiceClient;


    @Override
    public List<ClientVendorDto> getAll() {

        return clientVendorRepository.findAll().stream()
                .map(clientVendor -> mapperUtil.convert(clientVendor, new ClientVendorDto()))
                .collect(Collectors.toList());
    }

    @Override
    public ClientVendorDto getById(Long id) {
        return mapperUtil.convert(clientVendorRepository.findById(id).get(), new ClientVendorDto());
    }


    @Override
    public ClientVendorDto create(ClientVendorDto clientVendorDto) {
        Long currentCompany = companyServiceClient.getCurrentCompany();
        clientVendorDto.setCompanyId(currentCompany);
        ClientVendor inDB = clientVendorRepository.save(mapperUtil.convert(clientVendorDto, new ClientVendor()));
        return mapperUtil.convert(inDB, new ClientVendorDto());
    }

    @Override
    public ClientVendorDto update(ClientVendorDto clientVendorDto, Long id) {
        clientVendorDto.setId(id);
        ClientVendor clientVendorDB = mapperUtil.convert(clientVendorDto, new ClientVendor());
        clientVendorRepository.save(clientVendorDB);
        return mapperUtil.convert(clientVendorDB, new ClientVendorDto());
    }

    @Override
    public void delete(Long id) {
        ClientVendor clientVendor = clientVendorRepository.getById(id);
        clientVendor.setIsDeleted(true);
        clientVendorRepository.save(clientVendor);
    }
}
