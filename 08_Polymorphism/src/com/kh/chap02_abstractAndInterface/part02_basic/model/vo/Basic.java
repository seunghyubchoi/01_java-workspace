package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public interface Basic { // 인터페이스는 구현된 클래스가 어딘지 찾는다, 여기선 Person 
	//(public abstract class Person implements Basic)
	
	// 추상클래스(abstract class) : 일반필드 + 일반메소드 + [추상메소드] 추상메소드는 생략 가능
	// 인터페이스(interface)	: only 상수필드 + 추상메소드 
	
	// private int a;
	// public void test() {};
	
	// 인터페이스에서 필드는 무조건 상수 필드!!
	/*public static final*/ int NUM = 10; // 자바는 static이란 키워드 붙은 아이들부터 읽음, 생략 가능
	
	// 인터페이스에서 메소드는 무조건 추상메소드임!!
	/*public abstract*/ void eat(); // 생략 가능
	public abstract void sleep();
	
	// 자바가 실행하면서 static을 읽고 static 키워드가 붙은 애들을 모두 static 영역으로 넣어줍니다(ex. public static final ~ ..)
	// 그 후 stack 영역에 위치할 키워드를 읽고 stack 영역에 공간을 만듭니다(ex. Basic mom)
	// 그 후 heap 영역에 위치할 키워드 중에 상위 클래스를 찾고 heap 공간을 만듭니다.(ex. Person)
	// 그 후 heap 영역에 위치할 키워드 중에 하위 클래스를 찾고 heap 공간을 만듭니다.(ex. Mother)
	
	// 
}
