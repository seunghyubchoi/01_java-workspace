package com.kh.chap01.condition;
import java.util.Scanner;
public class A_If {
	/* 
	 * 기본적으로 프로그램 진행은 순차적으로 진행
	 * 단, 이 순차적인 흐름을 바꾸고자 한다면 제어문을 이용해서 직접 제어 가능
	 * 
	 * 선택적으로 실행시키고자 할 때 => 조건문
	 * 반복적으로 실행시키고자 할 때 => 반복문
	 * 그 외의 흐름을 제어 => 분기문
	 * 
	 * 조건문 : 
	 * "조건식"을 통해 참이냐 거짓이냐를 판단해서 참일 경우 그에 해당하는 코드 실행
	 * 
	 * 조건식의 결과 true / false 여야 한다
	 * 조건식에서는 비교연산자 (대소, 동등), 논리 연산자(==, ||)를 주로 사용
	 * 
	 * 조건문은 크게 if, switch문으로 나뉨
	 * 
	 * 
	 */
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		/* 단독 if문
		 * <표현법>
		 * if(조건식) {
		 * 	...실행시키고자 하는 코드..
		 * } 
		 * 
		 * (조건식)은 if랑 친하다!
		 * => 조건식이 참(true)일 경우, 중괄호 내의 코드 실행
		 * => 조건식이 거짓(false)일 경우, 중괄호 내의 코드 무시
		 */
		
		if(num > 0) {
			System.out.print("양수다");
		} 
		
		if(num <= 0) {
			System.out.print("양수가 아니다");
		}
		
		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num =  sc.nextInt();
		
		/* if else 문
		 * 
		 * <표현법>
		 * if(조건식){
		 * 	..실행코드 1..
		 * } else {
		 * 	..실행코드 2..
		 * }
		 * 
		 * => 조건식의 결과가 true일 경우, 실행코드 1 수행 후, if-else문 빠져나감
		 * => 단, 결과가 false일 경우, 무조건 실행코드 2 수행
		 * 조건 체크를 하나라도 더 하면 JVM 성능 향상
		 */
		
		if(num > 0) {
			System.out.print("양수다");
		} else {
			System.out.println("양수가 아니다");
		}
		
		
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		/*
		 * if - else if - else 문
		 * 
		 * 같은 비교대상으로 여러개의 조건을 제시해야 될 경우
		 * 
		 * <표현법>
		 * if(조건식) {
		 * 	..실행코드 1..
		 * } else if(조건식) {
		 * 	..실행코드 2..
		 * } else {
		 * 	위의 조건들이 false일 경우 실행할 코드
		 * } 
		 * else는 생략가능
		 * 
		 */
		
		if(num > 0) {
			System.out.print("양수다");
		}else if(num == 0) {
			System.out.print("0이다");	
		}else /*if(num < 0)*/ {
			System.out.print("음수다");
		}
	}
	public void method4() {
		// 사용자에게 나이를 입력받아 어린이 청소년 성인..
		// 13세 이하 : 어린이
		// 13세 초과 19세 이하 : 청소년
		// 19세 초과 : 성인
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 : ");
		int num = sc.nextInt();
		
		/*
		if(num <= 13) {
			System.out.print("어린이");
		} else if (num <= 19) {
			System.out.print("청소년");
		} else {
			System.out.print("성인");
		}
		*/
		
		String result;
		if(num <= 13) {
			result = "어린이";
		} else if (num <= 19) {
			result = "청소년";
		} else {
			result = "성인";
		}
		
		System.out.print(result);
	}
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		/* if(gender == 'm' || gender == 'M') {
			System.out.print(name + " 님은 남학생이다");
		} else if(gender == 'f' || gender == 'F') {
			System.out.print(name + "님은 여학생이다");
		} */
		
		String result = "";
		if(gender == 'm' || gender == 'M') {
			result = "남학생";
		} else if(gender == 'f' || gender == 'F') {
			result = "여학생";
		} else { 
			System.out.print("성별을 잘 못 입력하셨습니다");
			return; // 해당 이 메소드 자체를 빠져나가는 구문
		}
		
		System.out.print(name + "님은 " + result + "입니다");
	}
	
	// EX. 특이 케이스 
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		/*
		if(name == "차은우") {
			System.out.print("차은우님 반갑습니다");
		} else if(name != "차은우") {
			System.out.print("차은우님이 아니신가보네요..ㅂㅂ;");
	
		}
		*/
		
		/*				1		1	  2		4	  8		4		8	   2
		 * 기본자료형 : boolean, byte, short, int, long, float, double, char
		 * 참조자료형 : String
		 * 
		 * 기본자료형들끼리 비교시에는 ==, != 사용가능 (정상 비교)
		 * 참조자료형은 ==, != 사용불가능 (equals() 메소드 사용)		 
		 */
		
		if(name.equals("차은우")) {
			System.out.print("차은우님 반갑습니다");
		} else {
			System.out.print("차은우님이 아니신가보네요..ㅂㅂ;");
	
		}
		
	}
	// 조건문 중첩 사용
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력(양수만) : ");
		int num = sc.nextInt();
		
		if(num > 0) { // 양수일 경우
			if(num % 2 == 0) { // 양수, 짝수일 경우
				System.out.print("짝수입니다");
			} else { // 양수, 홀수일 경우
				System.out.print("홀수입니다");
			}
		} else { // 양수가 아닐 경우
			System.out.print("양수가 아닙니다. 잘 못 입력 하셨습니다");
		}
	}
}
