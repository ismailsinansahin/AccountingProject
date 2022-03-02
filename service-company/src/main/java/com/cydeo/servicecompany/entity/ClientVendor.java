package com.cydeo.servicecompany.entity;

import com.cydeo.servicecompany.enums.ClientVendorType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "client_vendor")
@Where(clause = "is_deleted=false")
public class ClientVendor extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    @JsonIgnore
    private Company company;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private ClientVendorType type;

    @Column(name="zipcode")
    private String zipCode;

    @Column(name="address")
    private String address;

    @Column(name="state")
    private String state;

    @Column(name="enabled")
    private Boolean enabled;

}
