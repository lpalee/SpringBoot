package com.example.demo.chapter1.useannotation.autowired.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("autowiredUserDaoImpl")
@Scope("prototype")
public class UserDaoImpl implements IDao {

	public String get() {
		return "@Autowired注解实现自动装配";
	}

}
