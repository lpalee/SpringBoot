package com.example.demo.chapter1.annotation.service;

import org.springframework.stereotype.Service;

import com.example.demo.chapter1.annotation.IUser;

//@Service("userService")
@Service(value="userService")
public class UserServiceImplWithParam implements IUser {
	private String name = "UserServiceImplWithParam";

	public String get() {
		return name;
	}
}
