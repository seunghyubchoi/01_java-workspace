package com.kh.chap03_map.part01_hashMap.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class Controller implements MethodList {
	Scanner sc = new Scanner(System.in);
	HashMap<String, String> dic = new HashMap<String, String>();

	@Override
	public void addNumber(String key, String value) {
		boolean flag = true;
		if (!value.contains("-")) {
			char ch = '-';
			value = value.substring(0, 3) + ch + value.substring(3, 7) + ch + value.substring(7, 11);
		}
		for (String s : dic.values()) {

			if (value.equals(dic.get(s))) {
				System.out.println("이미 있는 번호 입니다.");
				flag = false;
			}
		}
		if (flag == true) {
			dic.put(key, value);

			System.out.println(key + "님의 번호 " + value + "이(가) 추가되었습니다.");

		}
	}

	@Override
	public String searchByName() {

		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		String number = dic.get(name);
		if (number == null) {
			System.out.print(name + "는 없는 단어 입니다.");
		}
		return number;

	}

	@Override
	public HashMap<String, String> showAllNumber() {
		return dic;
	}

	@Override
	public HashMap<String, String> removeAllNumber() {
		dic.clear();

		return dic;
	}

	@Override
	public HashMap<String, String> removeByName() {
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		System.out.println(name + "님의 전화번호를 삭제하겠습니다");

		dic.remove(name);

		/*
		 * Set keySet = dic.keySet(); Iterator itKey = keySet.iterator(); while
		 * (itKey.hasNext()) { String key = (String) itKey.next(); if (key.equals(name))
		 * { dic.remove(key); } }
		 */
		return dic;
	}

}
