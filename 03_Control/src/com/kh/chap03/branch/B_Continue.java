package com.kh.chap03.branch;

public class B_Continue {
	/*
	 * continue : 반복문 안에 기술 되는 구문 : continue; 구문 실행시 바로 뒤 구문을 실행하지 않고 : 현재 속해 있는 반복문
	 * 위로 올라감
	 */

	public void method1() {
		// for문, 1~10까지 홀수 출력

		/*
		 * for(int i = 1; i <= 10; i+=2) { System.out.print(i + " "); }
		 */

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) { // i값이 짝수일 경우
				continue; // 건너뛰기
			}
			System.out.print(i + " ");
		}
	}

	public void method2() {
		// 1부터 100까지의 총 합계
		// 6의 배수 값은 빼고 덧셈 연산

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1부터 100까지의 합 : " + sum);
	}

	public void method3() {
		// 2~9단까지 출력
		// 단 3의 배수단은 빼고 출력

		for (int dan = 2; dan < 10; dan++) {
			if (dan % 3 == 0) {
				continue;
			}
			System.out.println("=== " + dan + "단 ===");
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			}
		}
	}
}

// ctrl + shift + f : 코드 정렬
// alt  + 방향키 : 코드 이동
// ctrl + h : 키워드 검색, 파일 서치
// ctrl + shift + r : 파일명으로 검색
