package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	/*
	 * Switch문도 if문과 동일하게 조건문
	 * 
	 * 다만, if문과의 차이점이라면? => if문은 조건식을 자유롭게 기술 가능! => switch문은 동등비교로 밖에 수행되지 않음
	 * 
	 * break; => 실행할 구문만 실행하고 자동으로 빠져나오질 못 함 => 직접 break; 작성 해야함 (default에도)
	 * 
	 * 
	 * <표현법> switch(동등비교할 대상) { case 값1 : 실행코드 1번; break; case 값2 : 실행코드 1번; break;
	 * ... default : break;
	 * 
	 * 위의 값들과 모두 일치하지 않을 경우 실행할 코드; => default는 if문에서 else와 같은 존재
	 * 
	 */

	public void method1() {
		/*
		 * 정수를 입력 받아 1일 경우 "빨간색 입니다." 2일 경우 "파란색 입니다." 3일 경우 "초록색 입니다." default :
		 * "잘 못 입력하셨습니다."
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자들 입력하세요. : ");
		int num = sc.nextInt();

		/*
		 * if (num == 1) { System.out.print("빨간색 입니다."); } else if (num == 2) {
		 * System.out.print("파란색 입니다."); } else if (num == 3) {
		 * System.out.print("초록색 입니다."); } else { System.out.print("잘 못 입력하셨습니다."); }
		 */

		// Switch 문으로 바꿔보기

		switch (num) {
		case 1:
			System.out.print("빨간색 입니다.");
			break;
		case 2:
			System.out.print("파란색 입니다.");
			break;
		case 3:
			System.out.print("초록색 입니다.");
			break;
		default:
			System.out.print("잘 못 입력하셨습니다.");
			break;
		}

	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("과일을 고르세요. [사과, 바나나, 복숭아] : ");
		String fruit = sc.nextLine();
		int price = 0;
		switch (fruit) {
		case "사과":
			price = 1000;
			break;
		case "바나나":
			price = 2000;
			break;
		case "복숭아":
			price = 3000;
			break;
		default:
			System.out.print("해당 과일은 품절 됐습니다.");
			return;
		}
		
		System.out.print(fruit + "의 가격은 " + price + "원 입니다.");

	}
}
