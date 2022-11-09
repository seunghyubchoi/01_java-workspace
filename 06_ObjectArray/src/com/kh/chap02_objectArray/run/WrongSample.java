package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class WrongSample {

	public static void main(String[] args) {
		
		Phone[] arr = new Phone[3];
		
		// 객체 생성해주고 다시 arr[i].getName을 호출하면 null 값이 나옴
		arr[0] = new Phone();
		arr[1] = new Phone();
		arr[2] = new Phone();
		
		
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName());
			// 잘못된 부분
			// 1. java.lang.NullPointerException
			// 객체배열의 각 인덱스에 담긴 값이 null인 상태에서 메소드를 호출하려고 했기 때문에
			// 조치내용 => 객체배열을 만든 후 각 인덱스별로 객체 생성을 진행해야함.
			
			
			// 2.java.lang.ArrayIndexOutOfBoundsException
			// 배열의 적절한 인덱스 범위를 벗어났기 때문에
			// 조건식으로 i <= 배열의 길이 라고 제시 돼 있음.
			// 배열의 인덱스보다 큰 값이 제시
			// 조치내용 => i <= arr.length 가 아닌 i < arr.length 로 조건식 수정
			
			
		}
		
	}

}
