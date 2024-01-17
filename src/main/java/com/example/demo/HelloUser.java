package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class HelloUser {
    public String getHelloUser() {
        return "Привет тебе, о " + User.getName() + "!!!";
    }
}
