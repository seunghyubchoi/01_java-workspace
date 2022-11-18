package com.kh.array;

import java.util.Arrays;

// import java.lang.*; => 알게 모르게 포함되어 있음
public class B_ArrayCopy {
	// 배열 복사
	public void method1() {
		int[] origin = { 1, 2, 3, 4, 5 };

		System.out.println("== 원본 배열 출력 ==");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		// 단순하게 origin을 다시 대입시킨 copy 배열
		int[] copy = origin;
		System.out.println("== 복사본 배열 출력 ==");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();

		copy[2] = 99;

		System.out.println("----- 복사본 배열 값 변경 후 -----");

		System.out.println("== 원본 배열 출력 ==");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		System.out.println("== 복사본 배열 출력 ==");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();

		// copy만을 가지고 수정해도 원본까지 변경 돼 있음
		// 왜? origin과 copy가 같은 곳을 참조하고 있기 때문(주소 값이 같다)
		// 얕은 복사 : 주소 값을 복사
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());

	}

	// 깊은 복사
	public void method2() {
		// 1. for문을 활용한 방법
		// 새로운 배열을 생성한 후 반복문을 활용해서
		// 원본 배열의 값들을 새로이 만든 배열에 대입

		int[] origin = { 1, 2, 3, 4, 5 }; // 원본 배열
		// int[] copy = origin; : 얕은 복사, 주소값만 대입
		int[] copy = new int[5];
		for (int i = 0; i < copy.length; i++) {
			copy[i] = origin[i];
			System.out.println(copy[i]);
		}
		System.out.println("== 원본 배열 출력 ==");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		System.out.println("== 복사본 배열 출력 ==");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		// copy 배열 수정해보기
		copy[2] = 99;
		System.out.println("-------------copy 수정 후------------");
		System.out.println("== 원본 배열 출력 ==");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		System.out.println("== 복사본 배열 출력 ==");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");

			// 깊은 복사 :
			// 힙 영역에 새로운 공간을 만들어 새로운 주소값을 만들어주고 같은 배열값을 대입
		}
		System.out.println("origin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
	}

	public void method3() {
		// 2. 새로운 배열 생성 후 System이라는 클래스에서의
		// arrycopy()메소드를 이용한 복사
		int[] origin = { 1, 2, 3, 4, 5 };
		int[] copy = new int[10]; // 넉넉하게 크게 생성 / 0~9 인덱스까지 0이 담겨 있음

		// System.arraycopy(원본배열명, 복사 시작할 원본 인덱스, 복사본배열명, 복사본배열의 복사될 시작인덱스, 복사할 갯수);
		// System.arraycopy(origin, 0, copy, 0, 5);
		// System.arraycopy(origin, 0, copy, 2, 5);
		System.arraycopy(origin, 1, copy, 3, 3);
		// for문으로 copy배열 출력
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();

		System.out.println("origin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());

		// 주소값이 다름(깊은 복사)
		// 각각 다른 배열을 참조하고 있음
		// => 배열 수정 시 서로에게 영향을 주지 않음

	}

	public void method4() {	
		// 3. Arrays 클래스에서 제공하는 copyOf() 메소드 사용
		int[] origin = { 1, 2, 3, 4, 5 };
		// 복사본 배열 = Array.copyOf(원본배열, 복사할 길이);
		// int[] copy = Arrays.copyOf(origin, 5); // 1 2 3 4 5
		// int[] copy = Arrays.copyOf(origin, 3); // 1 2 3
		int[] copy = Arrays.copyOf(origin, 10); // 1 2 3 4 5 0 0 0 0 0
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		System.out.println("origin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
		/*
		 * Arrays.copyOf() 메소드 => 내가 제시한 길이 만큼 복사본 배열 크기 할당 => 댠, 내가 제시한 길이가 원본 배열의 크기보다
		 * 클 경우 => 기존의 배열에 있는 값은 다 복사, 나머지는 0으로 채움 => 내가 제시한 길이가 원본 배열의 크기보다 작을 경우 =>
		 * 기존의 배열에 있는 값을 복사하되 길이 만큼만 복사함
		 */

	}
	/*
	 * 참고 java.lang.Math java.lang.String java.lang.System => java.lang 패지키에 있는
	 * 클래스들을 쓸 때는 import 안 해줘도 됨
	 * 
	 * java.util.Scanner java.util.Arrays = > java.lang 이외의 패키지에 있는 클래스들을 쓸 때는 무조건
	 * import 해야한다
	 * 
	 */

	public void method5() {
		// 4. clone() 메소드를 이용한 복사
		// 인덱스 지정 불가, 크기 지정 별도로 못함 그대로 복사됨
		int[] origin = { 1, 2, 3, 4, 5 };
		// 복사본배열 = 원본배열.clone();
		int[] copy = origin.clone();
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		System.out.println("원본 배열의 주소값 : " + origin.hashCode());
		System.out.println("copy 배열의 주소값 : " + copy.hashCode());
	}
}
