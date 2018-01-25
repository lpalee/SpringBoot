package com.example.demo.chapter1.annotation.component;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.chapter1.annotation.IUser;

@SpringBootApplication
public class ComponentApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ComponentApplication.class, args);
		
		IUser userComponentImpl1 = (UserComponentImpl)context.getBean("userComponentImpl");
		System.out.println(userComponentImpl1.get());
		
		IUser userComponentImpl2 = (UserComponentImplWithParam)context.getBean("componentBeanId");
		System.out.println(userComponentImpl2.get());
	}
}
