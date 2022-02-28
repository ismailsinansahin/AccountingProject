package com.cydeo.servicepayment.dto;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Builder
@Value
public class Institution {

    String id;
    String name;
    String fullname;
    List<Countries> countries;
    List<Media> media;
    List<Feature> features;

}
