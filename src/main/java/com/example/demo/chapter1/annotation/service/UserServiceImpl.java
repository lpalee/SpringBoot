package com.example.demo.chapter1.annotation.service;

import org.springframework.stereotype.Service;

import com.example.demo.chapter1.annotation.IUser;

@Service
public class UserServiceImpl implements IUser {
	private final String name = "UserServiceImpl";
	
	public String get () {
		return name;
	}
}
