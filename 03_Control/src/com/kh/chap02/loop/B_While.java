package com.kh.chap02.loop;
import java.util.Scanner;
public class B_While {
	/*
	 * while문
	 * 
	 * <표현법> [초기식;] // 생략 가능 while(조건식) { // 조건식은 생략 불가능 반복적으로 실행할 코드; [증감식;] // 생략
	 * 가능
	 * 
	 * 조건식이 true일 경우 해당 코드 실행 조건식 검사 => true일 경우 실행 코드 실행 조건식 검사 => false일 경우 실행 코드
	 * 실행 x => 반복문 빠져나감 }
	 * 
	 */

	public void method1() {
		int i = 1; // 초기식
		while (i <= 5) { // 조건식
			System.out.println("안녕하세요");
			i++; // 증감식
		}
		// for문과 다른 점은 !! i값을 출력할 수 있다.
		System.out.println("i의 값 : " + i);
	}

	public void method2() {
		// 1 2 3 4 5
		int i = 1;
		while (i <= 5) {
			System.out.print(i + " ");
			i++;
		}
	}

	public void method3() {
		/*
		 * 1 ~ 10까지 출력 int i = 1; while (i<=10) { System.out.print(i + " "); //i++;
		 * i+=2; }
		 */
		int i = 1;
		while (i <= 10) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
			i++;
		}
	}
	public void method4() {
		// 1부터 랜덤 값(1~100) 까지의 합계
		int random = (int)(Math.random() * 100 + 1);
		System.out.println(random);
		
		int sum = 0;
		int i = 1;
		while(i <= random) {
			sum += i;
			i++;
						}
		System.out.println("1부터 " + random + "값 까지의 합 : " + random);
		System.out.println("sum 값 : " + sum);
	}
	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 값 : ");
		String str = sc.nextLine();
		int i = 0;
		while(i <= (str.length()-1)) {
			System.out.println(str.charAt(i));
			i++;
		}
	}
}
