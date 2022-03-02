package com.cydeo.serviceinvoice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "invoice_product_rel")
@Where(clause = "is_deleted=false")
public class InvoiceProductRel extends BaseEntity {

    @ManyToOne
    private Invoice invoice;

    private Long product_id;

    @OneToOne
    private InvoicedItem invoicedItem;

}
