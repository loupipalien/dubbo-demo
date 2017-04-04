package com.ltchen.dubbo.demo.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderApp {

	public static void main(String[] args) throws IOException {  
		  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( new String[] { "dubbo-demo-provider.xml" });  
        context.start();  
  
        System.out.println("输入任意按键退出 ~ ");  
        System.in.read();  
        context.close();  
    } 
}
