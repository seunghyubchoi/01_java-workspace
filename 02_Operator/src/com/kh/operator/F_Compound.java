package com.kh.operator;

public class F_Compound {
	public void method1() {
		/*
		 * 복합 대입 연산자
		 * 산술연산자와 대입연산자가 결합돼 있는 형태
		 * (산술 연산 먼저 쓰고 대입연산 나중에 쓴다)
		 * 연산처리 속도가 빨라지므로 사용하는 것을 권장함
		 * 
		 * +=, -=, *=, /=, %=
		 * 
		 * a = a + 3; => a += 3;
		 * a = a - 3; => a -= 3;
		 * a = a * 3; => a *= 3;
		 * a = a / 3; => a /= 3;
		 * a = a % 3; => a %= 3;
		 */
		int num = 12;
		System.out.println("최초 num : " + num);
		
		//int num = num; no effect = 아무런 쓸모 없는 코드
		num = num + 3;
		System.out.println("3 증가 시킨 num : " + num); //15
		num += 3;
		System.out.println("또 3 증가 시킨 num : " + num); //18
		num -= 5;
		System.out.println("5 감소 시킨 num : " + num); //13
		num *= 6;
		System.out.println("6 곱한 num : " + num); //78
		num /= 2;
		System.out.println("2배 감소 시킨 num : " + num); //39
		num %= 4;
		System.out.println("최종 num : " + num); //3
		
		String str = "Hello";
		//str = str + " World!!";
		str += " World!!";
		System.out.println(str);
		
	}
}




