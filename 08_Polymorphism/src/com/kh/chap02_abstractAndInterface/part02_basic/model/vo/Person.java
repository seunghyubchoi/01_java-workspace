package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public abstract class Person implements Basic {
	// 필드부
	private String name;
	private double weight;
	private int health;

	// 생성자부
	public Person() {

	}

	public Person(String name, double weight, int health) {
		super();
		this.name = name;
		this.weight = weight;
		this.health = health;
	}

	// 메소드부

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "name=" + name + ", weight=" + weight + ", health=" + health;
	}
}

/*
 * public abstract class Person implements Basic{ // Basic에 있는 함수를 구현하는 Person
 * 
 * private String name; private double weight; private int health;
 * 
 * public Person() {
 * 
 * }
 * 
 * public Person(String name, double weight, int health) { super(); this.name =
 * name; this.weight = weight; this.health = health; }
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * public double getWeight() { return weight; }
 * 
 * public void setWeight(double weight) { this.weight = weight; }
 * 
 * public int getHealth() { return health; }
 * 
 * public void setHealth(int health) { this.health = health; }
 * 
 * @Override public String toString() { return "name=" + name + ", weight=" +
 * weight + ", health=" + health; }
 * 
 * //public abstract void eat(); //public abstract void sleep(); }
 * 
 */
