package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Scanner;

public class MapPr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("보노보노", "01063034682");
		dic.put("하니", "01077775555");
		dic.put("조로", "0328823311");
		dic.put("마루코", "88282275431");
		dic.put("아구몬", "292929292929");
		dic.put("징징이", "0102222222200");
		dic.put("케로로", "33333344432");
		
		while(true) {
			System.out.println("친구 이름을 입력해 번호를 알아냅시다 : ");
			String name = sc.nextLine();
			
			if(name.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			String number = dic.get(name);
			if(number == null) {
				System.out.println(name + "는 없는 단어 입니다.");
			} else {
				System.out.println(number);
			}
		}
	}

}
