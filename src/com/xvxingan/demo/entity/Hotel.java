package com.xvxingan.demo.entity;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class Hotel implements Org{
	public String name;
	public String location;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	 
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Hotel [name=" + name + ", location=" + location + "]";
	}
	 
}
