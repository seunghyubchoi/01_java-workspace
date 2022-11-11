package com.kh.model.vo.controller;

import com.kh.model.vo.Electronic;

public class ElectronicShop2 {
	// controller 폴더에 사용된 클래스는 '기능 구현'을 위해 만들어지며
	// 주로 메소드를 만드는 곳
	
	
	// 부모 타입의 배열로 모든 자식 클래스의 자식 객체 생성하기
	Electronic[] elec = new Electronic[3]; // 자식 클래스가 3개이므로 배열의 크기도 3으로 지정

	// insert 함수 구현, setter 메소드로 생각하면 됨
	// 매개변수 => Desktop, NoteBook, Tablet 전부 다 받을 수 있는 부모 Electronic으로 생성

	int count = 0;
	// 배열의 값을 숫자로 지정하는 하드 코딩을 피하기 위해 변수 count를 만들고 배열의 첫 인덱스 넘버인 0을 대입
	
	public void insert(Electronic any) {
		// 메소드 작성 시 헷갈린다면 반환형은 void로 시작해주자
		// 'Electronic'은 'Electronic 타입'을 의미하며 'any'는 Electronic 타입의 변수를 의미한다
		// Electronic 타입으로 사용 할 수 있는 것은 Electronic을 상속 받은 Desktop, NoteBook, Tablet이 있다
		
		elec[count++] = any;
		// count '0'이 대입되고 후위 연산자로 count의 값은 다음 배열에 사용 될 땐 1로 증가 한다
		// elec[0] = Desktop, 종료 후 count = 1
		// elec[1] = NoteBook, 종료 후 count = 2
		// elec[2] = Tablet, 종료 후 count = 3
	}
	
	// select 함수 구현, getter 메소드로 생각하면 됨
	public Electronic select(int index) {
		return elec[index];
		// 반환형은 Electronic으로 만들어진 객체를 반환해야 하므로 Electronic을 void 대신 적어주자
		// getter 메소드에는 매개변수를 주지 않았다
		// 그런데 여기서는 줘야한다, 그래야 int형 매개변수를 통해 return 값에 있는 elec의 index 넘버를 입력 받을 수 있으니까
		
	}

}
