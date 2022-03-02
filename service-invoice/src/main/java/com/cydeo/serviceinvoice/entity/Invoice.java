package com.cydeo.serviceinvoice.entity;

import com.cydeo.serviceinvoice.enums.InvoiceStatus;
import com.cydeo.serviceinvoice.enums.InvoiceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "invoices")
@Where(clause = "is_deleted=false")
public class Invoice extends BaseEntity{

    private String invoiceNo;

    @Enumerated(EnumType.STRING)
    private InvoiceStatus invoiceStatus;

    @Enumerated(EnumType.STRING)
    private InvoiceType invoiceType;

    @DateTimeFormat
    private LocalDate date;

    private boolean enabled;

    @Column(name = "company_id")
    private Long companyId;

    @Column(name = "client_vendor_id")
    private Long clientVendorId;

}
