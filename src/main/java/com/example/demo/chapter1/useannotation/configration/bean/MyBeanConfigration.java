package com.example.demo.chapter1.useannotation.configration.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyBeanConfigration {

	@Bean(initMethod="init", destroyMethod="destroy")
	@Scope("prototype")
	public MyBean myBean() {
		return new MyBean();
	}
}
