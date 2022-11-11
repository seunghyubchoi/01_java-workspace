package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Parents;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

// 다형성 개념을 적용 했을 때
public class ElectronicShop2 {
	// 용산 전자상가에 있는 가게
	// 3개 제품을 마련할 자리부터 만들자 => 창고

	// 다형성 : 부모타입 레퍼런스 하나로 다양한 자식 객체를 담을 수 있음

	// 부모 : Electronic
	// 자식 : Desktop, NoteBook, Tablet

	/* 예시)
	 * Parents[] arr = new Parents[4]; // 배열만 생성한 상태 
	 * arr[0] = new Child1(1, 2, 4); // 자동형변환 해준 상태, 에러 안남, 객체1
	 */

	// 부모타입의 배열로 모든 자식 객체를 다루기
	Electronic[] elec = new Electronic[3];
	int count = 0;
	
	// insert 함수구현
	// 매개변수 => Desktop, NoteBook, Tablet 전부 다 받을 수 있는 부모 Electronic으로 생성
	public void insert(Electronic any /*Electronic으로 부터 상속 받은 애들: Desktop, NoteBook, Tablet*/) {
		elec[count++] = any; 
		// elec[0] = Desktop, 종료 후 count = 1
		// elec[1] = NoteBook, 종료 후 count = 2
		// elec[2] = Tablet, 종료 후 count = 3
	}
	
	// 모르면 void로 만들자 => 나중에 수정 가능
	public Electronic select(int index) {
		return elec[index];
	}
	
}
