package com.example.demo.chapter1.annotation.component;

import org.springframework.stereotype.Component;

import com.example.demo.chapter1.annotation.IUser;

@Component
public class UserComponentImpl implements IUser {
	private String name = "UserComponentImpl";
	
	@Override
	public String get() {
		return name;
	}

}
