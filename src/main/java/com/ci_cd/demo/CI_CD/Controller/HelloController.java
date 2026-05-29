package com.ci_cd.demo.CI_CD.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from CI/CD pipeline!";
    }

    @GetMapping("/status")
    public String status() {
        return "Application is running!";
    }
}