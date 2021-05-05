package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRest {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }
}
