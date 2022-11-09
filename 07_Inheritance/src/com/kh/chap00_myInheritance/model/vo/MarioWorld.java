package com.kh.chap00_myInheritance.model.vo;

public class MarioWorld {
	private String name;
	private int age;
	private String job;
	private double height;
	private int income;
	private double bonus;

	public MarioWorld() {
		
	}

	public MarioWorld(String name, int age, String job, double height, int income, double bonus) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.height = height;
		this.income = income;
		this.bonus = bonus;
	}

	public String getName() {
		return name;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String information() {
		return "이름 = " + name + ", 나이 = " + age + ", 직업 = " + job + ", 신장 = " + height + ", 소득 = " + income + ", 보너스율 : " + bonus;
	} 
	
	
}
