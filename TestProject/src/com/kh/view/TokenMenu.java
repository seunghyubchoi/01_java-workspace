package com.kh.view;

import java.util.Scanner;

import com.kh.controller.TokenController;

public class TokenMenu {
	TokenController tc = new TokenController();
	
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {

		while (true) {
			// 1. 지정 문자열 ➔ tokenMenu()
			System.out.println("1. 지정 문자열");
			// 2. 입력 문자열 ➔ inputMenu()
			System.out.println("2. 입력 문자열");
			// 3. 프로그램 끝내기 ➔ “프로그램을 종료합니다” 출력 후 종료
			System.out.println("9. 프로그램 끝내기");
			// 메뉴 번호 선택
			System.out.print("메뉴 번호 : ");
			int select = sc.nextInt();
			sc.nextLine();
			// 잘못 입력했을 시 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
			switch (select) {
			case 1:
				tokenMenu();
				break;
			case 2:
				inputMenu();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;

			}
		}
	}

	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";

		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		
		System.out.println("토큰 처리 후 글자 : " + tc.afterToken(str));
		System.out.println("토큰 처리 후 개수 : " + tc.afterToken(str).length());
		System.out.println("모두 대문자로 변환 : " + tc.afterToken(str).toUpperCase());
	}

	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		String str1 = sc.nextLine();
		
		// tc에 firstCap()로 입력 받은 문자열을 넘기고 반환 값 출력
		System.out.println(tc.firstCap(str1));
		System.out.println("찾을 문자를 하나 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		// tc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자를 인자로 넘겨
		// 반환 값 출력
		System.out.println(tc.findChar(str1, ch));

	}

}
