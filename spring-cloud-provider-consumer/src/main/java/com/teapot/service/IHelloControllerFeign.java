package com.teapot.service;

import com.teapot.config.FeignLogConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "spring-cloud-provider-service", configuration = FeignLogConfig.class)
public interface IHelloControllerFeign {

    @GetMapping("/hello")
    String sayHello();
}
