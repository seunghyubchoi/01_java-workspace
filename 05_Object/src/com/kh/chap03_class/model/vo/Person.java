package com.kh.chap03_class.model.vo;

public class Person {
	private String id;
	private String name;
	private int age;
	private double height;
	private char gender;
	private String pwd;
	private int birth;
	

	private String phone;
	private String email;
	
	public Person() {
		System.out.println("Person 객체가 생성됐습니다.");
	}
	
	public Person(String name, String pwd, int age, String phone) {
		this.name = name;
		this.pwd = pwd;
		this.age = age;
		this.phone = phone;
	}
	
	public Person(String id, String pwd, String name, int age, char gender, String phone, String email) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}
	
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
	
	public String information() {
		return "ID: " + id + " Password: " +   pwd  + " Name: " +  name + " Age: " +  age + " Gender: " +  gender + " Phone: " +  phone + " Email: " +  email;
	}
	
	
}
