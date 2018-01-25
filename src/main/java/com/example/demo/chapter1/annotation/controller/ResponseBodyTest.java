package com.example.demo.chapter1.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bi")
public class ResponseBodyTest {
	
	@RequestMapping("/login")
	@ResponseBody
	public String get () {
		return "Hello Spring Boot!";
	}
}
