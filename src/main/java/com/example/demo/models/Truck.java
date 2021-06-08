package com.example.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Truck {

    // autowiring the defined bean
    @Autowired
    private Tyre tyre;

    public void displayTyre(){
        System.out.println(tyre.getBrand());
    }
}
