package com.edu.spring.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 读取配置文件数据
 * @author jiangwt02
 *
 */
@Component
public class ConfigFile {
	
	@Value("${spring.datasource.driverClassName}")
	private String driverClass;
	
	@Autowired
	private Environment env;

	public void show(){
		String s = env.getProperty("spring.datasource.driverClassName");
		System.out.println(s);
		System.out.println(driverClass);
	}
	
	
}
