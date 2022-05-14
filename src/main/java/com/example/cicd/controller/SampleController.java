package com.example.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("")
    public String hello() {
        return "hello you - 1";
    }

    @GetMapping("/test")
    public String test() {
        return "hello you test";
    }
}
