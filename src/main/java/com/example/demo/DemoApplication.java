package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.chapter1.annotation.IUser;
import com.example.demo.chapter1.annotation.service.UserServiceImpl;
import com.example.demo.chapter1.annotation.service.UserServiceImplWithParam;

/**
 * @SpringBootApplication是Sprnig Boot项目的核心注解，主要目的是开启自动配置
 * 
 * @SpringBootApplication = @SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan
 * 1.@SpringBootConfiguration：应用了@Configuration，表明本类使用Spring基于Java的配置
 * 2.@EnableAutoConfiguration：能够自动配置spring的上下文，试图猜测和配置你想要的bean类，通常会自动根据你的类路径和你的bean定义自动配置
 * 3.@ComponentScan：用注解配置实现自动扫描，会自动扫描指定包下的全部标有@Component的类，并注册成bean，最终将这些bean定义加载到IoC容器中，当然包括@Component下的子注解@Service,@Repository,@Controller
 * 
 * 默认SpringBoot实现会从声明@ComponentScan所在类的包进行扫描
 * 所以SpringBoot的启动类最好是放在root package下，因为默认不指定basePackages
 * 
 * main方法这是一个标准的Java应用的main的方法，主要作用是作为项目启动的入口
 * */
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
