package com.edu.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run
				(App.class, args);
		
		
//		context.close();
	}
	
	@Bean
	public Runnable createRunnable(){
		return new Runnable() {
			
			public void run() {
				System.out.println("spring boot is running");
				
			}
		};
	}

}
