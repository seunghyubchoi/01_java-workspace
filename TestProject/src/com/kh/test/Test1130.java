package com.kh.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;


public class Test1130 {

	public static void main(String[] args) {
		String str = "하이,그래,잘가,응아니야";
		String[] arr = str.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// Wrapper = 기본자료형을 객체로 바꿔주는 클래스 뭐 그렇다
		String str2 = "777";
		int num = Integer.parseInt(str2);
		System.out.println(num);

		
		// 스토나: 구분자로 짤라서 !토큰!으로 맨듦 후 사용
		StringTokenizer stn = new StringTokenizer(str, ",");

		System.out.println(stn.countTokens());

		while (stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
		
		// Date 함수
		Date date1 = new Date();

		System.out.println(date1);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		String formatDate = sdf.format(date1);
		System.out.println(formatDate);

		try {
			
			// ArithmeticException
			// int num1 = 3/0;
			
			// NullPointerException
			// String[] arr1 = null;
			// System.out.println(arr1.length);
			
			// ArrayIndexOutOfBoundsException
			// String[] arr1 = new String[3];
			// System.out.println(arr1[3]);
			
			// NegativeArraySizeException
			// Scanner sc = new Scanner(System.in);
			// System.out.println("배열의 크기 : ");
			// int size = sc.nextInt();
			// String[] arr1 = new String[size];			
		
		
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누지 마세염");
		} catch (NullPointerException e) {
			System.out.println("null값밖에 없어염");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스값 범위 아니에여");
		} catch (NegativeArraySizeException e) {
			System.out.println("배열의 값을 음수로 지정하지말아유");
		} 
		
		
		// map - keyset, entryset 이해
		HashMap hm = new HashMap();
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸쵸", new Snack("옥수수맛", 600));
		System.out.println(hm);
		System.out.println(hm.get("다이제"));
		System.out.println(hm.size()); // 2
		
		//iterator only for list / set
		//우회법 = map계열을 set계열로 ~~
		//1."""keySet() 맨들기"""
		Set keySet = hm.keySet(); //hm에 있는 key만 set에 담아줌, keySet은 이름
		// hm의 key 값만 keySet에 담긴 상태 ex. 다이제 칸쵸 새우깡
		
		// 2) 1번 과정에서 작업된 keySet을 """iterator에 담기"""
		Iterator itKey = keySet.iterator(); // itKey는 이름
		// 실행하는 순간 itKey 공간이 생긱고 keySet.iterator(); 
		// 사용시 keySet의 값이 하나씩 Iterator itKey에 들어감

		// 3) 반복문을 통해서 뽑기
		while (itKey.hasNext()) {
			String key = (String) itKey.next();
			Snack value = (Snack) hm.get(key);
			System.out.println(key + " = " + value);
		}
			
	} 
	
	
}
