package com.cydeo.serviceinvoice.repository;

import com.cydeo.serviceinvoice.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    Invoice findInvoiceByInvoiceNo(String invoiceNo);

}
