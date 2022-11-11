package com.kh.run;

import com.kh.model.vo.Desktop;
import com.kh.model.vo.Electronic;
import com.kh.model.vo.NoteBook;
import com.kh.model.vo.Tablet;
import com.kh.model.vo.controller.ElectronicShop1;
import com.kh.model.vo.controller.ElectronicShop2;

public class ElectronicRun {

	public static void main(String[] args) {
	
		// 기능 구현 클래스 타입의 객체를 생성
		// ElectronicShop2 는 기능 구현 설계도 즉, 메소드 설계도라고 생각하고 그 것을 불러온다고 생각하자
		ElectronicShop2 es = new ElectronicShop2();
		
		// 생성한 객체로 기능 구현 클래스에 만들어 둔 insert 메소드로 객체 만들기
		es.insert(new Desktop("투니버스", "보노보노 컴퓨터", 3000000, "GeForce RTX 4090 24GB"));
		es.insert(new NoteBook("EBS", "도라의 노트북", 1500000, 5));
		es.insert(new Tablet("니켈로디언", "스펀지밥 패드", 990000, true));
		
		
		// select 메소드를 이용하여 출력하기 : select 메소드 자체
		System.out.println("===============================select 메소드 자체==================================");
		System.out.println();
		System.out.println(es.select(0));
		System.out.println(es.select(1));
		System.out.println(es.select(2));
		
		System.out.println();
		System.out.println("==================================다운 캐스팅======================================");
		System.out.println();
		
		// select 메소드를 이용하여 출력하기 2 : 자식 클래스 타입의 변수에 대입, 다운캐스팅
		Desktop d = (Desktop)es.select(0);
		NoteBook n = (NoteBook)es.select(1);
		Tablet t = (Tablet)es.select(2);
		
		// 0번 인덱스는 Desktop, 1번 인덱스는 NoteBook, 2번 인덱스는 Tablet 타입의 객체를 가리키고 있다.
		// 하지만 select의 반환형은 Electronic이므로 이들의 부모클래스이다.
		// 따라서 왼쪽 기준으로 하기에 오른쪽 부모클래스를 다운캐스팅을 통해 강제 형변환을 해주어야 한다
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		System.out.println();
		System.out.println("==============================부모 클래스 타입의 변수==================================");
		System.out.println();
		
		// select 메소드를 이용하여 출력하기 3 : 부모 클래스 타입의 변수 생성 및 대입
		Electronic e1 = es.select(0);
		Electronic e2 = es.select(1);
		Electronic e3 = es.select(2);
		
		// es.select로 생성된 객체는 반환형이 Electronic 타입이다
		// 같은 Electronic 타입의 변수를 만들어 주어 대입할 수 있다
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
	}

}
