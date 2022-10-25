package com.kh.operator;

public class C_Arithmetic { 
		/*
		 * 산술연산자
		 * + - * / % 
		 * (*, /, %)  > (+, -)
		 */
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		// System.out.println("num1 + num2 = " + num1 + num2); // 103
		System.out.println("num1 + num2 = " + (num1 + num2)); //
		// System.out.println("num1 - num2 = " + num1 - num2); // String이 되고 -가 붙어서 에러
		System.out.println("num1 - num2 = " + (num1 - num2)); //
		System.out.println("num1 * num2 = " + num1 * num2); // 곱셈이 우선순위가 높음
		System.out.println("num1 * num2 = " + (num1 * num2)); // 하지만 가독성을 위해 괄호 포함
		System.out.println("num1 / num2 = " + (num1 / num2)); // 자료형 int,  몫 구하기
		System.out.println("num1 % num2 = " + (num1 % num2)); // 나머지 구하기
		
		
	}
	
	// 값 % 2 == 0 짝수
	// 값 % 2 == 1 홀수
	// 값 % 5 == 0 5의 배수
	// 값 % 3 == 0 3의 배수
	
	public void quiz1(){
		int a = 5;
		int b = 10;
		int c = (++a) + b; // a = 6, b = 10, c = 16
		int d = c / a;	// a = 6, b = 10, c = 16, d = 2
		int e = c % a;	// a = 6, b = 10, c = 16, d = 2 e = 4
		int f = e++;	// a = 6, b = 10, c = 16, d = 2 e = 4(5), f = 4
		int g = (--b) + (d--); // a = 6, b = 9, c = 16, d = 2(1), e = 5, f = 4, g = 11
		int h = 2; // a = 6, b = 9, c = 16, d = 2(1), e = 5, f = 4, g = 11, h = 2
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h); // 답은 12
		// a = 6(7), b = 9, c = 15, d = 2(1), e = 6, f = 4, g = 11(10), h = 2
	
		System.out.println("a : " + a); 
		System.out.println("b : " + b); 
		System.out.println("c : " + c);	
		System.out.println("d : " + d);	
		System.out.println("e : " + e);	
		System.out.println("f : " + f);	
		System.out.println("g : " + g);	
		System.out.println("h : " + h);	
		System.out.println("i : " + i);	
	}
	
}
