package com.kh.test;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopy2 {

	public static String[] add(String[] originArray, String var) {
		// 새 배열 생성
		String[] newArray = new String[originArray.length + 1];
		// arraycopy()
		System.arraycopy(originArray, 0, newArray, 0, originArray.length);
		// 새 배열에 마지막 값 할당
		newArray[originArray.length] = var;
		// 배열 반환
		return newArray;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] strArray = { "뉴칼레도니아 ", "사과 " };
		while (true) {
			// 배열과 변수를 매개변수로 하는 메소드 호출
			System.out.println("입력 값 : ");
			String input = sc.nextLine() + " ";

			char[] str2 = strArray[0].toCharArray();

			strArray = add(strArray, input);

			System.out.println(Arrays.toString(strArray));
			System.out.println(str2[(int) (Math.random() * str2.length)]);

		}
	}
}
