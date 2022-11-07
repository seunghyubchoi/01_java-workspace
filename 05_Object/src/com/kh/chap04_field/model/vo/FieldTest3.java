package com.kh.chap04_field.model.vo;

// 클래스 변수 (Static 변수), 상수 필드에 대해서 알아보자
public class FieldTest3 {
	
	// static 공유의 개념
	// static이 붙은 애들은 프로그램 실행과 동시에 메모리의 static 영역에 올라감!!!
	// 프로그램 실행과 동시에 메모리 상에 한 번 올려놓고 여기저기서 가져다 쓰는 개념
	// public이랑 같이 쓰자~~!
	
	public static String sta = "static FieldTest3"; // 기울임 : static
	 
	// 상수필드(static final) : 프로그램 시작시 값이 저장되면 더 이상 절대 변경 불가!!!
	public static final String STA_FIN = "static final";  // 기울임 + 굵음 : fianl static
	
	
}
