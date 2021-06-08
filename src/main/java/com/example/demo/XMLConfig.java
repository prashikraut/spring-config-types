package com.example.demo;

import com.example.demo.models.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// XML based configuration
public class XMLConfig {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // getBean returns a Object thus typecasting it to Vehicle
        // this is called as depenedency injection
        Vehicle vehicle = (Vehicle)context.getBean("vehicle");
        vehicle.run();
    }

}
