package com.thoughtworks.capability.gtb.alice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BobController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Bob!";
    }
}