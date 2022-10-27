package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
	 * 반복문 프로그램 흐름을 제어하는 제어문 중 하나 어떤 실행코드를 반복적으로 수행시켜줌
	 * 
	 * for문 / while문(do-while문)으로 나뉨
	 * 
	 * for문
	 * 
	 * <표현법> for(초기식; 조건식; 증감식) { // 반복 횟수를 지정하기 위해 제시하는 것들 반복적으로 실행시키고자 하는 구문;
	 * 
	 * - 초기식 : 반복문이 수행될 때 "처음에 단 한 번만 실행되는 구문" (반복문 안에서 사용될 변수를 선언 및 초기화 하는 구문)
	 * 
	 * - 조건식 : "반복문이 수행될 조건"을 작성하는 구문 (조건식이 true일 경우 해당 구문을 실행) (조건식이 false가 되는 순간
	 * 반복을 멈추고 빠져나옴) (보통 초기식에 제시된 변수를 가지고 조건식을 작성함)
	 * 
	 * - 증감식 : 반복문을 제어하는 변수 값을 증감시키는 구문 (보통 초기식에 제시된 변수를 가지고 증감연산자(++, --)를 사용함)
	 * 
	 * for문을 만나는 순간 초기식 => 조건식 검사 => true면 실행구문 실행 => 증감식 => 조건식 검사 => true면 실행구문 실행
	 * => 증감식 => 반복 => 조건식 검사 => false면 실행구문 실행 x => 반복문 빠져나옴
	 * 
	 * 알아둘 것 for문 안에 초기식, 조건식, 증감식 각각 생략 가능( ; ; 은 필수) for( ; ; ) 횟수를 지정해주지 않으면 무한
	 * 반복
	 * 
	 * }
	 * 
	 */

	public void method1() {
		// "안녕하세요" 를 5번 반복해서 출력하기
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");

		for (int i = 1; i <= 20; i++) { // i값이 1에서부터 5까지 매번 1씩 증가하는 동안 반복 수행
			System.out.println("안녕하세요");
		}

		for (int i = 0; i <= 4; i++) { // i값이 0에서부터 4까지 매번 증가하는 동안 반복 수행
			System.out.println("반갑습니다");
		}
		for (int i = 11; i < 16; i++) {// i값이 11에서 15까지 매번 1씩 증가하는 동안 반복 수행
			System.out.println("저리가세요");
		}
		for (int i = 1; i <= 9; i += 2) {// i값이 1에서 9까지 매번 2씩 증가하는 동안 반복 수행
			System.out.println("Hello");
		}

	}

	public void method2() {
		// 1부터 5까지 출력
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
	}

	public void method3() {
		// 5 4 3 2 1
		for (int i = 5; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}

	public void method4() {
		// 1 3 5 7
		// for(int i = 1; i <= 9; i += 2) {
		// System.out.println(i);

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
	}

	public void method5() {
		// 1 2 3 4 ... 8 9 10 for문 고정
		for (int i = 0; i <= 9; i++) {
			System.out.print(i + 1 + " ");
		}
	}

	public void method6() {
		// 1에서부터 10까지의 총 합계
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public void method7() {
		// 사용자에게 값을 입력받아 1부터 입력받은 수까지의 합계 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1부터 " + num + "까지의 합 : " + sum);
	}

	public void method8() {
		// 1에서부터 어떤 랜덤 값(1~10)까지의 총 합계

		// 자바에서 제공하고 있는 클래스 (Math)

		// java.lang.Math 클래스에서 제공하는
		// random() 메소드를 호출해서
		// 매번 다른 랜덤 값을 얻어낼 수 있음
		// Math.random(); => 호출 방법
		// 범위 : 0.0 ~ 0.999999 사이의 랜덤 값 호출
		// (0.0 <= Math.random < 1.0)

		// int random = Math.random(); Math.random은 double 형
		// int random = Math.random() * 10; 0.0 ~ 9.999~
		// int random = Math.random() * 10 + 1; 1.0 ~ 10.999~
		int random = (int) (Math.random() * 10 + 1);
		System.out.println("1~10 사이의 랜덤 값 : " + random);

		int sum = 0;
		for (int i = 1; i <= random; i++) {
			sum += i;
		}
		System.out.println("1부터 " + random + "값 까지의 합 : " + sum);
	}

	public void method9() {
		String str = "Hello";
		// 각 인덱스 별 문자를 뽑아서 출력

		for (int i = 0; i <= 4; i++) {
			System.out.println(str.charAt(i));
		}
	}

	public void method10() {
		// 사용자에게 문자열 입력 받아서 str 변수에 대입
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();

		// 각 인덱스별 문자를 뽑아서 출력

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

	}

	public void method11() {
		// 구구단 출력
		for (int i = 1; i < 10; i++) {
			// System.out.println("2 x " + i + " = " + 2 * i);
			System.out.printf("%d x %d = %d\n", 2, i, 2 * i);
		}

	}

	public void method12() {
		// 사용자에게 입력 받아 구구단 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("2~9 사이의 정수를 입력  : ");
		int dan = sc.nextInt();
		if (dan > 1 && dan < 10) {

			for (int i = dan; i < 10; i++) {
				for (int j = 1; j < 10; j++) {

					System.out.printf("%d x %d = %d\n", i, j, i * j);
				}
			}

		} else {
			System.out.println("잘못입력해썽");
		}
	}

	public void method13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("2~9 사이의 정수를 입력  : ");
		int dan = sc.nextInt();
		if (dan > 1 && dan < 10) {
			if (dan % 2 == 1) {
				for (int i = dan; i < 10; i += 2) {
					for (int j = 1; j < 10; j++) {
						System.out.printf("%d x %d = %d\n", i, j, i * j);
					}
				}

			} else {
				for (int i = dan; i < 10; i += 2) {
					for (int j = 1; j < 10; j++) {
						System.out.printf("%d x %d = %d\n", i, j, i * j);
					}
				}
			}
		} else {
			System.out.print("입력 값이 올바르지 않습니다.");
		}
	}

	public void method14() {
		// 2부터 9까지의 랜덤 값 발생 시켜서 랜덤 단 출력하기
		// 8 곱하고, 2를 더해서 범위지정
		// 시작수(2)는 더하는 값(Math.random() * 8 + "2")
		// "8"은 2부터 총 여덟 개의 랜덤 값을 추출한다는 의미(2,3,4,5,6,7,8,9)
		int dan = (int) (Math.random() * 8 + 2);
		System.out.println("=== " + dan + " ===");

		for (int i = 1; i <= 9; i++) {
			// System.out.println(dan + "*" + i + "=" + dan*i);
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}

	}

	public void method15() {
		// 중첩 for문
		// 1 2 3 4 5
		for (int j = 1; j <= 3; j++) {
			for (int i = 1; i <= 5; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public void method16() {
		// 별 찍기
		// ****
		// ****
		// ****
		// ****
		for (int j = 1; j <= 4; j++) {
			for (int i = 1; i <= 4; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void method17() {
		// 1***
		// *2**
		// **3*
		// ***4

		// 행은 1~4 까지 반복 => 바깥쪽 for문
		// 매 행 고정일 때 열은 1~4까지 반복 => 안쪽 for문
		//
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}

			}
			System.out.println("");
		}

	}

	public void method18() {
		// 2단~ 9단 다 출력

		int dan = 2;

		for (int i = dan; i <= 9; i++) {
			System.out.println("=== " + i + "단 ===");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
			System.out.println("");
		}

	}
	
	public void method19() {
		for(; ;) { // 조건식 자리 생략시 기본적으로 true => 무한반복문
			System.out.println("안녕");
		}
	}
}
