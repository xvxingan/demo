package com.xvxingan.demo.entity;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogInterceptor {
	@Pointcut("execution(public * com.xvxingan.demo..*.works( ))")
	public void log(){}
	
	@Before("log()")
	public void before(JoinPoint jp){
		System.out.println("before " +jp.getTarget().getClass()+"."+ jp.getSignature().getName()+" invoked");
 	}
	@After("log()")
	public void after(JoinPoint jp){
		System.out.println("after " +jp.getTarget().getClass()+"."+ jp.getSignature().getName()+" invoked");
	}
	@Around("log()")
	public void around(ProceedingJoinPoint jp){
		System.out.println("around-before " +jp.getTarget().getClass()+"."+ jp.getSignature().getName()+" invoked");
		try {
			jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("around-after " +jp.getTarget().getClass()+"."+ jp.getSignature().getName()+" invoked");
		
	}
	 
}
