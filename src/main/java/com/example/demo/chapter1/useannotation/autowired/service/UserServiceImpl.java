package com.example.demo.chapter1.useannotation.autowired.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.demo.chapter1.useannotation.autowired.dao.IDao;

@Service("autowiredUserServiceImpl")
@Scope("prototype")
public class UserServiceImpl implements IService {
	@Autowired
	private IDao dao;

	@Override
	public String get() {
		return dao.get();
	}
}
