package com.cydeo.servicepayment.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Builder
@Value
@AllArgsConstructor

public class Institution {

    String id;
    String name;
    String fullName;
    List<Countries> countries;
    List<Media> media;
    List<Feature> features;

}
