package com.cydeo.servicecompany.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }

}
