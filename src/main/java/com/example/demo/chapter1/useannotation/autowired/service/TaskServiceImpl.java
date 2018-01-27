package com.example.demo.chapter1.useannotation.autowired.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.demo.chapter1.useannotation.autowired.dao.ITask;

@Service("autowiredTaskServiceImpl")
@Scope("prototype")
public class TaskServiceImpl implements IService {
	
	/**
	 * 接口ITask没有实现类
	 * 添加required=false不报错
	 * */
	@Autowired(required=false)
	private ITask task;

	@Override
	public String get() {
		return task.get();
	}
}
