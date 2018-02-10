package com.example.demo.chapter1.useannotation.configration.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class MyEnvironmentConfigration {
	
	@Autowired
	private Environment environment;
	
	@Bean("myEnvBean")
	public MyBean myBean() {
		MyBean myBean = new MyBean();
		myBean.setPort(environment.getProperty("server.port", "8080"));
		return myBean;
	}
}
