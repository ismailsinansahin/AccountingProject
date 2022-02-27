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
                .route(r->r.path("/api/v1/products/**")
                        .uri("lb://service-products")
                )
                .route(r->r.path("/api/v1/categories/**")
                        .uri("lb://service-products")
                )
                .build();
    }

}
