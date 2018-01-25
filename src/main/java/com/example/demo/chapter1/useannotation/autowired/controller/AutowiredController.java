package com.example.demo.chapter1.useannotation.autowired.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.chapter1.useannotation.autowired.service.IService;

@RestController
public class AutowiredController {
	@Autowired
	private IService service;
	
	@RequestMapping("/autowiredController")
	public String get () {
		return service.get();
	}
}
