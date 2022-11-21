package com.kh.chap02_set.part01_hashSet.model.vo;

public class Student {
	private String name;
	private int age;
	private int score;

	public Student() {

	}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected int getScore() {
		return score;
	}

	protected void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	/*
	 * @Override public int hashCode() { 
	 * // 모든 필드에 담긴 값이 일치하면 동일한 hashCode 반환 하도록 재정
	 * 
	 * String str = name + age + score; 
	 * // "공유43100", "차은우2685", "주지훈2420", "공유43100" 
	 * 
	 * return str.hashCode(); 
	 * // 문자열을 가지고 주소를 만들게 끔 바꿔 준겨, 따라서 글자가 같으면 같은 주소 값을 갖게 함
	 * 
	 * }
	 * 
	 * @Override public boolean equals(Object obj) {
	 * 
	 * // 현재 객체와 전달 받은 객체의 각 필드 값이 모두 일치하면 true, 
	 * // 하나로 일치하지 않으면 false 반환 
	 * // this(현재 객체) vs obj(전달 받은 객체 : 매개변수) 
	 * // this.name vs obj.name 일치하는지 보자 
	 * // this.age vs obj.age 
	 * // this.score vs obj.score
	 * 
	 * Student other = (Student) obj;
	 * 
	 * if (this.name.equals(other.name) && this.age == other.age && this.score == other.score) { 
	 * return true; }
	 * else {
	 * return false; }
	 */

	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}

}
