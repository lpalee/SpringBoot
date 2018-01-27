package com.example.demo.chapter1.useannotation.autowired.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.chapter1.useannotation.autowired.service.IService;

/**
 * http:localhost:8090/requirdController
 * */
@RestController
public class RequirdController {
	@Autowired
	@Qualifier("autowiredTaskServiceImpl")
	private IService service;

	@RequestMapping("requirdController")
	public String get () {
		return service.get();
	}
}
