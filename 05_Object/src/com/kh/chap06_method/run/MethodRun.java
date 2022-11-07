package com.kh.chap06_method.run;

import java.util.Scanner;
import com.kh.chap06_method.controller.*;

public class MethodRun {

	public static void main(String[] args) {
		
		/*
		//===========Non Static Method============
		NonStaticMethod n = new NonStaticMethod();
		
		// 1. 매개변수도 없고 반환값도 없는 메소드 호출
		n.method1();

		// 2. 매개변수는 없고 반환값은 있는 메소드 호출
		// n.method2(); return 값 안 나옴
		// int str = n.method2(); 자료형 맞춰 줘야함

		 String str = n.method2();
		 System.out.println(str);
		//System.out.println(n.method2());

		// 3. 매개변수는 있고 반환값은 없는 메소드 호출
		// 매개변수가 두 개
		// int a = n.method3(10, 20); 매개변수를 받아줄 리턴 값이 없어서 재출력해주지 못 하므로 이런 방식 x
		n.method3(10, 5);

		// 4. 매개변수도 있고 반환값도 있는 메소드
		// char ch = n.method4("lemon", 1);
		// System.out.println(ch);
		// System.out.println(n.method4("lemon", 1));

		// 사용자에게 매개변수를 입력 받아서 해당 메소드 호출
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String s1 = sc.nextLine();
		System.out.print("인덱스넘버 : ");
		int num = sc.nextInt();

		// index 값이 0 이상이고 문자열 길이보다 작을 때만 method4 실행
		// 잘입력 : 메소드 실행
		// 잘못 입력 : 인덱스 값이 부적절합니다

		if (num < s1.length() && num >= 0) {
			System.out.println("결과 : " + n.method4(s1, num));
		} else {
			System.out.println("인덱스 값이 부적절 합니다");
		}
		
		
		// ==================Static Method====================
		// Static method는 객체의 생성 없이 바로 호출 가능	
		StaticMethod.method1();
		// StaticMethod.method2(); 여기선 return값 표출이 안됨
		System.out.println(StaticMethod.method2()); // 뭊역원 sysout으로 리턴 값 보여주쟝
		StaticMethod.method3("호랑이");
		System.out.println(StaticMethod.method4("사자", "호랑이"));
		*/
		
		
		// ======== Overloading =======
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(10);
		ot.test(10, "주지훈");
		ot.test("장원영", 15);
		ot.test("ㅎㅅㅎ");
		
		
		// 오버로딩의 대표적인 예: print()
		System.out.print(10);
		System.out.print("ㄴㄴ");
		System.out.print("0.0");
		
	}

}
