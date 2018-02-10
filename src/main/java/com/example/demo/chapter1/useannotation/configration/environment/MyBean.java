package com.example.demo.chapter1.useannotation.configration.environment;

public class MyBean {
	private String port;
	
	public String get() {
		return "端口号： " + getPort();
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}
}
