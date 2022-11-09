package com.kh.chap02_objectArray.run;
import java.util.Scanner;
import com.kh.chap02_objectArray.model.vo.*;
public class ObjectArrayRun {
	

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		// for loop 단순 for문
		for( int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	
	Phone[] phones = new Phone[3];
	System.out.println(phones);
	System.out.println(phones[0]);
//	phones[0].setName("돌폰"); // NullPointerException
	// 기본생성자로 객체 생성
	phones[0] = new Phone();
	
	phones[0].setName("폰은정");
	phones[0].setBrand("폰헬지");
	phones[0].setPrice(1000);
	phones[0].setSeries("폰");;
	
	// 매개변수 생성자로 객채 생성 및 값 초기화
	phones[1] = new Phone("아이폰", "삼성", 1300000, "Z FLIP");
	phones[2] = new Phone("갤럭시", "애플", 1300000, "11PRO");
	
	// 총가격과 평균가격
	int total = 0;
	
	for(int i = 0; i < phones.length; i++) {
		System.out.println(phones[i].information());
		// 누적합
		total += phones[i].getPrice();
	}
	System.out.println("총 가격 : " + total + "원");
	System.out.println("평균 가격 : " + total / phones.length + "원");
	
	// 사용자에게 구매하고자 하는 핸드폰명을 입력을 받아
	// 해당 휴대폰을 찾은 후에 그 가격을 알려주자
	
	Scanner sc = new Scanner(System.in);
	System.out.print("핸드폰 이름 : ");
	String buy = sc.nextLine();
	for(int i = 0; i < phones.length; i++) {
		if(phones[i].getName().equals(buy)) {
			System.out.println("당신이 구매하고자 하는 핸드폰의 가격은 : " + phones[i].getPrice() + "원 입니다");
		}
	}
	
	
	
	/*
	System.out.println(phones);
	System.out.println(phones[0]);
	System.out.println(phones[1]);
	System.out.println(phones[2]);
//	for(int i = 0; i < phones.length; i++)
	*/
	}

}
