package com.example.passingsimpledata;

import java.io.Serializable;

public class User implements Serializable {
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	String name;
	double age;
	public User(String name, double age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
