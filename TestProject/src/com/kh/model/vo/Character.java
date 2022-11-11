package com.kh.model.vo;

public class Character {
	// 필드부
	private String animeTitle;
	private String name;
	private int age;
	private double height;
	private char gender;

	// 생성자부
	public Character() {
		System.out.println("이 것은 Character 기본 생성자입니다.");
	}
	
	public Character(String animeTitle, String name, int age, double height, char gender) {
		this.animeTitle = animeTitle;
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
	}

	// 메소드부
	public void setAnimeTitle(String animeTitle) {
		this.animeTitle = animeTitle;
	}

	public String getAnimeTitle() {
		return animeTitle;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;

	}

	public int getAge() {
		return age;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public char getGender() {
		return gender;
	}
	
	public String information() {
		return "만화 제목 : " + animeTitle + " 이름 : " + name + " 나이 : " + age + " 키 : " + height + " 성별 : " + gender;
	}

}
