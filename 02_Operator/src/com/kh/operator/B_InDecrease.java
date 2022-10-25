package com.kh.operator;

public class B_InDecrease {
	
		/*
		 * 증감 연산자(단항 연산자)
		 * ++ : 변수에 담긴 값을 1 증가 시켜주는 연산자
		 * ex. ++변수, 변수++
		 * 
		 * -- : 변수에 담긴 값을 1 감소 시켜주는 연산자
		 * ex. --변수, 변수--
		 * 
		 * (증감연산자)변수 : 전위연산
		 * => 선증감 후처리
		 * 변수(증감연산자) : 후위연산
		 * => 선처리 후증감
		 * 
		 */
		
	public void method1() {
		// 전위연산 테스트 => 출력 전 증가하고 출력
		int num1 = 10;
		System.out.println("전위연산 적용 전 num1의 값 : " + num1);
	
		System.out.println("1회 수행 후 num1의 값 : " + ++num1);

		System.out.println("2회 수행 후 num1의 값 : " + ++num1);
		
		System.out.println("3회 수행 후 num1의 값 : " + ++num1);
		
		
		System.out.println();
		//후위연산 테스트 => 출력 후 증가 
		int num2 = 10;
		System.out.println("후위연산 적용 전 num2의 값 : " + num2);
	
		System.out.println("1회 수행 후 num2의 값 : " + num2++);

		System.out.println("2회 수행 후 num2의 값 : " + num2++);
		
		System.out.println("3회 수행 후 num2의 값 : " + num2++);

		System.out.println("최종 num2의 값 : " + num2);
	}
	
	public void method2() {
		int a = 10;
		int b = ++a; // ++a가 먼저 증가하고 b에 대입
		System.out.printf("a : %d, b : %d\n", a, b);
		
		int c = 10;
		int d = c++; // d = 10, c = 11
		System.out.printf("c : %d, d : %d\n", c, d);
		
		System.out.println();
		
		int num = 20;
		System.out.println("현재 num : " + num);

		System.out.println("++num은 : " + ++num);
	
		System.out.println("num++은 : " + num++);

		System.out.println("그래서 num은 : " + num);

		System.out.println("--num은 : " + --num);

		System.out.println("num--은 : " + num--);
		
		System.out.println("최종 num은 : " + num);
		

	}
	public void method3() {
		int num1 = 20;
		int result1 = ++num1 * 3; // result1 = 6, num1 = 21
		
		System.out.printf("num1 : %d, result1 : %d\n", num1, result1);
	
		int num2 = 20;
		int result2 = num2++ * 3; // result2 = 60, num2 = 21
		
		System.out.printf("num2 : %d, result2 : %d\n", num2, result2);
	}
	public void method4() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++); //a=10(11)
		System.out.println((++a) + (b++)); // => 32
		System.out.println((a++) + (--b) + (--c)); //a=12(13), b=20, c=29
		
		System.out.printf("a : %d, b : %d, c : %d\n", a, b, c);
	} 
}

