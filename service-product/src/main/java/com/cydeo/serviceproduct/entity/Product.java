package com.cydeo.serviceproduct.entity;

import com.cydeo.serviceproduct.enums.ProductStatus;
import com.cydeo.serviceproduct.enums.Unit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String prodcutName;
    private String description;
    private long categoryId;
    private int qty;
    private int price;
    private Unit unit;
    private int lowLimitAlert;
    private int tax;
    private Long companyId;
    private Byte enabled;
    private ProductStatus productStatus;
}
