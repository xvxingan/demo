package com.xvxingan.demo.entity;

import org.springframework.stereotype.Component;


public class School implements Org{
	@Override
	public String toString() {
		return "School [name=" + name + ", age=" + age + "]";
	}

	private String name;
	private int age;
 

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
