package com.cydeo.servicecompany.entity;

import com.cydeo.servicecompany.enums.CompanyStatus;
import com.cydeo.servicecompany.enums.States;
import lombok.*;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "companies")
@Where(clause = "is_deleted=false")
public class Company extends BaseEntity {

    private String title;

    private String address1;
    private String address2;

    @Enumerated(EnumType.STRING)
    private States stateName;

    private String zipCode;

    private String representative;

    private String email;

    private String phone;

    private LocalDate establishmentDate;

    private Boolean enabled;

    @Enumerated(EnumType.STRING)
    private CompanyStatus companyStatus;

}