package com.spring.microservice_eureka_naming_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceEurekaNamingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEurekaNamingServiceApplication.class, args);
    }

}
