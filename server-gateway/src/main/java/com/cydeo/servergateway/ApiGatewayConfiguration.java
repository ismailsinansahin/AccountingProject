package com.cydeo.servergateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class ApiGatewayConfiguration {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/product/**")
                        .filters(f -> f.rewritePath("/product/(?.*)", "/${remains}")
                                .addRequestHeader("X-first-Header", "first-service-header")
                                .hystrix(c -> c.setName("hystrix")
                                        .setFallbackUri("forward:/fallback/first")))
                        .uri("lb://SERVICE-PRODUCT/")
                        .id("service-product"))

                .route(r -> r.path("/users/**")
                        .filters(f -> f.rewritePath("/users/(?.*)", "/${remains}")
                                .hystrix(c -> c.setName("hystrix")
                                        .setFallbackUri("forward:/fallback/second")))
                        .uri("lb://SERVICE-USERS")
                        .id("service-users"))
                .build();
    }

/**
 * spring
 * 	cloud:
 * 		gateway:
 * 		  routes:
 * 		  - id: first-service
 * 			uri: lb://FIRST-SERVICE
 * 			predicates:
 * 			- Path=/api/v1/first/**
 * 			filters:
 * 			- RewritePath=/api/v1/first/(?.*), /$\{remains}
 * 			- AddRequestHeader=X-first-Header, first-service-header
 * 			- name: Hystrix
 * 				args:
 * 				  name: hystrix
 * 				  fallbackUri: forward:/fallback/first
 */
//    @Bean
////    public RouteLocator customRouteLocator(RouteLocatorBuilder builder, ThrottleGatewayFilterFactory throttle) {
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(r -> r.host("**.abc.org").and().path("/image/png")
//                        .filters(f ->
//                                f.addResponseHeader("X-TestHeader", "foobar"))
//                        .uri("http://httpbin.org:80")
//                )
//                .route(r -> r.path("/users/**")
//                        .filters(f ->
//                                f.addResponseHeader("X-AnotherHeader", "baz"))
//                        .uri("http://httpbin.org:80")
//                )
//                .route(r -> r.order(-1)
//                        .host("**.throttle.org").and().path("/get")
//                        .filters(f -> f.filter(throttle.apply(1,
//                                1,
//                                10,
//                                TimeUnit.SECONDS)))
//                        .uri("http://httpbin.org:80")
//                )
//                .build();
//    }


}
