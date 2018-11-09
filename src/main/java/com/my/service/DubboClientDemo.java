package com.my.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by kyle on 2018/11/9.
 */
public class DubboClientDemo {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo-client.xml");
        context.refresh();
        context.start();
        IHelloService helloService =(IHelloService) context.getBean("helloService");
        String str = helloService.sayHello(" kyle-baby ");
        System.out.println(str);
        System.in.read();//blocking here

    }
}
