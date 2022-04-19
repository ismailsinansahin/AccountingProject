package com.cydeo.servicecompany.entity;

import com.cydeo.servicecompany.enums.CompanyStatus;
import com.cydeo.servicecompany.enums.States;
import lombok.*;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "companies")
@Where(clause = "is_deleted=false")
public class Company extends BaseEntity {

    @Column(name = "name", nullable = false, length = 125)
    private String name;

    @Column(name = "address1")
    private String address1;

    @Column(name = "address2")
    private String address2;

    @Column(name = "zip")
    private String zip;

    @Column(name = "representative", length = 100)
    private String representative;

    @Column(name = "email")
    private String email;

    @Column(name = "establishment_date")
    private LocalDate establishmentDate;

    @Column(name = "enabled")
    private Boolean enabled;

    @Column(name = "phone", length = 20)
    private String phone;

    @Enumerated(EnumType.STRING)
    private CompanyStatus companyStatus;



}