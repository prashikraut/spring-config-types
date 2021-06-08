package com.example.demo;

import com.example.demo.models.Bike;
import com.example.demo.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Annotation based configuration
public class AnnotationConfig {

    private static Vehicle vehicle;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // getBean returns a Object thus typecasting it to Vehicle
        // bike is not defined in XML file but @Component in used in bike class to define it a bean
        // this is called as depenedency injection
        // default name of bean is name of class starting in small letter
        Vehicle vehicle = (Vehicle)context.getBean("bike");
        vehicle.run();
    }

}
