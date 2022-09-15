package com.teapot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/product/{id}")
    public String queryProductInfo(@PathVariable("id") int id) {
        // 1. 根据名字获取服务提供者的地址信息
        return restTemplate.getForObject("http://spring-cloud-product-service/product/" + id, String.class);
    }
}
