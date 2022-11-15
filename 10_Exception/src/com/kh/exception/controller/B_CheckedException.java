package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	/*
	 * CheckedException은 반드시 예외처리를 해야하는 예외들 => 조건문 미리 제시할 수 없음 => 왜? 예측이 불가한 곳에서 문제가
	 * 발생하기 때문에 미리 예외처리 구문을 작성해야함 => 외부 매개체와 입출력이 일어날 때 발생! (IOException)
	 */

	public void method1() throws IOException { // 여기서도 떠넘길 수 있음, 끝까지 떠넘기면 JVM이 처리(권장ㄴ)
		//method2();
		
		try {
			method2();
		} catch(IOException e) {
			System.out.println("예외가 발생했습니당");
		}
		
	}

	public void method2() throws IOException {
		
		// Scanner와 같이 키보드로 값을 입력 받을 수 있는 객체
		// 스캐너 이전의 방식 => 정수, 실수 안됨 무조건 문자만 받을 수 있음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("아무거나 입력해주세요 : ");
		
		// 1. try-catch : 여기 이 자리에서 곧바로 예외를 처리하겠다
		// try{} : 예외가 발생할 가능성이 있는 코드를 작성
		// catch() : () 안에 발생될 (예외 클래스 매개변수)
		// {} : try 구문 내에서 예외가 발생했을 경우 어떻게 처리할 것인지에 대한 내용 작성

		// String str = br.readLine(); // 컴파일 에러
		
		/*
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			System.out.println("예외가 발생했습니다");
		}
		*/
		
		// 2. throws : 지금 이 자리에서 예외를 처리하지 않고 현재 이 메소드를 호출하는 곳으로 예외처리 떠넘기겠다(위임)
		String str = br.readLine();
	}
	
	
	
	
	
	
	/*
	 * 										예외 클래스 					예외 발생 시점						예외 처리
	 * UnCheckedException				RuntimeException				런타임에러						선택(개발자가 케바케로처리, if문을통해 애초에 예외가 발생 안되도록 / 예외처리구문)
	 * CheckedException					RuntimeException 외				컴파일에러(빨간줄)				필수!(조건문 안됨 => 언제 에러 발생할지 모르기 때문에 무조건 예외처리 구문으로)
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
