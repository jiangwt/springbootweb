package com.edu.spring.springboot.service.impl;

import org.springframework.stereotype.Service;

import com.edu.spring.springboot.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	public void getUser() {
		System.out.println("get user");
	}

	
	
}
