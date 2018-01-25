package com.example.demo.chapter1.annotation.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

//原型
@Service
@Scope("prototype")
public class PrototypeScope {
	public PrototypeScope() {
		
	}
}
