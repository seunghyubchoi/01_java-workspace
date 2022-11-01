package com.kh.practice.array;

import java.util.Scanner;

public class ArrPractice_2 {
	public void practice1() {
		// 길이가 10인 배열 선언
		int[] arr = new int[10];

		// 1부터 10까지의 값을 반복문을 이용해 순서대로 넣기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1; // 배열의 인덱스 값(자리 값) 0, 첫 번째 일 때, 1을 넣기 위함
			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {
		// 길이가 10인 배열 선언
		int[] arr = new int[10];
		// 1부터 10까지 반복문 사용, 역순으로 대입
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice3() {
		// 양의 정수 : 만들기
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}

	}

	public void practice4() {
		// 길이가 5인 String 배열 선언
		String[] arr = { "사과", "귤", "포도", "복숭아", "참외" };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("귤"))
				System.out.print(arr[i]);
		}
	}

	public void practice5() {
		// 개수
		int count = 0;
		// 문자열 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		// 문자열 문자 배열에 생성
		char[] arr = new char[str.length()];
		// 문자 배열에 대입
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		// 검색할 문자 입력
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		// 위치 인덱스
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		for (int i = 0; i < arr.length; i++) {
			if (ch == arr[i]) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.print("i 개수 : " + count);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		// 요일 초기화
		String[] arr = { "월", "화", "수", "목", "금", "토", "일" };
		// 0~6 사이 숫자 입력
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		if (num < 7 && num >= 0) {
			System.out.print(arr[num] + "요일");
		} else {
			System.out.print("잘 못 입력하셨습니다.");
		}
	}

	public void practice7() {
		// 합계
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		// 배열의 길이 입력
		System.out.print("정수 : ");
		int size = sc.nextInt();
		// 배열 선언
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.print("총 합 : " + sum);
	}

	public void practice8() {
		// 정수 입력 받기

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num >= 3 && num % 2 != 0) {
				int[] arr = new int[num];
				int value = 1;
				// 오름차순
				for (int i = 0; i < arr.length; i++) {
					arr[i] = value;
					if (i < arr.length / 2) {
						value++;
					} else {
						value--;
					}
					System.out.print(arr[i] + " ");
				}
				break;
			} else {

				System.out.println("다시 입력하세요");
			}
		}
	}
}
