package com.xvxingan.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xvxingan.demo.entity.User;
 

 

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext ctx =  new ClassPathXmlApplicationContext( "beans.xml" );
		User user = ctx.getBean(User.class);
		System.out.println(user);
	}

}
