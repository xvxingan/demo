package com.xvxingan.demo.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.stereotype.Component;
@Component
public class User {
	private String name;
	private int age;
	private Properties props;
	private School school;
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	private List list;
	private Map map;
	
 
	public String getName() {
		return name;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public void setName(String name) {
 		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
 		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", props=" + props
				+ ", school=" + school + ", list=" + list + ", map=" + map
				+ "]";
	}
 
}
