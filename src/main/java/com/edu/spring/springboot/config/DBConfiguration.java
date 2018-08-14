package com.edu.spring.springboot.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 数据库配置类
 * @author jiangwt02
 *
 */
@SpringBootConfiguration
public class DBConfiguration {
	
	@Autowired
	private Environment env;
	
	@Bean
	public DataSource createDataSource(){
		//
		DruidDataSource ds = new DruidDataSource();
		ds.setUrl(env.getProperty("spring.datasource.url"));
		ds.setUsername(env.getProperty("spring.datasource.username"));
		ds.setPassword(env.getProperty("spring.datasource.password"));
		ds.setDriverClassName(env.getProperty("spring.datasource.driverClassName"));
		
		return ds;
	}

}
