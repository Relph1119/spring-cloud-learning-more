package com.teapot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/test")
    public String test(){
        // 1. 调用Eureka DiscoveryClient
        return restTemplate.getForObject("http://spring-cloud-provider-service/hello", String.class);
    }
}
