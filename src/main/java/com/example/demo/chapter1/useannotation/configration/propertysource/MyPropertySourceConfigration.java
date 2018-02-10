package com.example.demo.chapter1.useannotation.configration.propertysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:properties/app.properties")
public class MyPropertySourceConfigration {
	
	@Autowired
	private Environment environment;
	
	@Bean("myPSBean")
	public MyBean myBean() {
		MyBean myBean = new MyBean(environment.getProperty("jdbc.username", "请设置用户名"), environment.getProperty("jdbc.password", "请设置密码"));
		return myBean;
	}
}
