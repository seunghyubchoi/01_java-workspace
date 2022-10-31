package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {
		/*
		 * int[] arr = new int[10]; for(int i = 0; i < arr.length; i++) { arr[i] = 10 -
		 * i; }
		 */

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 값 : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("양의 정수 : " + size);
		for (int i = 0; i < arr.length; i++) {
			arr[i] += i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice4() {
		String[] arr = { "사과", "귤", "포도", "복숭아", "참외" };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == "귤") {
				System.out.print(arr[i]);
			}
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자 입력 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);

		int count = 0;

		char[] arr = new char[str.length()];
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			if (ch == arr[i]) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.print(ch + "개수 : " + count);

	}

	public void practice6() {
		// 배열 생성 및 초기화
		char[] day = { '월', '화', '수', '목', '금', '토', '일' };

		// 숫자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		// 출력 조건 설정 및 출력
		if (num > 6 || num < 0) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.println(day[num] + "요일");

		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + arr[i] + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];

		}
		System.out.println();
		System.out.print("총합 : " + sum);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int count = 0;
			System.out.print("정수 : ");
			int num = sc.nextInt();
			if (num % 2 == 0 || num < 3) {
				System.out.print("다시 입력하세요.");
				System.out.println();
				continue;
			} else {
				int[] arr = new int[num];
				for (int i = 0; i < (num / 2) + 1; i++) {
					arr[i] = ++count;
					System.out.print(arr[i] + " ");
				}
				for (int j = 0; j < (num / 2); j++) {
					arr[j] = --count;
					System.out.print(arr[j] + " ");

				}
				break;

			}
		}
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] chix = { "양념", "간장", "뿌링클", "호박" };

		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();


	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.nextLine();
		char[] arr = new char[idNum.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = idNum.charAt(i);
		}
		char[] arrCopy = arr.clone();
		for(int i = 8; i <  arrCopy.length; i++) {
			arrCopy[i] = '*';
		}
		for(int i = 0; i < arrCopy.length; i++) {
			System.out.print(arrCopy[i] + " ");
		}
	}
}
