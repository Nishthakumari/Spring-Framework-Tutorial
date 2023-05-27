package com.springcore.auto.wiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("atautowireconfig.xml");
        Emp emp1 = (Emp) context.getBean("emp1");
        System.out.println(emp1);

    }
}
