package com.kh.chap02_set.part01_hashSet.run;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {
		// hashCode
		// Object hashCode() => 해당 객체의 "주소값"을 가지고 10진수 형태로 만들어서 반환
		// (배열배울때 그냥 arr은 16진수인디 arr.hashCode 하면 16진수의 주소 값을 10진수 형태 주소 값)
		// Object equals() => 두 객체의 "주소값"을 비교해서 일치하면 true/일치하지 않으면 false 반환
		// Set중에서 HashSet
		HashSet<String> hs1 = new HashSet(); // 중복 안됨, 순서대로 출력 안 함!!!!!!!!!!!!!!!!!
		// <String> 붙여주면 노란 불 사라짐
		hs1.add("반갑습니다");
		hs1.add(new String("반갑습니다")); // 위랑 똑같음
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분"));

		// String의 hashCode와 equals는 어떻게 다른가요?
		// String hashCode() => 이 hashCode는 "실제 담긴 문자열"을 가지고 10진수 형태로 만들어서 반환
		// String equals() => "실제 담긴 문자열"을 가지고 비교해서 일치하면 true, 일치하지 않으면 false를 반환

		System.out.println(hs1); // 저장 순서 유지 안됨, 인덱스의 개념이 없음, 중복된 데이터(동일 객체) 보관 불가능

		HashSet<Student> hs2 = new HashSet<Student>();
		// 존잘월드 3명이 산다고 가정을 해보자
		hs2.add(new Student("공유", 43, 100));
		hs2.add(new Student("차은우", 26, 85));
		hs2.add(new Student("주지훈", 24, 20));
		hs2.add(new Student("공유", 43, 100));
		System.out.println(hs2); // 내가 쓴 순서대로 저장 안됨 인덱스의 개념 X / 중복제거 안됨 => 왜냐면~ 동일 객체로 판단이 안 되고 있어서
		// HashSet 이라는 공간에 객체가 추가될 때 마다 동일객체인지 비교!
		// 동일객체 : 각 객체마다 hashCode() 호출 결과가 일치하고, equals() 비교시 true일 경우!

		System.out.println(new Student("공유", 43, 100).hashCode());
		System.out.println(new Student("공유", 43, 100).hashCode());
		// 재정의한 hashCode() 메소드에 의해 둘다 결과 똑같음 => hashCode() 메소드 주석 후 확인해볼것
		System.out.println(new Student("공유", 43, 100).equals(new Student("공유", 43, 100)));

		// hs2.get(); get()은 list에서만 가능한 함수, hash는 인덱스 개념 없음(한 객체만 뽑아 올 수 없음)
		// hashSet에 담긴 모든 객체들에 순차적으로 접근
		// 1. for문 사용 가능 (향상된 for문(for each)만 사용 가능!!!!!!)

		for (Student s : hs2) {
			// 제네릭 설정 안 하면 Object 형으로 선언해야 함
			System.out.println(s);
		}
		/*
		 * 일반 for문은 Sysout 안에 쓸 요소가 없어서 사용 불가 for (int i = 0; i < hs2.size(); i++) {
		 * System.out.println(); }
		 */

		System.out.println("=================================");
		// 2. ArrayList에 담아준 다음 ArrayList를 반복문 돌려가면서 접근
		// ArrayList에 담는 첫번째 방법 : ArrayList 생성 후 addAll() 메소드 이용해서 통째로 추가하기
		ArrayList<Student> list = new ArrayList<Student>();
		list.addAll(hs2);

		// ArrayList에 담는 두번째 방법 : ArrayList를 생성과 동시에 통째로 추가하기
		ArrayList<Student> list2 = new ArrayList<Student>(hs2);
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}

		// 근데 이거 왜 배우는걸까
		// 중복된 데이터가 들어오면 절대 안되는 경우/프로그램! => 근데 Set은 거의 안 쓰임..HashSet 및 중복 안된다는 정도는 기억하자
		System.out.println("=================================");

		// 3. Iterator = 반복자를 이용해서 순차적으로 접근하는 방법
		Iterator<Student> it = hs2.iterator(); // 넣어주고
		while (it.hasNext()) { // 어떤 요소가 있을 때 까지 계속 돌아감
			Student s = it.next(); // 가지고 나와서
			System.out.println(s); // 출력
		}
		// it.next(); // 가지고 나올게 없는데 출력하니까 java.util.NoSuchElementException
	}

}
