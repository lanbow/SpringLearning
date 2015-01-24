package com.leo.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Joker on 15/1/24.
 */
public class HelloDemo {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        ApplicationContext context=new ClassPathXmlApplicationContext("/spring/local/appcontext-aop.xml");
        Hello jim=(Hello)context.getBean("jim");
        Hello jetty=(Hello)context.getBean("jetty");
        jim.sayHello();
        jetty.sayHello();

    }
}
