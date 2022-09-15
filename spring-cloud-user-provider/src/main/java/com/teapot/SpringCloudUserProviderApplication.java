package com.teapot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudUserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudUserProviderApplication.class, args);
    }

}
