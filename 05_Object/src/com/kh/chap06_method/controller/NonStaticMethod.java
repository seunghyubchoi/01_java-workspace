package com.kh.chap06_method.controller;

public class NonStaticMethod {
	/*
	 * 메소드 한 기능을 처리하기 위한 용도 메소드는 소문자로 시작
	 * 
	 * 패키지명 : 소문자로 시작 클래스명 : 대문자로 시작 변수명 : 소문자로 시작 메소드명 : 소문자로 시작
	 * 
	 * 공통 : 낙타표기법(Camel case)
	 * 
	 * 
	 * 표현법!! 
	 * 접근 제한자 반환형(반환할 값의 자료형) 메소드명 ([매개변수1, 매개변수2...]) 
	 * { 수행내용 ; [return 결과값;]
	 * (void일 때는 return 값 없고, 반환할 값이 있으면 return 값 적어주기)
	 * 
	 * }
	 * 
	 */

	// 1. 매개변수 없고 반환값도 없는 메소드 : 매개변수 없고 void에 리턴값 없음
	public void method1() {
		// return 0; void이기 때문에 리턴 값 없음
		// 그냥 return; 만 사용하는 건 가능
		System.out.println("매개변수와 반환값이 둘다 없는 메소드 입니다.");
	}

	// 2. 매개변수 없고 반환값은 있는 메소드 : 괄호는 깨끗하되 void는 아니며 리턴 값 있음
	public String method2() {
		System.out.println("매개변수는 없고 반환값은 있는 메소드 입니다.");
		return "아나까나";
	}

	// 3. 매개변수는 있고 반환값은 없는 메소드 : void이고, 괄호에 무언가 있되 리턴 값 없음
	public void method3(int num1, int num2) {
		System.out.println("매개변수는 있고 반환값은 없는 메소드 입니다.");
		if (num2 != 0) {
			System.out.println("num1/num2 : " + num1 / num2);
		} else {
			System.out.println("0으로는 실행 노노");
		}
	}

	// 4. 매개변수도 있고 반환값도 있는 메소드
	// 문자열과 정수 값을 전달 받아서 해당 문자열의 해당 정수 인덱스의 문자 값을 뽑아서 반환
	// apple 전달받아서 2번 인덱스 뽑아줘 하면 [2]에 해당하는 p 출력
	public char method4(String str, int index) {
		System.out.println("매개변수와 반환 값 둘 다 있는 메소드 입니다");
		// if 일때도 리턴을 줘야함
		return str.charAt(index);
		/*if (index >= str.length() || index < 0) {
			return ' ';
		} else {
			return str.charAt(index);
		}*/
	}

}
