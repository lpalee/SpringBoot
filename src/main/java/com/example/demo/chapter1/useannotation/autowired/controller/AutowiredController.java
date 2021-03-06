package com.example.demo.chapter1.useannotation.autowired.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.chapter1.useannotation.autowired.service.IService;

/**
 * 控制层
 * 
 * 1.控制层使用@RestController注解标注，返回json格式的字符串
 * 2.获取业务层返回的数据，输出到客户端
 * 3.请求：http:localhost:8080/autowiredController
 * */
@RestController
public class AutowiredController {
	@Autowired()
	@Qualifier("autowiredUserServiceImpl")
	private IService service;
	
	@RequestMapping("/autowiredController")
	public String get () {
		return service.get();
	}
}
