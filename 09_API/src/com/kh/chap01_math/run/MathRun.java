package com.kh.chap01_math.run;

public class MathRun {

	public static void main(String[] args) {
		// java.lang.Math (String, object) =  굳이 import 하지 않아도 사용할 수 있음
		
		// 상수필드
		System.out.println("파이 : " + Math.PI);
		
		// 절대값을 알고자 할 떄 : abs(앱솔루트)
		int num1 = -10;
		System.out.println("절대값 : " + Math.abs(num1));
		
		// 올림 : ceil : 크거나 같은 정수 값을 리턴
		double num2 = 4.349; // 5
		double num3 = -10.594; // -10
		System.out.println("올림한 결과 : " + Math.ceil(num2));
		System.out.println("올림한 결과 : " + Math.ceil(num3));
		
		// 버림 : floor
		System.out.println("버림한 결과 : " + Math.floor(num2));
		System.out.println("버림한 결과 : " + Math.floor(num3));
		 
		// 반올림 : round
		System.out.println("반올림 : " + Math.round(num2));
		System.out.println("반올림 : " + Math.round(num3));
		
		// 가장 가까운 정수 값을 알아낸 후 실수형으로 반환 : rint
		System.out.println("가장 가까운 정수값 : " + Math.rint(num2));
		
		// 제곱근(루트) : sqrt, 실수 값으로 반환
		System.out.println("4의 제곱근 : " + Math.sqrt(4));
		
		// 제곱 : pow
		System.out.println("2의 10제곱 : " + Math.pow(2, 10));
		
		
		
		/*
		 * Math 특정
		 * - 모든 필드는 상수필드며 모든 메소드는 static 메소드 입니다
		 * - Math 생성자 private => Math m = new Math(); 불가능!
		 * 
		 * - 한 번만 메모리 영역에 올려놓고 재 사용하는 개념 => 싱클톤 패턴
		 * 
		 * 
		 */
	}

}
