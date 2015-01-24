package com.leo.spring.aop;



/**
 * Created by Joker on 15/1/24.
 */
public class JettyHello implements Hello {
    @Override
    public void sayHello() {
        System.out.println("Jetty say hello!");
    }

}
