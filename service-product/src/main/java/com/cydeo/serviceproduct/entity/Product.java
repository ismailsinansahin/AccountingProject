package com.cydeo.serviceproduct.entity;

import com.cydeo.serviceproduct.enums.ProductStatus;
import com.cydeo.serviceproduct.enums.Unit;

import lombok.*;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Where(clause="is_deleted = false")
public class Product extends BaseEntity {

    @Column(name = "product_name")
    private String productName;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category categoryId;

    @Column(name = "qty")
    private Integer qty;

    @Column(name = "unit")
    @Enumerated(EnumType.STRING)
    private Unit unit;

    @Column(name = "low_limit_alert")
    private Integer lowLimitAlert;

    @Column(name = "tax")
    private Integer tax;


    @Column(name = "company_id")
    private Long companyId;

    @Column(name = "enabled")
    private Boolean enabled;

    @Column(name = "product_status")
    @Enumerated(EnumType.STRING)
    private ProductStatus productStatus;




//    private String name;
//    private String description;
//
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "category_id")
//    private Category category;
//    private int qty;
//    private int price;
//    @Enumerated(EnumType.STRING)
//    private Unit unit;
//    private int lowLimitAlert;
//    private int tax;
//
//    private Long companyId;
//    private Byte enabled;
//    @Enumerated(EnumType.STRING)
//    private ProductStatus productStatus;

}
