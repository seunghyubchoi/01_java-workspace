package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {

	/*
	 * break; 반복문 안에서 사용되는 분기문 break;를 만나는 순간 현재 속해 있는 반복문을 강제로 빠져나옴 유의 사항 *
	 * switch문의 break;는 switch를 빠져나가는 구문
	 */
	public void method1() {
		// 랜덤 값(1~100) 발생 후 그 랜덤 값 출력(이 과정을 반복)
		// 단, 랜덤 값이 3의 배수일 경우 반복문 탈출
		while (true) {
			int random = (int) (Math.random() * 100 + 1);
			if (random % 3 == 0) {
				System.out.println("random 값 " + random + "이 3의 배수 입니다.");
				break; // 반복문을 강제로 탈출
			} else {
				System.out.println("random 값 : " + random);
			}
		}
	}

	public void method2() {
		// 문자열 입력 받아 길이 출력(무한 반복)
		// 단, 문자열이 "exit"일 경우 반복문 탈출
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();

			if (str.equals("exit")) {
				System.out.print("반복문 안녕");
				break;
			} else {
				System.out.println("문자열의 길이는 : " + str.length());
			}
		}
	}

	public void method3() {
		// 단(2~9)을 입력 받아 해당 단을 출력(무한 반복)
		// 잘못 입력시 다시 입력 유도
		// 해당 단 출력 후 프로그램 종료
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("단을 입력해 주세요 : ");
			int dan = sc.nextInt();
			if (dan < 2 || dan > 9) {
				System.out.println("잘 못 입력하셨습니다.");
				
			} else {
				for (int i = dan; i <= dan; i++) {
					for (int j = 1; j <= 9; j++) {
						System.out.printf("%d x %d = %d\n", dan, j, dan * j);
						i++;
					}
					
				} break;
			} 
		}
	}

}