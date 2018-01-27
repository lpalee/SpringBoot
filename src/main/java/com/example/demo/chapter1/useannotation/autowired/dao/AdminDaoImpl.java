package com.example.demo.chapter1.useannotation.autowired.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("autowiredAdminDaoImpl")
@Scope("prorotype")
public class AdminDaoImpl implements IDao {

	@Override
	public String get() {
		return "@Autowired注解实现自动装配 - AdminDaoImpl";
	}
}
