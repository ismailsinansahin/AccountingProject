package com.cydeo.serviceinvoice.serviceImpl;

import com.cydeo.servicecommon.contract.InvoiceDto;
import com.cydeo.serviceinvoice.entity.Invoice;
import com.cydeo.serviceinvoice.service.InvoiceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Override
    public List<Invoice> getAll() {
        return null;
    }

    @Override
    public InvoiceDto get(Long invoiceId) {
        return null;
    }

    @Override
    public InvoiceDto getByInvoiceNo(String invoiceNo) {
        return null;
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
