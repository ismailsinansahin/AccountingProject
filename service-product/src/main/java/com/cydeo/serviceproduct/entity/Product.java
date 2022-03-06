package com.cydeo.serviceproduct.entity;

import com.cydeo.serviceproduct.enums.ProductStatus;
import com.cydeo.serviceproduct.enums.Unit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Where(clause="is_deleted = false")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private String description;
    private Long categoryId;
    private int qty;
    private int price;
    @Enumerated(EnumType.STRING)
    private Unit unit;
    private int lowLimitAlert;
    private int tax;
    private Long companyId;
    private Byte enabled;
    @Enumerated(EnumType.STRING)
    private ProductStatus productStatus;
    private boolean isDeleted= false;
}