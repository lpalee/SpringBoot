package com.example.demo.chapter1.useannotation.configration.propertysource;

public class MyBean {
	private String userName;
	
	private String passWord;
	
	public MyBean(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public String get() {
		return "用户名：  " + this.userName + ",  密码 ： " + this.passWord;
	}
}
