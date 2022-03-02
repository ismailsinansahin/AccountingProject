package com.cydeo.serviceinvoice.serviceImpl;

import com.cydeo.servicecommon.contract.InvoicedItemDto;
import com.cydeo.serviceinvoice.mapper.MapperUtil;
import com.cydeo.serviceinvoice.repository.InvoicedItemRepository;
import com.cydeo.serviceinvoice.service.InvoicedItemService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InvoicedItemServiceImpl implements InvoicedItemService {

    private final InvoicedItemRepository invoicedItemRepository;
    private final MapperUtil mapperUtil;

    public InvoicedItemServiceImpl(InvoicedItemRepository invoicedItemRepository, MapperUtil mapperUtil) {
        this.invoicedItemRepository = invoicedItemRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<InvoicedItemDto> getAll() {
        return invoicedItemRepository.findAll()
                .stream()
                .map(obj -> mapperUtil.convert(obj, new InvoicedItemDto()))
                .collect(Collectors.toList());
    }

    @Override
    public InvoicedItemDto get(Long invoicedItemId) {
        return mapperUtil.convert(invoicedItemRepository.findById(invoicedItemId).get(), new InvoicedItemDto());
    }

    @Override
    public InvoicedItemDto create(InvoicedItemDto invoicedItemDto) {
        return null;
    }

    @Override
    public InvoicedItemDto update(InvoicedItemDto invoicedItemDto, Long invoicedItemId) {
        return null;
    }

    @Override
    public void delete(Long invoicedItemId) {

    }

}
