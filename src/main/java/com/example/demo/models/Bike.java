package com.example.demo.models;

import org.springframework.stereotype.Component;

// defining the class a bean
@Component
public class Bike implements Vehicle{
    @Override
    public void run() {
        System.out.println("Running bike");
    }
}
