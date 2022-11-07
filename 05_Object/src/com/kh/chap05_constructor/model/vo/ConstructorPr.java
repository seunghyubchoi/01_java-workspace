package com.kh.chap05_constructor.model.vo;

public class ConstructorPr {
	// 필드부

	private String animeTitle;
	private String name;
	private int age;
	private double height;

	// 생성자부
	public ConstructorPr() {
		this("나루토", "사스케", 15, 199);
	}

	public ConstructorPr(String animeTitle, String name, int age, double height) {
		this.animeTitle = animeTitle;
		this.name = name;
		this.age = age;
		this.height = height;
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

	public String information() {
		return "만화 제목 : " + animeTitle + " 이름 : " + name + " 나이 : " + age + " 키 : " + height;
	}
}
