package com.example.demo.models;

public class Car implements Vehicle{
    @Override
    public void run() {
        System.out.println("Running car");
    }
}
