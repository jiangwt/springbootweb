package com.edu.spring.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.spring.springboot.dao.IUserDao;
import com.edu.spring.springboot.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDao userDao;

	public void getUser() {
		
		System.out.println("insert user ======");
		userDao.addUser("jiangwt88");
	}
	
	public void addUsers(){
		System.out.println("add Users ");
		userDao.addUserBatch("jiangwt","jwt");
	}

	
	
}
