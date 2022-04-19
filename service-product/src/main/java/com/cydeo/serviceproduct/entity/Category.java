package com.cydeo.serviceproduct.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "category")
@Where(clause = "is_deleted = false")
public class Category extends BaseEntity {

    @JsonIgnoreProperties
    @OneToMany(fetch = FetchType.LAZY )
    private List<Product> product;

    @Column(name = "enabled")
    private Boolean enabled;


    @Column(name = "description")
    private String description;

    @Column(name = "company_id")
    private Long companyId;


}
