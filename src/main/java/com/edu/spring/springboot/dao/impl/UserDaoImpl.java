package com.edu.spring.springboot.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.edu.spring.springboot.dao.IUserDao;

@Repository
public class UserDaoImpl implements IUserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//	private static 
	public void addUser(String name){
		
		String sql="INSERT INTO employees (last_name,email,dept_id) values ('"+name+"','"+name+"',1);";
		this.jdbcTemplate.execute(sql);
	}
	
	
	@Transactional(rollbackFor=Exception.class)
	public void addUserBatch(String ... names){
		
		for (String name : names) {
			System.out.println(name);
//			String sql="INSERT INTO employees (last_name,email,dept_id) values ('"+name+"','"+name+"',1);";
//			this.jdbcTemplate.execute(sql);
		}
	}
	
	
}
