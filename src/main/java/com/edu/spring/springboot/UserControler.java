package com.edu.spring.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.spring.springboot.service.IUserService;

@RestController
public class UserControler {
	
	
	@Autowired
	private IUserService userService;

	@GetMapping("/user/home")
	public String home(){
		
		userService.getUser();
		
		return "user home";
	}
	
}
