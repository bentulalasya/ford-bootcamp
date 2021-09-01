package com.ford.bootcamp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/test")
    public String print() {
        return "Hello World";
    }
}
