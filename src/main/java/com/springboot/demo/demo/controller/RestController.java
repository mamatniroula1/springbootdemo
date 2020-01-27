package com.springboot.demo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/")
    public String helloWorld(){
        return "hello world Time on the server is"+ LocalDateTime.now();
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "today is your lucky day";
    }
}
