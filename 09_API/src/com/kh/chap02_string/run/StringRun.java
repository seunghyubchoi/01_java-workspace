package com.kh.chap02_string.run;
import java.util.Scanner;
import java.time.LocalDate;

import com.kh.chap02_string.controller.A_StringPoolTest;
import com.kh.chap02_string.controller.B_StringMethodTest;
import com.kh.chap02_string.controller.C_StringTokenizerTest;

public class StringRun {

	public static void main(String[] args) {
		A_StringPoolTest a = new A_StringPoolTest();
		// a.method1();
		// a.method2();
		
		B_StringMethodTest b = new B_StringMethodTest();
		b.method();
		LocalDate now = LocalDate.now();
		
		C_StringTokenizerTest c = new C_StringTokenizerTest();
		c.method();
		/*
		System.out.println(now);
		int thisYear = now.getYear();
		System.out.println("올해 년도 : " + thisYear);
		int adultYear = thisYear -19;
		System.out.println("올해 성인 년도 : " + adultYear);
		
		int thisMonth = now.getMonthValue();
		System.out.println("이번 달 : " + thisMonth);
		
		int thisDay = now.getDayOfMonth();
		System.out.println("오늘 일 : " + thisDay);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("생년월일을 입력해주세요 : ");
		int myYear = sc.nextInt();
		if(myYear >= adultYear) {
			System.out.println("성인이 아닙니다");
			
		} 
		*/
	}

}
