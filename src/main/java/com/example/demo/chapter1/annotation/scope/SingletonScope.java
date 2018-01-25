package com.example.demo.chapter1.annotation.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

// 单例
@Service
@Scope("singleton")
public class SingletonScope {
	public SingletonScope() {
		
	}
}
