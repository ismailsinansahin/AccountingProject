package com.cydeo.serviceproduct.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "category")
@Where(clause = "is_deleted = false")
public class Category extends BaseEntity {


    private Long companyId;
    private boolean enable;
    private String description;

    @JsonIgnoreProperties
    @OneToMany(mappedBy = "category")
    private List<Product> product;
}
