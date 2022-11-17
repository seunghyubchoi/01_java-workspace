package com.kh.chap02_objectArray.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayListRun {

	public static void main(String[] args) {
		ArrayList<Phone> list = new ArrayList<>(); // 뒤에는 생략 가능 JDK6 이상

		list.add(new Phone());
		list.add(new Phone("아이폰", "애플", 1300000, "21MINI"));
		list.add(new Phone("갤럭시", "삼성", 1200000, "Z플립 9"));

		list.get(0).setName("벨벳폰");
		list.get(0).setBrand("엘지");
		list.get(0).setPrice(1000000);
		list.get(0).setSeries("돌아온 벨벳");

		// 총 가격과 평균 가격을 구해봅시다
		int total = 0;
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).information());
			total += list.get(i).getPrice();
		}

		// 핸드폰 이름 입력받아 찾은 후 가격 알려주기

		System.out.println("총 가격 : " + total + "원");
		System.out.println("평균가: " + total / list.size() + "원");

		Scanner sc = new Scanner(System.in);
		System.out.println("구매하고자 하는 핸드폰 이름 : ");
		String buy = sc.nextLine();
		for (Phone p : list) {
			if (p.getName().equals(buy)) {
				System.out.println("당신이 구매하고자 하는 핸드폰의 가격은 : " + p.getPrice() + "원 입니다.");

			}
		}
		/*
		 * while (true) {
		 * 
		 * for (int i = 0; i < list.size(); i++) { if
		 * (buy.equals(list.get(i).getName())) {
		 * System.out.println("당신이 구매하고자 하는 핸드폰의 가격은 : " + list.get(i).getPrice() +
		 * "원 입니다."); } }
		 * 
		 * }
		 */

	}

}
