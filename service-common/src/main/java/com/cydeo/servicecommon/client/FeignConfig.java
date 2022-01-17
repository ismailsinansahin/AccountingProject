package com.cydeo.servicecommon.client;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.cydeo.servicecommon.client")
public class FeignConfig {
}
