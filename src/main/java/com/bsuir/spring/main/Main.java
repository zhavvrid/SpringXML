package com.bsuir.spring.main;

import com.bsuir.spring.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("string.xml");

        Service service = context.getBean("fibonacciService", Service.class);

        service.printFibonacci();
    }
}


