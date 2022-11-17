package com.kh.chap01_list.part01.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01.model.vo.Music;

public class ListRun {

	/*
	 * 컬렉션이란? 자료구조 개념이 내장되어 있는 클래스로 자바에서 제공하는 "자료구조"를 담당하는 "프레임워크"이다
	 * 
	 * - 자료구조 : 방대한 데이터를 보다 효율적으로 관리(조회, 정렬, 추가, 수정, 삭제) 할 수 있도록 도와주는 개념 - 프레임워크 :
	 * 이미 만들어져있는 틀(뼈대) => 그냥 가져다 씀
	 * 
	 * 배열의 단점을 컬렉션이 어떻게 극복했는가?
	 * 
	 * 배열의 단점과 컬렉션의 장점 배열의 단점
	 * 
	 * 1. 배열은 우선 크기를 지정해야됨!! 한번 지정된 크기를 변경 할 수가 없음 2. 배열 중간에 추가한다거나 삭제하는 경우 매번 땡겨주는
	 * 복잡한 알고리즘을 직접 기술해야 됨 3.한 공간에 한 타입의 데이터들만 저장 가능 새로운 값을 더 추가하고자 한다면 새로운 크기의 배열을
	 * 만들고 기존꺼를 복사하는 코드를 직접 기술
	 * 
	 * 컬렉션 장점 1. 크기 지정해줄 필요 없음, 만일 지정했다고 하더라도 더 많은 데이터들이 들어오면 알아서 사이즈 늘려줌 = 크기의 제약이
	 * 없음 2. 중간에 값을 추가한다거나 삭제하는 경우, 값을 땡겨주는 작업(알고리즘)을 직접 기술할 필요가 없음 단지 메소드 호출만으로
	 * 내부적으로 진행됨 3. 한 공간에 여러 타입의 데이터들 저장 가능
	 * 
	 * * 방대한 데이터들을 단지 보관만 해두고 조회만 할 경우 배열을 많이 사용 * 방대한 데이터들을 보관하고 추가 삭제 등등 이런 과정들이
	 * 빈번할 경우 컬렉션을 많이 사용
	 * 
	 */

	public static void main(String[] args) {
		ArrayList list = new ArrayList(3);
		// ArrayList는 크기 지정 할 수도 안 할 수도 있음(안하면 기본 크기 10)

		System.out.println(list);
		// 안에 아무것도 없음
		// E = Elecment : 리스트에 담길 데이터(요소)

		// 1. add(E e) : 리스트 공간 끝에 전달될 데이터 추가시켜주는 메소드

		list.add(new Music("Attention", "뉴진스"));
		list.add(new Music("쌔삥", "지아코"));
		list.add(new Music("죽일놈", "다이나믹 듀오"));
		list.add("가보자고");
		// 지정된 크기보다 더 많이 넣어도 오류가 안남 => 장점1: 크기의 제약이 없음
		// 다양한 타입의 데이터 담을 수 있음 => 장점3: 여러타입보관 가능

		System.out.println(list);

		// 2. add(int index, E e)
		// : 직접 인덱스를 저장해서 해당 인덱스 위치에 데이터를 추가시켜주는 메소드
		// list 특징 : 순서 유지하면서 담김(0번 인덱스부터 차곡차곡)
		list.add(1, new Music("진심이 담긴 노래", "케이시"));

		// 중간 위치에 데이터 추가 시, 복잡한 알고리즘 구현 안 함
		// => 장점 2

		System.out.println(list);

		// 3. remove(int index) : 해당 인덱스 위치의 데이터 삭제 시켜주는 메소드
		list.remove(1);
		System.out.println(list);

		// 4. set(int index, E e) : 해당 인덱스 위치의 데이터를 E로 수정시키는 메소드
		list.set(0, new Music("next level", "에스파"));
		System.out.println(list);

		// 5. size() : 해당 리스트의 사이즈를 반환 시켜주는 메소드
		// => 몇 개의 데이터가 담겨 있는지 알려준다
		System.out.println("리스트의 사이즈 : " + list.size());

		// 6. get(int index) : 해당 인덱스 위치의 객체를 반환 시켜주는 메소드
		Music m = (Music) list.get(0);
		System.out.println(m);
		String s = (String) list.get(3);
		System.out.println(s);

		System.out.println(list.get(1)); // list.get(1) 자체는 Object 타입
		System.out.println(((Music) list.get(1)).getTitle());
		// Object 타입이기 때문에 강제 형변환 해줘야한다

		// 7. subList(int index1, int index2) : List =>
		System.out.println("7. subList(int index1, int index2)");
		List sub = list.subList(0, 2); // list가 List 타입이므로 List 로 받아야함
		System.out.println("sub : " + sub);

		// 8. addAll(Collection c) // 컬렉션을 통째로 뒤에 추가시켜주는 메소드
		list.addAll(sub);
		System.out.println(list);

		// 9. isEmpty() : boolean => 컬렉션이 비어있는지 묻는 메소드
		System.out.println(list.isEmpty());

		// 10. clear() : 리스트 안에 있는 내용을 싹 비워주는 메소드
		//list.clear();

		System.out.println(list);
		System.out.println(list.isEmpty());

		// 반복문을 통해 순차적으로 출력
		System.out.println("=====================================");
		// 1) 단순한 for문
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("=====================================");
		// 2) 향상된 for문
		for(Object o : list) { // 가보자고가 있어서 Music이 아니고 모든 걸 담아둘 수 있는 Object
			System.out.println(o);
		}
	}	

}
