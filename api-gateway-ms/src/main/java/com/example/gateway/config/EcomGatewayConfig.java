//package com.example.gateway.config;
//
//import com.example.gateway.filter.AuthenticationFilter;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class EcomGatewayConfig {
//
//    @Bean
//    public RouteLocator routeLocator(RouteLocatorBuilder builder,AuthenticationFilter authenticationFilter) {
//
//        return builder.routes()
//                .route("order-service", r -> r.path("/orders/**").filters(f -> f.filter(authenticationFilter))
//                        .and()
//                        .uri("lb://ORDER-SERVICE-MS"))
//
//                .route("payment-service", r -> r.path("/payments/**")
//                        .and()
//                        .uri("lb://PAYMENT-SERVICE-MS"))
//
//                .route("user-service", r -> r.path("/users/**")
//                        .and()
//                        .uri("lb://USER-SERVICE-MS"))
//
//
//                .route("auth-service", r-> r.path("/auth/**")
//                        .filters(f -> f.filter(authenticationF))
//                        .and().uri("lb://AUTH-SERVICE-MS"))
//
//                .build();
//
//    }
//}