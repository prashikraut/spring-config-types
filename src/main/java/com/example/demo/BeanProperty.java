package com.example.demo;

import com.example.demo.models.Tyre;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanProperty {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Tyre tyre = (Tyre)context.getBean("tyre");
        /*brand field is not set in the bean still we get the value as defined in
         the xml file */
        // to set the value the setter method in the class is used
        // this is called bean property
        System.out.println(tyre.toString());
    }
}
