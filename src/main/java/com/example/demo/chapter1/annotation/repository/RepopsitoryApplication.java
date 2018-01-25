package com.example.demo.chapter1.annotation.repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// @Repository注解测试

@SpringBootApplication
public class RepopsitoryApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RepopsitoryApplication.class, args);
		
		UserRepositoryImpl userRepositoryImpl1 = (UserRepositoryImpl) context.getBean("userRepositoryImpl");
		UserRepositoryImpl userRepositoryImpl2 = (UserRepositoryImpl) context.getBean("userRepositoryImpl");
		System.out.println("@Repository注解默认作用域为singleton，返回true： " + userRepositoryImpl1.equals(userRepositoryImpl2));
	}
}
