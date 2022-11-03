package com.kh.chap02_encapsulation.model.vo;

public class Student { // Student라는 건 나만의 자료형

	// 필드 부 선언

	// 접근제한자 자료형 변수명
	private String name;
	private int age;
	private double height;
	private int korScore;
	private int matScore;

	// 생성 부 선언

	// 메소드 부 선언

	/*
	 * 메소드 [표현법] 접근제한자 변환형 메소드명([매개변수]) { ...실행할 코드 }
	 * 
	 * 
	 * 
	 * 
	 * public void method1(int a) { // 매개변수 : 전달되는 변수 int b = 10; // 일반변수
	 * 
	 * }
	 */

	// - setter 메소드
	// 해당 필드에 대입시키고자 하는 값 전달 받아 해당 필드에 대입시켜주는 기능의 메소드

	/*
	 * public void setName(String newName) { // 매개변수 : 해당 메소드 호출시 전달값을 받아주기 위한 변수
	 * 선언문(해당 메소드 내에서만 사용 가능) name = newName;
	 * 
	 * }
	 */

	public void setName(String name) { // 관례적인 표현, 필드부와 동일하게
		// name = name; // 색이 똑같아..
		// 필드명과 매개변수명이 동일한 시점에서는 해당 메소드 영역에서 만들어진 변수가 우선순위가 더 노음
		// 필드name = 매개변수name; => 이걸 원함!!!!!
		// this를 사용해서 구별하자
		this.name = name; // 색차이

	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public void setMatScore(int matScore) {
		this.matScore = matScore;
	}

	// = getter 메소드
	// 해당 필드에 담긴 값을 반환해주는 역할 수행

	public String getName() { // void 아니다. 어떤 자료형을 던져줄지 써줘야함
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public int getKorScore() {
		return korScore;
	}

	public int getMatScore() {
		return matScore;
	}

}
