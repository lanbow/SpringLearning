package com.leo.spring.aop;


/**
 * Created by Joker on 15/1/24.
 */

public class JimHello implements Hello {
    @Override
    public void sayHello() {
        System.out.println("Jim say hello!");
    }

}
