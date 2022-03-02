package com.cydeo.serviceinvoice.service;

import com.cydeo.servicecommon.contract.InvoiceDto;

import java.util.List;

public interface InvoiceService {

    List<InvoiceDto> getAll();

    InvoiceDto get(Long invoiceId);

    InvoiceDto getByInvoiceNo(String invoiceNo);

    InvoiceDto create(InvoiceDto invoiceDto);

    InvoiceDto update(InvoiceDto invoiceDto, Long invoiceId);

    void delete(Long invoiceId);

}
