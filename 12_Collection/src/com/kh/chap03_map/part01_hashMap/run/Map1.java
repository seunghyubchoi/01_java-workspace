package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Scanner;

public class Map1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> dic = new HashMap<String, String>();
		// put
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		while(true) {
			System.out.print("찾고 싶은 단어는? : ");
			String word = sc.nextLine();
			
			if(word.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				return;
			}
			String kor = dic.get(word);
			if(kor == null) { // null은 equal 대신 ==도 가능
				System.out.println(word + "는 없는 단어 입니다.");
			} else {
				System.out.println(kor);
			}
		}
		// 이름을 입력해서 전화번호 찾기
		
		
	}

}
