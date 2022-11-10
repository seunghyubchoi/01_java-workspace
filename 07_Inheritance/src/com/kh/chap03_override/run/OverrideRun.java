package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		
		Book bk1 = new Book("수학의 정석", "나수학", 100);
		Book bk2 = new Book("칭찬은 고래도 춤추게 한다", "고래", 300);
		
		System.out.println(bk1);
		System.out.println(bk2);
		
		// 출력문에 레퍼런스(bk1, 참조자료형)를 출력하고자 할 때 JVM이 자동으로 해당 레퍼런스.toString() 메소드 호출
		// 주소값이 있는 경우에는 레퍼런스라고 부름(참조를 해서 읽음)
		
		// 오버라이딩 전 : Object 클래스의 toString() 메소드를 실행 => 풀 클래스명 + @ + 객체의 주소값 16진수 리턴
		// 오버라이딩 후 : 부모클래스에 있는건 잊고 자식클래스에 있는(Book 클래스) toString() 실행
		// => 해당 객체가 가지고 있는 모든 필드값을 한 문자열로 합쳐 리턴
		
		
	}

}
