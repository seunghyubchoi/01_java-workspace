package com.kh.chap01_list.part01.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListSortRun {

	public static void main(String[] args) {
		// ArrayList 생성
		ArrayList<String> list = new ArrayList<String>();
		{ // 초기화 블럭
			list.add("C");
			list.add("A");
			list.add("B");
			list.add("a");			
		}
		System.out.println("원본 : " + list);
		
		// 예전 방식
		
		// 오름차순 정렬
		
		// Collections.sort(list);
		
		list.sort(Comparator.naturalOrder());
		
		System.out.println("오름차순 : " + list);
		
		// 내림차순 정렬
		
		// Collections.sort(list, Collections.reverseOrder()); // argument를 하나 더 추가해서 만듭니다
		
		list.sort(Comparator.reverseOrder());
		
		System.out.println("내림차순 : " + list);
		
		// 대소문자 구분없이 오름차순
		
		// Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		
		list.sort(String.CASE_INSENSITIVE_ORDER);
		
		System.out.println("대소문자 구분없이 오름차순" + list);
		
		// 대소문자 구분없이 내림차순
		
		// Collections.sort(list, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
		
		list.sort(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
		
		System.out.println("대소문자 구분없이 내림차순 : " + list);
		
		
		
	}

}
