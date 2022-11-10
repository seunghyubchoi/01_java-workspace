package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parents;

public class PolyRun {

	public static void main(String[] args) {

		// 기억해둘것!!! '=' 기준으로해서 왼쪽과 오른쪽의 자료형(타입)은 같아야됨!!!

		System.out.println("1. 부모타입 레퍼런스로 부모객체를 다루는 경우");
		Parents p1 = new Parents(); // Parents 영역 이용 가능
		p1.printParents();
		// p1 레퍼런스로 Parents 에만 접근 가능

		System.out.println("2. 자식타입 레퍼런스로 자식객체를 다루는 경우");
		Child1 ch1 = new Child1(); // //Parents 영역 이용 가능, Child 영역 이용 가능
		ch1.printChild1();
		ch1.printParents(); // 자료형이 다른데 에러가 안뜸 = 작은 자료형에서 큰 자료형으로 자동형변환이 됨

		/*
		 * ch1.printChild1(); ch1.printParents(); 자식클래스에서 부모클래스로 접근 가능
		 */
		((Parents) ch1).printParents(); // 괄호가 생략 되어 있다고 보면 됨(강제형변환 필요없음)
		// 상속을 받게 되면서 자동 형변환 = (Child1 => Parents)
		// c1 레퍼런스로 Child1, Parents 둘다 접근 가능
		// Parents 접근시 자동으로 형변환 된 채로 진행된 것

		System.out.println("3. 부모타입 레퍼런스로 자식객체를 다루는 경우");
		Parents p2 = new Child1(); // Parents 영역 이용 가능, Child 영역 이용 불가능
		// 자료형이 다른데 에러가 안뜸 = 자동형변환이 됨
		// 형변환이 Child1에서 Parents로 바뀐 것 = (Parents)new Child1
		p2.printParents();
		/*
		 * p2.printParents(); // 얘는 가능 p2.printChild1(); // 얘는 불가능 (부모클래스에서 자식클래스로 접근
		 * 불가)
		 */
		((Child1) p2).printChild1(); // 강제형변환 형태, 큰 자료형에서 작은 자료형으로는 자동형변환 없음
		// Parents 자료형이였던 p2를 Child1 자료형으로 강제형변환으로 호출 가능
		// p2 레퍼런스로 지금 당장은 Parents에만 접근 가능하지만
		// Child1에 접근하고자 한다면 강제형변환을 통해 접근해야한다!

		/*
		 * 상속 구조의 클래스들 간에는 형변환 가능
		 * 
		 * 1. UpCasting 자식타입 => 부모타입으로 형변환(자동형변환 O) Ex. 자식.부모메소드(); 부모.(부모)자식객체(); 상위
		 * 타입을 따라감(큰 것)
		 * 
		 * 2. DownCasting 부모타입 => 자식타입으로 형변환(자동형변환 X, 강제형변환 O) Ex. 부모.자식메소드()를 쓰고 싶다면,
		 * ((자식)부모).자식메소드()로 형변환 해 줘야함
		 * 
		 * *** 상속구조 아니면 안된다 ***
		 * 
		 */

		// 다형성 정의
		// : 부모타입으로부터 파생된 여러가지 타입의 자식 객체들을 부모클래스 타입 하나로도 다룰 수 있다.

		// 다형성 목적

		// 다형성을 배우기 전...
		// Child1 객체 2개랑 Child2 객체 2개를 관리해야함 총 4개

		Child1[] arr1 = new Child1[2]; // arr1이라고 하는 배열'만' 생성, 객체1 (왼쪽 오른쪽 둘 다 Child1 자료형)
		arr1[0] = new Child1(1, 2, 4); // 생성자로 Child1 객체 생성 완료, 객체2
		arr1[1] = new Child1(2, 3, 5);

		System.out.println("===arr1[0]===");
		System.out.println(arr1[0].getX());
		System.out.println(arr1[0].getY());
		System.out.println(arr1[0].getZ());

		System.out.println("===arr1[1]===");
		System.out.println(arr1[1].getX());
		System.out.println(arr1[1].getY());
		System.out.println(arr1[1].getZ());

		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(2, 1, 5); // 객체3
		arr2[1] = new Child2(5, 7, 2); // 객체4

		System.out.println("===arr2[0]===");
		System.out.println(arr2[0].getX());
		System.out.println(arr2[0].getY());
		System.out.println(arr2[0].getN());

		System.out.println("===arr2[1]===");
		System.out.println(arr2[1].getX());
		System.out.println(arr2[1].getY());
		System.out.println(arr2[1].getN());

		// System.out.println("=====================================================");

		// 다형성을 배운 후...
		Parents[] arr = new Parents[4]; // 배열만 생성한 상태
		// arr[i]가 모두 Parents 타입
		arr[0] = new Child1(1, 2, 4); // 자동형변환 해준 상태, 에러 안남, 객체1
		arr[1] = new Child2(2, 1, 5); // 객체2
		arr[2] = new Child2(5, 7, 2); // 객체3
		arr[3] = new Child1(2, 3, 5); // 객체4
		// 하나의 부모타입만으로 여러 자식 객체를 받을 수 있음 => 편리하다, 코드길이 감소

		System.out.println("=============================================");
		// Parents[] arr = new Parents[4] = 부모 객체임

		arr[0].printParents(); // arr[0]은 부모객체 = 부모메소드 호출
		((Child1) arr[0]).printChild1(); // arr[1] 부모객체 = 자식메소드 호출 => 강제형변환 필요
		((Child2) arr[1]).printChild2();
		// ((Child1)arr[2]).printChild1(); ClassCastException
		// arr[2] = Child2인데 Child1을 사용하려고 시도 해서 나타난 에러: 부적절한 형변환
		((Child2) arr[2]).printChild2();
		((Child1) arr[3]).printChild1();

		System.out.println("==================반목문 이용해서 출력=================");
		for (int i = 0; i < arr.length; i++) {

			/*
			 * instanceof 연산자 => 연산결과 true, false로 반환 현재 레퍼런스가 실질적으로 어떤 클래스 타입을 참조하는지 확인할 때
			 * 사용
			 * 
			 */

			/* if (i == 0 || i == 3) { */
			if (arr[i] instanceof Child1) {
				((Child1) arr[i]).printChild1();
			} else {
				((Child2) arr[i]).printChild2();
			}
		} // 양다리 : 공유 (연상) 오빠~~~ // 은우 (연하) 은우야~~~

		System.out.println("================================================");

		Parents pp = new Child1();
		pp.print();
		
		/*
		 * 동적바인딩 : 프로그램이 실행 되기 전에는 컴파일 되면서 정적 바인딩(레퍼런스 타입(pp)의 메소드를 가리킴)
		 * 			단, 실질적으로 참조하는 자식클래스에 해당 메소드가 오버라이딩이 돼 있다면(동일 이름의 메소드),
		 * 			프로그램 실행 시, 동적으로 그 자식클래스의 오버라이딩 된 메소드를 찾아서 실행
		 */
		
		System.out.println("===================동적바인딩 반복문==================");
		for(int i = 0; i < arr.length; i++) {
			arr[i].print();
		}

		System.out.println("===arr[0]===");
		System.out.println(arr[0].getX());
		System.out.println(arr[0].getY());
		// System.out.println(arr[0].getZ());

		System.out.println("===arr[1]===");
		System.out.println(arr[1].getX());
		System.out.println(arr[1].getY());
		// System.out.println(arr[1].getN());

		System.out.println("===arr[2]===");
		System.out.println(arr[2].getX());
		System.out.println(arr[2].getY());
		// System.out.println(arr[2].getN());

		System.out.println("===arr[3]===");
		System.out.println(arr[3].getX());
		System.out.println(arr[3].getY());
		// System.out.println(arr[3].getZ());

	}
}
