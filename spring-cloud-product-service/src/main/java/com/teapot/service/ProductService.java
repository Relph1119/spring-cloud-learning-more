package com.teapot.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductService {

    @GetMapping("/product/{id}")
    public String findById(@PathVariable("id") int id) {
        return "SUCCESS";
    }
}
