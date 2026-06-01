package com.chelseapeeradon.firstapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControllers {

    @GetMapping("/")
    public String display(){
        return "Hello spring Boot";
    }
    @GetMapping("/about")
    public String about(){
        return "about I'm Peeradon";
    }
    @GetMapping("/api")
    public String api(){
        return "Test API";
    }

}
