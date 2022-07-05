package com.cydeo.serviceuser.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

//    @Column(name = "first_name")
//    private String firstName;
//
//    @Column(name = "last_name")
//    private String lastName;

    @Column(name = "company_id")
    private Long companyId;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "password")
    private String password;

    @Column(name = "enabled")
    private Boolean enabled;

    @Column(name = "phone")
    private String phone;

    @Column(name = "created_by")
    private Integer createdBy;

    @Column(name = "created_time")
    private Instant createdTime;

    @Column(name = "updated_by")
    private Integer updatedBy;

    @Column(name = "updated_time")
    private Instant updatedTime;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @Column(name = "is_deleted")
    private Boolean isDeleted;


}