package com.powernode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientFApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientFApplication.class, args);
    }

}
