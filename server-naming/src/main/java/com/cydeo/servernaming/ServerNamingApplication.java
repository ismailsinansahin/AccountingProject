package com.cydeo.servernaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerNamingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerNamingApplication.class, args);
    }

}
