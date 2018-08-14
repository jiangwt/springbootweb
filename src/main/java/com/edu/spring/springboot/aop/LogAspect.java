package com.edu.spring.springboot.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 日志切面
 * @author jiangwt02
 *
 */
@Aspect
@Component
public class LogAspect {
	
	//@Before(value = "execution(* com.edu.spring.springboot.service..*.*(..))")
	public void log(){
		System.out.println("method log done");
	}

}
