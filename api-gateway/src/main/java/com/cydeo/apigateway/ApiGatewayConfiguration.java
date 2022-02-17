package com.cydeo.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/companies/**")
                        .uri("lb://service-company")
                )
                .route(r -> r.path("/users/**")
                        .uri("lb://service-user")
                )
                .route(r->r.path("/products/**")
                        .uri("lb://service-products")
                )
                .build();
    }

}
