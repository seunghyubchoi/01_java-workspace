package com.kh.chap03_class.model.vo;

public class Person {

	// 1. 필드 선언
	
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;

	// 나이, 성별, 전화번호, 이메일 => age, gender, phone(-포함), email

	// 메소드 선언

	// 2. setter 만들기 (setter는 반환값 없고 매개변수 있음, this 적어주기)

	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	// 3. getter 만들기 (getter는 반환값 있고 매개변수 없음, return 적어주기)

	public String getId() {
		return id;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
}
