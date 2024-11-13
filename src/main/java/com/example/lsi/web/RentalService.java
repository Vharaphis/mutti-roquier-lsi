package com.example.lsi.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentalService {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello !";
    }
}
