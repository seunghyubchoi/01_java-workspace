package com.kh.chap06_method.controller;

public class StaticMethod {

	// 1. 매개변수도 없고 반환값도 없는 메소드
	public static void method1() {
		System.out.println("매개변수와 반환값이 둘 다 없는 static 메소드 입니다");
	}

	// 2. 매개변수는 없고 반환값은 있는 메소드
	public static int method2() {
		System.out.println("매개변수는 없고 반환값은 있는 static 메소드 입니다");
		// return 10;
		// 1부터 100까지 1부터 랜덤값까지 총 합계를 리턴에 넣고 출력
		int sum = 0;
		int random = (int) (Math.random() * 100 + 1);
		System.out.println(random);
		for (int i = 1; i <= random; i++) {
			sum += i;
		}

		return sum;
	}
	
	// 3. 매개변수는 있고 반환값은 없는 메소드
	public static void method3(String name) {
		System.out.println("매개변수는 있고 반환값은 없는 static 메소드 입니다");
		System.out.println(name + "님의 방문을 환영합니다");
	}
	
	// 4.매개변수와 반환값이 둘 다 있는 메소드
	public static boolean method4(String s1, String s2) {
		return s1.equals(s2);
		
		/*if(s1.equals(s2)) {
			return true;			
		} else {
			return false;
		}*/
	}
}
