package com.edu.spring.springboot.dao;

public interface IUserDao {
	
	public void addUser(String name);

	public void addUserBatch(String ... names);
}
