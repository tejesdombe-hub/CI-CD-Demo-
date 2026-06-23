package com.ci_cd.demo.CI_CD.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public String getUser() {
        return "User endpoint is working!";
    }

    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable String id) {
        return "User with ID: " + id;
    }

    @GetMapping("/user/profile")
    public String getUserProfile() {
        return "User profile endpoint is working!";
    }
}
