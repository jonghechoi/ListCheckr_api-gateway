package com.example.apigateway.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class Gateway {

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(p -> p
//                        .path("/api/todolists")
////                        .filters(f -> f.addRequestParameter())
//                        .uri("http://localhost:8081/todolists/todolist/users/{user}"))
//                .build();
//    }
}
