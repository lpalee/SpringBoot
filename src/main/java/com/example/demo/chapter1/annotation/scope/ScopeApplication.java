package com.example.demo.chapter1.annotation.scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ScopeApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ScopeApplication.class, args);
		
		SingletonScope singletonScope1 = (SingletonScope) context.getBean("singletonScope");
		SingletonScope singletonScope2 = (SingletonScope) context.getBean("singletonScope");
		System.out.println("singleton单例模式：" + singletonScope1.equals(singletonScope2));
		
		PrototypeScope prototypeScope1 = (PrototypeScope) context.getBean("prototypeScope");
		PrototypeScope prototypeScope2 = (PrototypeScope) context.getBean("prototypeScope");
		System.out.println("prototype原型模式：" + prototypeScope1.equals(prototypeScope2));
	}
}
