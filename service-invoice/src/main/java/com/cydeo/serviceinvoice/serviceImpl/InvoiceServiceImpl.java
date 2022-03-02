package com.cydeo.serviceinvoice.serviceImpl;

import com.cydeo.servicecommon.contract.InvoiceDto;
import com.cydeo.serviceinvoice.entity.Invoice;
import com.cydeo.serviceinvoice.mapper.MapperUtil;
import com.cydeo.serviceinvoice.repository.InvoiceRepository;
import com.cydeo.serviceinvoice.service.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final MapperUtil mapperUtil;

    @Override
    public List<InvoiceDto> getAll() {
        return invoiceRepository.findAll()
                .stream()
                .map(obj -> mapperUtil.convert(obj, new InvoiceDto()))
                .collect(Collectors.toList());
    }

    @Override
    public InvoiceDto get(Long invoiceId) {
        return mapperUtil.convert(invoiceRepository.findById(invoiceId).get(), new InvoiceDto());
    }

    @Override
    public InvoiceDto getByInvoiceNo(String invoiceNo) {
        return mapperUtil.convert(invoiceRepository.findInvoiceByInvoiceNo(invoiceNo), new InvoiceDto());
    }

    @Override
    public InvoiceDto create(InvoiceDto invoiceDto) {
        return null;
    }

    @Override
    public InvoiceDto update(InvoiceDto invoiceDto, Long invoiceId) {
        return null;
    }

    @Override
    public void delete(Long invoiceId) {

    }

}
