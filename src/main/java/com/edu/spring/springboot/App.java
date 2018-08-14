package com.edu.spring.springboot;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.edu.spring.springboot.config.ConfigFile;
import com.edu.spring.springboot.service.IUserService;
import com.edu.spring.springboot.service.impl.UserServiceImpl;

@SpringBootApplication
@EnableTransactionManagement//启用事务
public class App {
	
//	@Autowired
//	private static Environment env;
	
	public static void main(String[] args) throws SQLException {
		ConfigurableApplicationContext context = SpringApplication.run
				(App.class, args);
		

//		ConfigFile config = context.getBean(ConfigFile.class);
//		config.show();
		DataSource ds = context.getBean(DataSource.class);
//		
		Connection conn = ds.getConnection();
////		
		System.out.println(conn.getCatalog());
		
		IUserService service = context.getBean(UserServiceImpl.class);
//		service.getUser();
		
		service.addUsers();
		
//		
		conn.close();
//		System.out.println(ds.getClass());
		
		context.close();
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
