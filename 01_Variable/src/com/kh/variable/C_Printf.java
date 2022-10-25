package com.kh.variable;

public class C_Printf {
	public void printfTest() {
		// System.out.print(출력하고자 하는 값); // 출력만 함 (줄바꿈 발생 X)
		// System.out.println(출력하고자 하는 값); // 출력 후 줄바꿈 발생 O

		// System.out.printf("출력하고자 하는 형식(포맷), 출력하고자 하는 값);
		// 출력하고자 하는 값들이 제시한 형식에 맞춰서 출력만 진행
		// (줄바꿈 발생 X - 한 줄 띄어쓰기 안됨!!)

		/*
		 * 포맷 안에서 쓰일 수 있는 키워드 %d : 정수 %c : 문자 %s : 문자열(문자) %f : 실수
		 */

		int iNum1 = 10;
		int iNum2 = 20;

		// 10 20
		System.out.println(iNum1 + " " + iNum2);
		System.out.printf("%d %d", iNum1, iNum2);
		System.out.println(); // 개행
		// 10 20%
		System.out.printf("%d %d%%", iNum1, iNum2);
		System.out.println();

		// System.out.printf("%d %d", iNum1); > 오류 남, 형식에 맞게 값도 2개여야 한다
		// System.out.printf("%d %d", iNum1, iNum2, 30);
		// > 형식과 다르지만 오류가 나지 않고 값은 2개만 나온다

		System.out.printf("%5d\n", iNum1); // 양수 5는 오른쪽 정렬
		// \n = 개행
		System.out.printf("%-5d\n", iNum1); // 음수 5는 왼쪽 정렬
		System.out.println();
		
		//정렬하고자 할 때 사용한다
		//양수 5 오른쪽 정렬
		System.out.printf("%5d\n", 250);
		System.out.printf("%5d\n", 3000);
		System.out.printf("%5d\n", 16);
		
		System.out.println();
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		System.out.printf("%f\t%f\n", dNum1,dNum2);
		//\t은 탭을 누른 것과 같음
		System.out.printf("%.3f %.2f\n", dNum1,dNum2);
		//'.숫자'로 나타내고 싶은 소수점 자리 수를 정할 수 있다.
		
		char ch = 'a';
		String str = "Hello";
		//소문자 출력
		System.out.printf("%c %s %s\n", ch, str, ch);
		System.out.printf("%C %S %S\n", ch, str, ch);
		// 문자 Uppercase로 바꾸는 방법
	}
}
