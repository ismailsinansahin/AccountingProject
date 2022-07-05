package com.cydeo.servicecompany.entity;

import javax.persistence.*;

@Table(name = "state")
@Entity
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String stateCode;
    private String stateName;

}