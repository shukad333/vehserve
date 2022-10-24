package com.logic.job.sabrez.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {


    @GetMapping("/health")
    public String getHealth() {
        return "Hello";
    }



}
