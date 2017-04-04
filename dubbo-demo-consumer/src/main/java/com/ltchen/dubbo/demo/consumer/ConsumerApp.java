package com.ltchen.dubbo.demo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ltchen.dubbo.demo.api.DemoService;

public class ConsumerApp {

	public static void main(String[] args) {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "dubbo-demo-consumer.xml" });  
        context.start();  
        DemoService demoService = (DemoService) context.getBean("demoService");  
        System.out.println(demoService.sayHello("World"));  
        context.close();  
    }
}
