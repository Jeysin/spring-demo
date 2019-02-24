package com.jeysin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Jeysin
 * @Date: 2019/2/7 10:16
 * @Desc:
 */

public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:application.xml");
        Person person = (Person) context.getBean("student");
        person.sayHello();
    }
}
