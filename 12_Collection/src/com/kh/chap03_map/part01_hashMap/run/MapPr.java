package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.controller.Controller;
import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapPr {

	public static void main(String[] args) {

		HashMap<String, String> dic = new HashMap<String, String>();

		dic.put("보노보노", "01063034682");
		dic.put("하니", "01077775555");
		dic.put("조로", "01066665555");
		dic.put("마루코", "01011112222");
		dic.put("아구몬", "01088887777");
		dic.put("징징이", "01033335555");
		dic.put("케로로", "01099993333");

		printPhoneBook(dic);

	}

	public static void printPhoneBook(HashMap<String, String> Pbook) {
		Controller cn = new Controller();
		Scanner sc = new Scanner(System.in);

		Set<Entry<String, String>> entrySet = Pbook.entrySet();
		Iterator<Entry<String, String>> itEntry = entrySet.iterator();

		while (itEntry.hasNext()) {
			Entry<String, String> entry = itEntry.next();

			String key = entry.getKey();
			String value = entry.getValue();
			if(!value.contains("-")) {
				char ch = '-';
				value = value.substring(0, 3) +  ch + value.substring(3,7) + ch + value.substring(7, 11);
			}
			cn.addNumber(key, value);
		}

		boolean flag = true;
		try {
			while (true) {

				String name = null;

				System.out.println("==========================================");
				System.out.println("승협이의 전화번호부");
				System.out.println("1. 전화번호 조회");
				System.out.println("2. 전화번호 추가");
				System.out.println("3. 전화번호 삭제");
				System.out.println("4. 프로그램 종료");
				System.out.println("==========================================");
				System.out.print("메뉴 번호를 입력하세요 : ");
				int menu = sc.nextInt();
				sc.nextLine();

				switch (menu) {
				case 1:
					System.out.println("==========================================");
					System.out.println("1. 전체 조회");
					System.out.println("2. 이름으로 검색");
					System.out.println("3. 이전으로");
					System.out.println("==========================================");
					System.out.print("메뉴 번호를 입력하세요 : ");
					menu = sc.nextInt();
					sc.nextLine();
					if (menu == 1) {
						System.out.println(cn.showAllNumber());

					} else if (menu == 2) {
						System.out.println(cn.searchByName());
					} else if (menu == 3) {
						flag = true;
					}

					break;
				case 2:
					System.out.print("이름을 입력하세요 : ");
					name = sc.nextLine();
					System.out.print("번호를 입력하세요 : ");
					String number = sc.nextLine();
					cn.addNumber(name, number);

					break;
				case 3:
					System.out.println("==========================================");
					System.out.println("1. 전체 삭제");
					System.out.println("2. 이름으로 삭제");
					System.out.println("3. 이전으로");
					System.out.println("==========================================");
					System.out.print("메뉴 번호를 입력하세요 : ");
					menu = sc.nextInt();
					sc.nextLine();

					if (menu == 1) {
						cn.removeAllNumber();

					} else if (menu == 2) {
						System.out.println(cn.removeByName());
					} else if (menu == 3) {
						flag = true;
					}

					break;
				case 4:
					System.out.println("프로그램을 종료합니다");
					return;

				default:
					System.out.println("메뉴 상의 숫자를 입력해주세요");
					break;
				}

			}
		} catch (Exception e) {
			
			System.out.println("올바른 입력이 아닙니다");
			
			
		} finally {

		}

	}

}
