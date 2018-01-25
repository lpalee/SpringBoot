package com.example.demo.chapter1.annotation.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.DemoApplication;
import com.example.demo.chapter1.annotation.IUser;

@SpringBootApplication
public class ServiceApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		IUser serviceImpl1 = (UserServiceImpl) context.getBean("userServiceImpl");
		System.out.println(serviceImpl1.get());
		
		IUser serviceImpl2 = (UserServiceImplWithParam)context.getBean("userService");
		System.out.println(serviceImpl2.get());
	}
}

