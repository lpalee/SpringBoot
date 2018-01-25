package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.chapter1.annotation.IUser;
import com.example.demo.chapter1.annotation.service.UserServiceImpl;
import com.example.demo.chapter1.annotation.service.UserServiceImplWithParam;

@SpringBootApplication
@RestController
public class DemoApplication {
	
	@RequestMapping("/test")
	public String test() {
		return "Hello Spring Boot";
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		IUser serviceImpl1 = (UserServiceImpl) context.getBean("userServiceImpl");
		System.out.println(serviceImpl1.get());
		
		IUser serviceImpl2 = (UserServiceImplWithParam)context.getBean("userService");
		System.out.println(serviceImpl2.get());
	}
}
