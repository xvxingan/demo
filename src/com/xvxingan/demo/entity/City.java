package com.xvxingan.demo.entity;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class City {
	private Org org;
	
	private Hotel hotel;
	public Hotel getHotel() {
		return hotel;
	}
	@Resource
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Org getOrg() {
		return org;
	}
	@Resource(name="school")
	public void setOrg(  Org org) {
		this.org = org;
	}
	@Override
	public String toString() {
		return "City [org=" + org + ", hotel=" + hotel + "]";
	}
 
	public void works(){
		System.out.println("the city wake up");
	}
	 
}
