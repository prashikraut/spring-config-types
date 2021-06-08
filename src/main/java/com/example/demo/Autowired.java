package com.example.demo;

import com.example.demo.models.Truck;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowired {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // the tyre object in the truck class is autowired to bean tyre
        Truck truck = (Truck)context.getBean("truck");
        truck.displayTyre();
    }
}
