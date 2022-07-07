package com.cydeo.servicereport.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "stock_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Where(clause="is_deleted = false")
public class Report extends BaseEntity {

    @Column(name="i_date")
    private LocalDate invoiceDate;

    private int price;

    private int quantity;

    private int remainingQuantity;

    //@ManyToOne(cascade = CascadeType.LAZY)
    //@JoinColumn(name = "product_id")
    @Column(name="product_id")
    private Long product;

}
