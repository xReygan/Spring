package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class User {
    private static String name;

    public User() {
        name = "Кот Базилио";
    }
    public static String getName() {
        return name;
    }
}
