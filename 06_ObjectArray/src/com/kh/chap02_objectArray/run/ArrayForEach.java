package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayForEach {

	public static void main(String[] args) {
		
		
		// for each문 (향상된/개선된 for문)
		// 배열 또는 컬렉션과 함께 사용됨
		// 배열 또는 컬렉션의 0번 인덱스부터 마지막 인덱스까지 순차적으로 모두 접근할 목적일 때
		// 일부 출력시에는 for each 사용 x
		
		/*
		 * for(순차적으로 접근할 값을 담을 변수 선언 : 순차적으로 접근할 배열 또는 컬렉션 이름) {
		 * 		//반복 횟수 : 배열 또는 컬렉션의 크기
		 * 		반복적으로 실행할 내용
		 * }
		 * 
		 * 
		 */
		int[] arr = {10, 20, 30};
		for(int value : arr) { // value => arr[0] => value = arr[1] => value = arr[2]
			System.out.println(value);
		}
		
		Phone[] phones = new Phone[3];
		
		phones[0] = new Phone("갤럭시", "삼성", 1500000, "노트20");
		phones[1] = new Phone("아이폰", "애플", 1300000, "12미니");
		phones[2] = new Phone("벨벳", "엘지", 900000, "없음");
		
		phones[2].setSeries("1");
		
		int total = 0;
		for(Phone p : phones) { // p = phones[0] => p = phones[1] => p = phones[2]
			//System.out.println(phones[i].information());
			System.out.println(p.information());
			// 누적합
			total += p.getPrice();
			System.out.println("합계 : " + total + "원");
			System.out.println("평균 : " + total / phones.length + "원");
		}
			Scanner sc = new Scanner(System.in);
			System.out.print("구매하고자 하는 핸드폰 : ");
			String buy = sc.nextLine();
			
			for(Phone p : phones) { 
				if(p.getName().equals(buy)) {
					System.out.println(p.getPrice() + "원");
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}

}
