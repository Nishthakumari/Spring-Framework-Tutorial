package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aloneconfig.xml");
        Person person1 = (Person) context.getBean("person1");
        System.out.println(person1);
        System.out.println(person1.getFriends().getClass().getName());
    }
}
