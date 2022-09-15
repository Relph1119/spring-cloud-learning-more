package com.teapot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProductServiceApplication.class, args);
    }

}
