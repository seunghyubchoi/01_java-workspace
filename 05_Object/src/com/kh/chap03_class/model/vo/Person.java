package com.kh.chap03_class.model.vo;

public class Person {
	private String name;
	private int age;
	private double height;
	private char gender;
	private int birth;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
		
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public char getGender() {
		return gender;
	}
	public int getBirth() {
		return birth;
	}
}
