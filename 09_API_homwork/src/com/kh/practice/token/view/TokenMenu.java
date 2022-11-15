package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu { // start of class
	// field
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();

	// method
	public void mainMenu() { // start of mainMenu()
		System.out.println("최승협");
		while (true) { // while문 시작

			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");

			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) { // switch문 시작

			case 1: // 1. 지정 문자열 ➔ tokenMenu()
				tokenMenu();
				break;
			case 2: // 2. 입력 문자열 ➔ inputMenu()
				inputMenu();
				break;
			case 9: // 9. 프로그램 끝내기 ➔ “프로그램을 종료합니다” 출력 후 종료
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			default: // 잘못 입력했을 시 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			} // switch문 종료

		} // while문 종료

	} // end of mainMenu()

	public void tokenMenu() { // start of tokenMenu()

		String str = "J a v a P r o g r a m ";

		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		
		String token = tc.afterToken(str);
		
		System.out.println("토큰 처리 후 글자 : " + /*tc.afterToken(str)*/ token);
		System.out.println("토큰 처리 후 개수 : " + token.length());
		System.out.println("모두 대문자로 변환 : " + token.toUpperCase());

	} // end of tokenMenu()

	public void inputMenu() { // start of inputMenu()

		System.out.print("문자열을 입력하세요 : ");
		String input = sc.nextLine();

		// tc에 firstCap()로 입력 받은 문자열을 넘기고 반환 값 출력
		System.out.println("첫 글자 대문자 : " + tc.firstCap(input));

		System.out.print("찾을 문자를 하나 입력하세요 : ");
		char one = sc.nextLine().charAt(0);

		// tc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자를 인자로 넘겨 반환 값 출력
		System.out.println(one + " 문자가 들어간 개수 : " + tc.findChar(input, one));

	} // end of inputMenu()

} // start of class