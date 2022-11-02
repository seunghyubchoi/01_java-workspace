package com.kh.practice.array;

import java.util.Arrays;
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
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			if (num >= 3 && num % 2 == 1) {
				int[] arr = new int[num];
				int count = 1;
				for (int i = 0; i < arr.length; i++) {
					if (i < arr.length / 2) {
						arr[i] = count++;
					} else {
						arr[i] = count--;
					}
					System.out.print(arr[i] + " ");
				}
				break;
			} else {
				System.out.println("다시 입력하세요");
				continue;
			}
		}
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		String arr[] = { "양파", "스펀지", "해적왕" };

		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.nextLine();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(name)) {
				System.out.print(name + "치킨 배달 가능");
				return;
			}
		}
		System.out.print(name + "치킨은 없는 메뉴입니다.");
	}

	public void practice9_1() {
		Scanner sc = new Scanner(System.in);
		// 배열 생성
		String[] chickens = { "황금올리브", "허니콤보", "뿌링클", "고추바사삭" };

		System.out.print("치킨 이름을 입력하세요 :");
		String chicken = sc.nextLine();

		int count = 1;
		for (int i = 0; i < chickens.length; i++) {
			if (chicken.equals(chickens[i])) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println(chicken + "치킨 배달 가능");
		} else {
			System.out.println(chicken + "치킨 배달불가");
		}
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String number = sc.nextLine();
		char[] arr = new char[number.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = number.charAt(i);
		}
		char[] arr2 = arr.clone();
		for (int i = 8; i < arr2.length; i++) {
			arr2[i] = '*';
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		// System.arraycopy(arr, 0, arr2, 0, arr.length);
	}

	public void practice11() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
	}

	public void practice12() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice13() {
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		while (true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int size2 = sc.nextInt();

				String[] arrNew = new String[arr.length + size2];
				System.arraycopy(arr, 0, arrNew, 0, arr.length);

				sc.nextLine();

				for (int i = arr.length; i < arrNew.length; i++) {
					System.out.print(i + 1 + "번째 문자열 : ");
					arrNew[i] = sc.nextLine();
				}
				arr = arrNew;
			} else {
				System.out.print('[');
				for (int i = 0; i < arr.length; i++) {
					if (i == 0) {
						System.out.print(arr[i]);
					} else {
						System.out.print(", " + arr[i]);
					}

				}
				System.out.print(']');
				break;
			}

		}
	}
}
