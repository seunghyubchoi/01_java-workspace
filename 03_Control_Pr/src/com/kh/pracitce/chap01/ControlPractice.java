package com.kh.pracitce.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("종료 메뉴입니다.");
			break;
		default:
			System.out.println("잘 못된 입력입니다.");
		}

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.print("짝수다");
			} else if (num % 2 == 1) {
				System.out.print("홀수다");
			}
		} else {
			System.out.print("양수만 입력 해주세요");
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수 : ");
		int kor = sc.nextInt();

		System.out.print("수학점수 : ");
		int mat = sc.nextInt();

		System.out.print("영어점수 : ");
		int eng = sc.nextInt();

		int total = (kor + mat + eng);
		double average = total / 3;

		if (kor >= 40 && mat >= 40 && eng >= 40 && average >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + mat);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + total);
			System.out.println("평균 : " + average);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();

		switch (num) {
		case 12:
		case 1:
		case 2:
			System.out.println(num + "월은 겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(num + "월은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(num + "월은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(num + "월은 가을입니다.");
			break;
		default:
			System.out.println(num + "월은 잘 못 입력된 달입니다.");

		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		String id = "myId";
		String password = "myPassword12";

		System.out.print("아이디 : ");
		String idValue = sc.nextLine();

		System.out.print("비밀번호 : ");
		String passValue = sc.nextLine();

		if (id.equals(idValue)) {
			if (password.equals(passValue)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String level = sc.nextLine();
		
		switch(level) {
		case "관리자":
			System.out.print("회원 관리, 게시글 관리, ");
			
		case "회원":
			System.out.print("게시글 작성, 댓글 작성, ");
			
		case "비회원":
			System.out.print("게시글 조회");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		String result = "";
		
		if(bmi < 18.5) {
			result = "저체중";
		} else if(bmi < 23) {
			result = "정상체중";
		} else if(bmi < 25) {
			result = "과체중";
		} else if(bmi < 30) {
			result = "비만"; 
		} else {
			result = "고도 비만";
		}
		System.out.println("BMI 지수 : " + bmi);
		System.out.println(result);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);
		
		double result = 0;
		
		
		
		if(num1 > 0 && num2 > 0 ) {
			if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
				System.out.println(num1 + ch + num2 + '=' + result);
			} else {
				System.out.println("잘 못 입력하셨습니다. 프로그램을 종료합니다.");
			} 
		} else {
			System.out.println("양수의 정수를 입력해주세요.");
		}
	}
}
