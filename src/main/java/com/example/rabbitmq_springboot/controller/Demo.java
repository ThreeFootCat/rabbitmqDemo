package com.example.rabbitmq_springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @RequestMapping("/demo")
    public String DemoTest(){
        return "hello";
    }
}
