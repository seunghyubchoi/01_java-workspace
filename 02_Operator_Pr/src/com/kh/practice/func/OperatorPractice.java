package com.kh.practice.func;

import java.util.Scanner;
 
public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력한 정수 값 : ");
		int num = sc.nextInt();
		String result = (num > 0) ? "양수다" : "양수가 아니다";
		System.out.print(result);
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력한 정수 값 : ");
		int num = sc.nextInt();
		String result = (num > 0) ? "양수다" : (num < 0) ? "음수다" : "0이다";
		System.out.print(result);
	} 

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력한 정수 값 : ");
		int num = sc.nextInt();
		String result = (num % 2 == 0) ? "짝수다" : "홀수다";
		System.out.print(result);
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();

		System.out.print("사탕 수 : ");
		int num2 = sc.nextInt();

		String candy = "1인당 사탕 개수 : " + (num2 / num1);
		String leftover = "남는 사탕 개수 : " + (num2 % num1);

		System.out.println(candy);
		System.out.println(leftover);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		//sc.nextLine();
		
		System.out.print("반(숫자만) : ");
		int clas = sc.nextInt();	
		//sc.nextLine();
		 
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();		
		sc.nextLine();
				
		System.out.print("성별(M/F) : ");
		char ch = sc.nextLine().charAt(0);
		//String genderResult = (ch == 'M' || ch == 'm') ? "남학생" : (ch == 'F' || ch == 'f') ? "여학생" : "성별을 잘 못 입력하셨습니다.";
		//ch = (ch == 'M') || (ch == 'm') ? '남' : '여';
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다",grade, clas, num, ch, name, score);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 값 : ");
		int age = sc.nextInt();
		String result = (age > 19) ? "성인" : (age <= 13) ? "어린이" : "청소년";
		System.out.print(result);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		System.out.print("영어 : ");
		int english = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int overall = (korean + english + math);
		double average = /*(korean + english + math)*/ overall / 3;
		
		System.out.println("합계 : " + overall);
		System.out.printf("평균 : %.1f\n",average);
		
		
		String result = (korean >= 40 & english >= 40 & math >= 40 & average >= 60) ? "합격" : "불합격";
		System.out.println(result);
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String num = sc.nextLine();
		char ch = num.charAt(7);
		String result = (ch == '1') ? "남자" : (ch == '2') ? "여자" : "잘 못 입력하셨습니다";
		System.out.print(result);
		
	
	}
	
}
