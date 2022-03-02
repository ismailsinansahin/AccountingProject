package com.cydeo.serviceinvoice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "invoiced_items")
@Where(clause = "is_deleted=false")
public class InvoicedItem extends BaseEntity{

    private BigDecimal unitPrice;
    private int qty;
    private int tax;
    private int profitLoss;
    private int purchasePrice;
    private int purchaseTax;
    private int purchaseCost;
    private int saledPrice;
    private int saledTax;
    private int saledAmount;
    private boolean enabled;

    @OneToOne
    private InvoiceProductRel invoiceProductRel;

}
