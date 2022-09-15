package com.teapot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEureka1ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEureka1ServerApplication.class, args);
    }

}
