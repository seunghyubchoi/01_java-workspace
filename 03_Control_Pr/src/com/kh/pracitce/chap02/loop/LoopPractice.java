package com.kh.pracitce.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 이상의 숫자를 입력하세요 : ");

		int num = sc.nextInt();
		if (num < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1 이상의 숫자를 입력해주세요 : ");
			int num = sc.nextInt();

			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요!!!!!!");
				continue;
			}

			for (int i = 1; i <= num; i++) {
				System.out.println(i);
			}
			break;
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 값 : ");
		int num = sc.nextInt();
		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

		for (int i = num; i >= 1; i--) {
			System.out.println(i);
		}

	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1 이상의 숫자를 입력해주세요 : ");
			int num = sc.nextInt();
			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요!!!");
				continue;
			}

			for (int i = num; i >= 1; i--) {
				System.out.println(i);
			}
			break;
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 값 : ");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		for (int i = 1; i <= num; i++) {
			System.out.print(i);
			if (i == num) {
				System.out.print(" = " + sum);
				break;
			}
			System.out.print(" " + '+' + " ");
		}
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		int box;
		if (num1 > num2) {
			box = num1;
			num1 = num2;
			num2 = box;
		}

		if (num1 < 1 || num2 < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요");
		} else {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			int box;

			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();

			if (num1 > num2) {
				box = num1;
				num1 = num2;
				num2 = box;
			}

			if (num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			} else {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
				break;
			}
		}

	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		System.out.println("===== " + dan + "단 =====");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();

		if (dan > 9) {
			System.out.print("9 이하의 숫자만 입력해주세요.");
		} else {

			for (int i = dan; i <= 9; i++) {
				System.out.println("===== " + i + "단 =====");
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d x %d = %d\n", i, j, i * j);
				}
			}
		}
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("단 입력 : ");
			int dan = sc.nextInt();
			if (dan > 9) {
				System.out.print("9 이하의 숫자를 입력해주세요.");
				continue;
			} else {
				for (int i = dan; i <= 9; i++) {
					System.out.println("===== " + i + "단  =====");
					for (int j = 1; j <= 9; j++) {
						System.out.printf("%d x %d = %d\n", i, j, i * j);
					}
				}
			}
			break;
		}
	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.print("공차 : ");
		int add = sc.nextInt();

		System.out.print(start + " ");
		if (add >= 0) {
			for (int i = 1; i <= 9; i++) {
				start += add;
				System.out.print(start + " ");
			}
		} else {
			for (int i = 1; i <= 9; i++) {
				start += add;
				System.out.print(start + " ");

			}

		}
	}

	public void practice12() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.print("첫 번째 숫자 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 입력 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			System.out.print("연산자 입력 : ");
			String op = sc.nextLine();

			if (op.equals("exit")) {
				System.out.print("프로그램을 종료합니다.");
				break;
			} else if (op.equals("+")) {
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			} else if (op.equals("-")) {
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			} else if (op.equals("*")) {
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			} else if (op.equals("/")) {
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue;
				} else {
					System.out.println(num1 + " / " + num2 + " = " + (num1 - num2));
				}
			
			} else {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			}
		}
	}
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <=num; i++) {
			for(int j = 0; j < i; j++ ) {
				System.out.print('*');
			} System.out.println();
		}
		
	}
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = num; j >= i; j--) {
				System.out.print('*');
			} System.out.println();
		}
	}
}
