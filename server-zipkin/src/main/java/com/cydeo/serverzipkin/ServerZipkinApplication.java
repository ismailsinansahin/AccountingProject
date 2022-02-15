package com.cydeo.serverzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableZipkinServer
@SpringBootApplication
public class ServerZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerZipkinApplication.class, args);
    }

}
