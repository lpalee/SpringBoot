package com.example.demo.chapter1.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class ControllerTest {
	
	/**
	 * http://localhost:8080/test
	 * 返回字符串, 默认是视图的名称
	 * 1.Spring Boot的视图默认保存路径是：resources/templates
	 * 2.视图后缀根据选用的视图模板决定，如ftl,html
	 * 2.本方法返回的视图是：resources/templates/html/index.ftl
	 * */
	public String getX() {
		return "/html/index";
	}
	
	/**
	 * http://localhost:8080/test/get.do
	 * 
	 * 方法上的@RequestMapping会继承在类上的@RequestMapping
	 * */
	@RequestMapping("/index.do")
	public String getY() {
		return "/html/index";
	}
	
	/**
	 * http://localhost:8080/test/welcome/index.do
	 * http://localhost:8080/test/welcome/hello.do
	 * 
	 * 路径匹配
	 * */
	@RequestMapping("/welcome/*.do")
	public String getZ() {
		return "/html/welcome";
	}
}
