package com.example.demo.chapter1.useannotation.configration;

public class MyBean {
	
	public void init() {
		System.out.println("MyBean开始初始化...");
	}
	
	public void destroy() {
		System.out.println("MyBean销毁...");
	}
	
	public String get() {
		return "MyBean使用...";
	}
}
