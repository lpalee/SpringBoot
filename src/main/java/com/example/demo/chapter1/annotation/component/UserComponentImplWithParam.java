package com.example.demo.chapter1.annotation.component;

import org.springframework.stereotype.Component;

import com.example.demo.chapter1.annotation.IUser;

//@Component("componentBeanId")
@Component(value="componentBeanId")
public class UserComponentImplWithParam implements IUser {
	private String name = "UserComponentImplWithParam";
	
	@Override
	public String get() {
		return name;
	}

}
