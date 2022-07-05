package com.cydeo.apigateway;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("service-company",r -> r.path("/api/v1/companies/**")
                        .uri("lb://service-company")
                )
                .route(r -> r.path("/api/v1/users/**")
                        .uri("lb://service-user")
                )
                .route(r->r.path("/api/v1/products/**")
                        .uri("lb://service-product")
                )
                .route(r->r.path("/api/v1/categories/**")
                        .uri("lb://service-product")
                )
                .route(r->r.path("/api/v1/invoices/**")
                        .uri("lb://service-invoice")
                )
                .route(r->r.path("/api/v1/invoicedItems/**")
                        .uri("lb://service-invoice")
                )
                .route(r->r.path("/api/v1/stock-reports/**")
                        .uri("lb://service-report")
                )
                .route(r->r.path("/api/v1/categories/**")
                        .uri("lb://service-report")
                )
                .build();
    }




}
