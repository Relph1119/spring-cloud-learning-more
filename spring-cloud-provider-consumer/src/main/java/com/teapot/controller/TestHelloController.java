package com.teapot.controller;

import com.teapot.service.IHelloControllerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHelloController {

    @Autowired
    IHelloControllerFeign helloControllerFeign;

    @GetMapping("/hello")
    public String test() {
        return helloControllerFeign.sayHello();
    }

}
