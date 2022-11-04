package com.kh.chap01_abstraction.model.vo;



/*
 * 클래스의 구조 
 * public class 클래스명 { 
 * 		
 * 	// 필드 부
 * 
 * 	// 생성자 부
 */
	


/*
 *	// 메소드 부
 *	public void method1() {
 *
 *
 *	}
 * 
 * 	}
 */


public class Student { // 학생을 추상화해서 만든 클래스 (완벽한 상태는 아님)
	// 필드 부!!!!!!!
	
	// 접근제한자 [예약어] 자료형 변수명 
	
	// 접근제한자 : 여기에 접근할 수 있는 범위를 제한하는 것
				 // public > protected > default > private

	public String name; // 이름
	public int age; // 나이
	public double height; // 키
	public int korScore;
	public int matScore;
	
	public Student() {
		System.out.println("Student 객체가 생성됐습니다.");
	}
	
	public Student(String name, double height, int korScore) {
		this.name = name;
		this.height = height;
		this.korScore = korScore;
	}
	
	public Student(String name, int age, double height, int korScore, int matScore) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.korScore = korScore;
		this.matScore = matScore;
	}

	
	public String information() {
		return "이름 : " + name + " 나이 : " + age + " 키 : " + height + " 국어점수 : " + korScore + " 수학점수 : " + matScore;
	}
}
