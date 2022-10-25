package com.kh.operator;
import java.util.Scanner;
public class G_Triple {
	public void method1() {
		/*
		 * 삼항연산자
		 * (항목 3개를 가지고 연산 해주는 연산자)
		 * [표현법]
		 * (조건식) ? 조건식이 참일 경우 돌려줄 결과 값 : 거짓일 경우 돌려줄 결과 값
		 * 이때, 조건식은 반드시 true, false가 나오도록 작성해야 됨 !
		 * 주로 비교, 논리 연산자를 통해 작성할꺼임~~
		 */
		
		//입력받은 정수 값이 양수인지 아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요~~^ㅁ^ : ");
		int num = sc.nextInt();
		String result = (num > 0) ? "양수입니다~~^3^" : "음수입니다~~^o^";
		System.out.print(num + "은(는) " + result);
		//가독성이 안 좋은 예
		//System.out.println(num + "은(는)" + ((num > 0) ? "양수입니다~~^3^" : "음수입니다~~^o^"));	
		
	}
	
	public void method2() {
		// 입력 받은 정수값이 짝수인지 홀수인지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요~~^3^ : ");
		int num = sc.nextInt();
		//String result = (num % 2 == 0) ? "짝수입니다~~ㅎ_ㅎ" : "홀수입니다~~*^^*";
		//System.out.println(num + "은(는) " + result);
		String result = (num % 2 == 1) ? "홀수입니다~~*^^*" : "짝수입니다~~ㅎ_ㅎ";
		System.out.println(num + "은(는) " + result);
		
	}
	
	public void method3() {
		//사용자에게 종료여부를 입력 받아 판별해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("종료하시려면 Y를 입력해주세용^^ : ");
		char ch = sc.nextLine().charAt(0);
		String result = (ch == 'Y' || ch == 'y') ? "프로그램을 종료합니당" : "계속 진행하겠습니당";
		System.out.println(result);
		
	}
	public void method4() {
		//입력 받은 문자 값이 영어 소문자인지 아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		//String result = (ch > 97 && ch < 123) ? "소문자입니다" : "소문자가 아닙니다";
		String result = (ch > 'a' && ch < 'z') ? "소문자입니다" : "소문자가 아닙니다";
		System.out.println(result);
	}
	public void method4_1() {
		// 사용자에게 값을 입력 받아서 0보다 큰지 작은지 판별하는 프로그램 작성
		// 숫자 하나 입력 :
		// 변수 : num 
		// 출력 예시 : 입력하신 숫자 7은 0보다 큽니다
		// 입력하신 숫자 -4는 0 또는 0 보다 작습니다
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나 입력 : ");
		int num = sc.nextInt();
		String result = (num <= 0) ? "입력하신 숫자 " + num + "은(는) 0 또는 0 보다 작습니다" : "입력하신 숫자 " + num + "은(는) 0보다 큽니다";
		System.out.println(result);
		
	}
	public void method5() {
		//사용자가 입력한 정수 값이 
		//양수인지 음수인지 0인지를 정확하게 판별한 후 출력
		//삼항연산자 중첩!
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 입력 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수입니다" : (num == 0) ? "0 입니다" :  "음수입니다";
		System.out.println(num + "은(는) " + result);		
				
				
				
	}
	public void method6() {
		// 사용자에게 두 개의 정수 값 입력 받고
		// + 또는 -를 입력받아 그에 맞는 연산 결과를 출력
		// 단, 의외의 다른 문자를 입력했을 경우 "잘 못 입력했습니당" 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 값 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번쨰 정수 값 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine(); //버퍼에 남아있는 엔터 제거를 위한 코드
		
		System.out.print("연산자 입력(+ 또는 -) : ");
		char op = sc.nextLine().charAt(0);
		
		String result = (op == '+') ? (num1 + num2 + "") : (op == '-') ? (num1 - num2 + "") : "잘 못 입력했습니당";
		// int형 변수에 ""를 붙여줘서 String형으로 바꿔주고 String result 변수에 넣을 수 있게 만든다
		System.out.println("결과 : " + result);
		
	}
}
