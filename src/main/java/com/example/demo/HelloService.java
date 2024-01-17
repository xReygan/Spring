package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String getGreeting() {
        return "Да здравстует большой Мир!!!";
    }
}
