package com.kh.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
	}

	public String afterToken(String str) {
		StringTokenizer stn = new StringTokenizer(str, " ");
		String stn2= "";
		
		while(stn.hasMoreTokens()) {
			stn2 += stn.nextToken();
		}
				
		return stn2;
	}

	public String firstCap(String input) {
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
		input = input.toUpperCase().substring(0, 1) + input.substring(1);
		
		return input;
	}

	public int findChar(String input, char one) {
		// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
		int count = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == one) {
				count++;
			}
		}
		return count;
	}
}
