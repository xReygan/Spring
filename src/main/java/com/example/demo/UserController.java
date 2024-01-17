package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final HelloUser helloUser;
    @Autowired
    public UserController(HelloUser helloUser) {
        this.helloUser = helloUser;
    }
    @GetMapping("/user")
    public String hello() {
        return this.helloUser.getHelloUser();
    }
}
