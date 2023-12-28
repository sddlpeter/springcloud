package com.powernode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerEApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerEApplication.class, args);
    }
}
