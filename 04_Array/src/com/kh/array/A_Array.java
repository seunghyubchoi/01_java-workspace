package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class A_Array {
	// 변수는 하나의 공간에 한 값만 담을 수 있음
	// int a = 10, 20, 30, 40;

	// 배열 : 하나의 공간에 여러 개의 값을 담을 수 있는 개념
	// 같은 자료형의 값으로만 담을 수 있다
	// 배열의 각 인덱스 자리에 실제 값이 담김
	// 인덱스는 0부터 시작
	public void method1() {
		/*
		 * 배열을 쓰는 이유
		 * 
		 * 변수만 이용하면 대량 데이터를 다 따로 만들어 관리해야함 출력하고자 할 때도 하나씩 출력해야함
		 * 
		 */

		/*
		 * 1. 배열 선언 : 여러 개의 값을 보관할 배열을 만들겠다
		 * 
		 * 표현법 자료형 배열명[]; 자료형[] 배열명; = 일반적으로 이 방법을 많이 사용
		 */

		// int a; // 변수 선언
		// int arr[];
		// int[] arr;

		/*
		 * 2. 배열 할당(크기 지정) 이 배열에 몇 개의 값을 보관할 것인지 크기를 정하는 과정(방 만들기) 배열명 = new 자료형[배열 크기];
		 */
		// arr = new int[5];

		// 배열 선언과 동시에 크기 지정
		int[] arr = new int[5];

		/*
		 * 3. 값 대입 배열명[인덱스 넘버] = 값;
		 */

		// 이거 반복문으로 써 보는 거 어떨까?

		/*
		 * arr[0] = 0; arr[1] = 1; arr[2] = 2; arr[3] = 3; arr[4] = 4;
		 */

		// 배열 장점: 반복문 활용 가능
		for (int i = 0; i <= 4; i++) {
			arr[i] = i;
		}
		/*
		 * System.out.println(arr[0]); System.out.println(arr[1]);
		 * System.out.println(arr[2]); System.out.println(arr[3]);
		 * System.out.println(arr[4]);
		 */

		for (int i = 0; i <= 4; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr); // 실제 arr이라는 박스에는 '주소 값'이라는 게 담겨 있음

	}

	public void method2() {
		int i = 10;
		// 배열 선언과 동시에 할당
		// iArr => 5
		int[] iArr = new int[5];
		System.out.println(iArr);

		double[] dArr = new double[3];
		System.out.println(dArr);

		/*
		 * 실제 리터럴 값을 곧바로 담을 수 있는 변수는 일반변수(내 눈에 바로 보이는 값) 주소 값을 담고 있는 변수는 참조변수(레퍼런스 변수)
		 * 
		 * 기본 자료형(boolean, char, byte, short, int, long, float, double) => 실제 리터럴 값을 바로
		 * 담는 변수 => 일반변수 참조 자료형(String int[], double[], char[], short[].....) => 참조 변수
		 */
	}

	public void method3() {
		int[] iArr = new int[3]; // 0 ~ 2번 인덱스

		double[] dArr = new double[4]; // 0 ~ 3번 인덱스

		for (int i = 0; i < 3; i++) {
			System.out.println(iArr[i]);
		}
		System.out.println("=======================");
		for (int i = 0; i < 4; i++) {
			System.out.println(dArr[i]);

		}

		// 각 인덱스의 초기화를 하지 않아도
		// heap 영역은 절대로 비워둬선 안 되기 때문에
		// JVM이 기본적으로 0을 부여함
	}

	public void method4() {
		int[] arr = new int[5];
		/*
		 * arr[0] = 1; arr[1] = 2; arr[2] = 3; arr[3] = 4; arr[4] = 5;
		 */

		// for 값 대입 + for 값 출력

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr);
		System.out.println(arr.hashCode());
		System.out.println("배열의 길이 : " + arr.length); // 배열의 길이
	}

	public void method5() {
		int result = 0; // 배열 초기화 값도 0이기 때문에 0으로 선언
		// 배열을 쓰면서 볼 수 있는 오류들
		// int[] arr; // 크기 지정(할당) 안 한 경우
		int[] arr = null; // 아무 것도 참조 하고 있지 않음
		// System.out.println(arr); 초기화 안 돼 있어서 오류남
		// null 가지고 메소드를 호출한다거나
		// 특정 어딘가에 접근한다고 하면 항상 오류 발생
		// 내가 찍고 있는 값이 null 일때 발생하는 오류 NullPointerException
		// System.out.println(arr.hashCode());
		// System.out.println(arr.length);
		// System.out.println(arr[0]);

	}

	public void method6() {
		int[] arr = new int[5];
		/*
		 * arr[0] = 2; arr[1] = 4; arr[2] = 6; arr[3] = 8; arr[4] = 10;
		 * 
		 */
		int value = 2;
		for (int i = 0; i < arr.length; i++) {
			// arr[i] = (i * 2) + 2;
			arr[i] = value;
			value += 2;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr.hashCode());
		System.out.println(arr.length);

		// ArrayIndexOutOfBoundsException : 인덱스 벗어남
		// System.out.println(arr[6]);

		/*
		 * 배열의 가장 큰 단점 한 번 지정된 배열의 크기는 변경 불가 배열의 크기를 변경하고자 한다면 다시 만들어야함
		 */
		arr = new int[7];
		System.out.println("변경 후 arr hascode : " + arr.hashCode());
		System.out.println("변경 후 arr length : " + arr.length);
		// 주소 값이 변경 됨!!
		// => 새로운 곳 참조하고 있음!!

		/*
		 * 연결이 끊겨진 기존 배열은 Heap 영역에 둥둥 떠다님 (어디에도 참조 되어 있지 않음으로 필요없는 존재 = 지워주는 것이 좋다) 일정
		 * 시간이 지나면 가비지 컬렉터(GC)가 알아서 지워줌 자동 메모리 관리 => 개발자가 코드 작성에만 신경 쓸 수 있음
		 */

		// 배열을 강제로 삭제시키고자 한다면?
		// => 연결 고리를 끊으면 됨
		arr = null; // 아무 것도 참조하지 않겠다
		// System.out.println(arr.length); NullPointerException 발생
		// stack과의 연결을 끊어줌
		// 주소를 더 이상 볼 수 없고
		// 주소 값은 Heap 영역에서 둥둥 떠다니다가 GC에 의해 버려짐

	}

	public void method7() {
		// 배열의 선언, 할당, 초기화 다 동시에 하자

		// 표현법 1
		int[] arr1 = new int[] { 1, 2, 3, 4 };

		// 표현법 2
		int[] arr2 = { 1, 2, 3, 4 };

		System.out.println(arr1 == arr2); // 주소 값은 서로 다르기 때문에 false
		System.out.println(arr1.equals(arr2)); // 각각의 변수에 담겨있는 주소값을 비교하기 때문
		System.out.println(arr1[1] == arr2[1]); // 값은 같음
	}

	public void method8() {
		// 1. 크기 10짜리 정수 배열 생성 = >
		int[] arr = new int[10];
		// 2. 반복문 활용해서 0번 인덱스 ~ 마지막 인덱스
		// 순차적으로 접근하면서 값을 대입
		// 매번 1~100 사이에 발생되는 랜덤 값
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
			// System.out.println(arr[i]);
		}
		// 3. 반복문을 활용해서 해당 배열의 0번 인덱스
		// ~ 마지막 인덱스까지 담겨 있는 값 출력
		// arr[x] : xxx 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr" + "[" + i + "] : " + arr[i] + " ");
			if (i % 3 == 0) {
				System.out.println();
			}
		}
	}

	public void method9() {
		// 사용자에게 배열의 길이를 입력 받은 후
		// 해당 그 크기 만큼의 문자열 배열 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int size = sc.nextInt();
		String[] arr = new String[size];
		// 반복문을 활용해서 매번 사용자에게 과일명 입력 받아
		// 그 값을 매 인덱스 자리에 대입

		sc.nextLine();

		String fruit;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("좋아하는 과일 입력 : ");
			// fruit = sc.nextLine();
			// arr[i] = fruit;

			arr[i] = sc.nextLine();
		}
		// 반복문을 화룡ㅇ해서 0 ~ 마지막 인덱스까지 담긴 값 출력
		// arr[1] : 바나나
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
	}

	public void method10() {
		// 사용자에게 문자열 하나 입력 받은 후
		// 각각의 인덱스에 있는 문자들을 char 배열에 옮겨 담기

		// 1. 사용자에게 문자열 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();

		System.out.print("찾고자하는 문자 : ");
		char ch = sc.nextLine().charAt(0);

		// 2. char 배열 생성해두기 =>
		char[] arr = new char[str.length()];

		// 3. 반복문 활용해서 해당 문자열에서
		// 각 인덱스별 문자를 char 배열의 각 인덱스에 대입

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		// 4. 반복문 활용해서 해당 배열의 0~마지막 인덱스에 담긴 값 출력

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);

			if (arr[i] == ch) {
				count++;
			}
		}
		System.out.print("찾아진 문자 개수 : " + count);

	}

	public void method11() {
		// 1. 사용자에게 배열의 길이를 입력 받은 후
		// 해당 크기 만큼의 정수 배열 생성
		// 배열의 길이 입력
		// 변수는 size

		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이입력 : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		
		// 2. 반복문 활용해서 0 ~ 마지막 인덱스 까지
		// 매번 1~100 사이의 랜덤 값 발생시켜 대입
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}

		// 3. 반복문 활용해서 출력 + 해당 그 인덱스에 담긴 값이 짝수인 값들의 총 합 출력
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
			if (arr[i] % 2 == 0) {// 짝수인 경우
				// 누적합
				sum += arr[i];
			}	
		}
		System.out.println("해당 배열의 짝수의 합 : " + sum);
	}
}
