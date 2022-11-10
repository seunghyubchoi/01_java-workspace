package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class InheritRun {
	public static void main(String[] args) {
		// 객체 생성
		// 매개변수 생성자로 객체 생성
		Car car = new Car("무당벌레차", 50, "소형차", 5); // 자식 객체는 car 
		Ship ship = new Ship("타이타닉", 95000, "유람선", 38); // 자식 객체는 ship
		Airplane airplane = new Airplane("종이비행기", 0.01, "경비행기", 3, 10); //  자식 객체는 airplane 

		// 객체 출력
		System.out.println(car.information());
		System.out.println(ship.information());
		System.out.println(airplane.information());
		
		car.howToMove();
		ship.howToMove();
		airplane.howToMove();
		
		/*
		 * 상속의 장점
		 * 보다 적은 양의 코드로 새로운 클래스 작성 가능
		 * 코드를 공통적으로 관리하기 때문에 코드의 추가나 변경에 용이(유지보수, 생산성 up!)
		 * 클래스 간의 상속은 다중상속이 불가능하다 (단일 상속만 가능, 부모는 하나다)
		 * 부모클래스에 정의 돼 있는 protected 필드는 자식클래스에서 직접 접근 가능
		 * 자식 객체는 부모클래스에 있는 메소드를 마치 내 것처럼 호출 가능
		 * 부모 클래스에 있는 메소드가 맘에 안들면 자식 클래스에서 오버라이딩 가능
		 * (자식클래스에서 오버라이딩을 통해 내 맘대로 재정의 가능)
		 * 명시되어 있지는 않지만 모든 클래스(제공하는 클래스, 직접 만드는 클래스)는 Object 클래스의 후손이다.
		 * Object 클래스에 있는 메소드를 마음대로 호출 가능, 모든 클래스의 클래스 
		 * 뿐만 아니라 오버라이딩을 통해서 재정의도 가능
		 * public class InheritRun "extends Object"
		 */
		
		System.out.println(car.hashCode());
		System.out.println(car.equals(ship));
		System.out.println(car);
		System.out.println(car.toString()); //그냥 car 호출하는 거랑 같음
		
		// 객체 배열 생성
		
		// Car 배열 생성
		Car[] cArr = new Car[3];
		
		// Ship 배열 생성
		Ship[] sArr = new Ship[3];
		
		// Airplane 배열 생성
		Airplane[] aArr = new Airplane[3];

		
	}

}
