package com.example.demo.chapter1.annotation.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTest {
	
	@RequestMapping("/restControllerTest")
	public Map get () {
		HashMap<String, Object> map = new HashMap<>();
		map.put("姓名", "张三");
		map.put("年龄", 22);
		map.put("课程", new String[] {"数据结构", "Spring Boot", "Redis"});
		return map;
	}
}
