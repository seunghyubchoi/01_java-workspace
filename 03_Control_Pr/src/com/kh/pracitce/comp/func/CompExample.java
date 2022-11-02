package com.kh.pracitce.comp.func;

import java.util.Scanner;

public class CompExample {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		// 정수 입력
		System.out.print("정수 : ");
		int num = sc.nextInt();
		if (num <= 0) {
			System.out.print("양수가 아닙니다");
		} else {
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 1) {
					System.out.print('박');
				} else {
					System.out.print('수');
				}
			}
		}

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		// 정수 입력
		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			if (num <= 0) {
				System.out.println("양수가 아닙니다");
				continue;
			} else {
				for (int i = 1; i <= num; i++) {
					if (i % 2 == 1) {
						System.out.print('박');
					} else {
						System.out.print('수');
					}
				}
			}
			break;
		}

	}

	public void practice3() {
		// 문자열 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();

		// 검색될 문자 입력 받기
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		// 갯수
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.print(str + "안에 포함된 " + ch + " 개수 : " + count);
	}

	public void practice4() {
		// 문자열 입력 받기
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("문자열 : ");
			String str = sc.nextLine();
			int count = 0;
			// 검색될 문자 입력 받기
			System.out.print("문자 : ");
			char ch = sc.nextLine().charAt(0);
			// 갯수

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ch) {
					count++;
				}
			}
			System.out.print(str + "안에 포함된 " + ch + " 개수 : " + count);
			System.out.println();
			System.out.print("더 하시겠습니까? (Y/N) : ");
			char answer = sc.nextLine().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				continue;
			} else if (answer == 'n' || answer == 'N') {
				break;
			} else {
				System.out.println("잘 못된 대답입니다. 다시 입력해주세요");
			}
		}
	}

	public void upDown() {
		Scanner sc = new Scanner(System.in);
		// 임의의 난수
		int random = (int) (Math.random() * 100 + 1);
		// 횟수
		int count = 1;
		// 사용자 입력
		while (true) {
			System.out.print("1~100사이 임의의 난수를 맞춰보세요 : ");
			int answer = sc.nextInt();
			if (answer >= 1 && answer <= 100) {
				if (answer > random) {
					System.out.println("Down");
					count++;
					continue;
				} else if (answer < random) {
					System.out.println("Up");
					count++;
					continue;
				} else {
					System.out.println("정답입니다!!");
					System.out.print(count + "회만에 맞추셨습니다");
				}
			} else {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
				continue;
			}
			break;
		}
	}

	public void rps() {
		// 전적 입력
		int fight = 0;
		int draw = 0;
		int win = 0;
		int lose = 0;

		String rock = "바위";
		String paper = "보";
		String scissors = "가위";
		// 사용자 이름 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		String answer;
		// 사용자 가위바위보 입력
		while (true) {

			// 가위바위보 랜덤한 수 발생

			System.out.print("가위바위보 : ");
			answer = sc.nextLine();

			if (answer.equals("exit")) {
				System.out.printf("%d전 %d승 %d무 %d패\n", fight, win, draw, lose);
				break;
			}

			int random = (int) (Math.random() * 3 + 1);

			String str = random + "";

			if (str.equals("1")) {
				str = rock;

				if (answer.equals(str)) {
					System.out.println("컴퓨터 : " + str);
					System.out.println(name + " : " + answer);
					System.out.println("비겼습니다.");
					draw++;
					fight++;
				} else if (answer.equals(scissors)) {
					System.out.println("컴퓨터 : " + str);
					System.out.println(name + " : " + answer);
					System.out.println("졌습니다.");
					lose++;
					fight++;
				} else if (answer.equals(paper)) {
					System.out.println("컴퓨터 : " + str);
					System.out.println(name + " : " + answer);
					System.out.println("이겼습니다.");
					win++;
					fight++;
				} else {
					System.out.println("잘 못 입력하셨습니다");
				}

			} else if (str.equals("2")) {
				str = paper;

				if (answer.equals(str)) {
					System.out.println("컴퓨터 : " + str);
					System.out.println(name + " : " + answer);
					System.out.println("비겼습니다.");
					draw++;
					fight++;
				} else if (answer.equals(rock)) {
					System.out.println("컴퓨터 : " + str);
					System.out.println(name + " : " + answer);
					System.out.println("졌습니다.");
					lose++;
					fight++;
				} else if (answer.equals(scissors)) {
					System.out.println("컴퓨터 : " + str);
					System.out.println(name + " : " + answer);
					System.out.println("이겼습니다.");
					win++;
					fight++;
				} else {
					System.out.println("잘 못 입력하셨습니다");
				}

			} else if (str.equals("3")) {
				str = scissors;

				if (answer.equals(str)) {
					System.out.println("컴퓨터 : " + str);
					System.out.println(name + " : " + answer);
					System.out.println("비겼습니다.");
					draw++;
					fight++;
				} else if (answer.equals(paper)) {
					System.out.println("컴퓨터 : " + str);
					System.out.println(name + " : " + answer);
					System.out.println("졌습니다.");
					lose++;
					fight++;
				} else if (answer.equals(rock)) {
					System.out.println("컴퓨터 : " + str);
					System.out.println(name + " : " + answer);
					System.out.println("이겼습니다.");
					win++;
					fight++;
				} else {
					System.out.println("잘 못 입력하셨습니다");
				}

			}
		}
	}
}
