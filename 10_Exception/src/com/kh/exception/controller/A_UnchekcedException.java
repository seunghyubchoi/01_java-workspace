package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UnchekcedException {
	/*
	 * RuntimeException - 프로그램 실행시 발생되는 예외
	 * 
	 * RuntimeException의 후손들
	 * - IndexOutOfBoundsException : 부적잘한 인덱스를 가지고 접근시 발생되는 예외
	 * - NullPointerException : 참조변수가 null로 초기화된 상황에서 null에 접근했을 때 발생되는 예외 
	 * - ArithmeticException : 나누기 연산시 0으로 나누려 할 때 발생되는 예외 
	 * - ClassCastException : 허용할 수 없는 형변환이 진행될 때 발생되는 예외 
	 * - NegativeArraySizeException : 배열 할당 과정에서 배열의 크기를 음수로 지정하는 경우 발생되는 예외
	 * 
	 * => RuntimeException 관련된 예외는 충분히 예측 가능한 상황이 있음 아싸리 애초에 예외자체가 발생이 안되게끔 if문 조건
	 * 처리 가능
	 */
	Scanner sc = new Scanner(System.in);

	public void method1() {
		// ArithmeticException : 나누기 연산시 0으로 나누려 할 때 발생되는 예외 - ClassCastException : 허용할
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();

		// int result = num1 / num2;
		// 사용자가 두번째 정수를 0으로 입력하는 순간 예외 발생
		// => 비정상적으로 프로그램 종료
		// 예외 자체가 발생이 안되게 끔 if문으로 조건 검사 => 이게 예외처리는 아님
		/*
		 * int result = 0; if(num2 != 0) { result = num1 / num2; }
		 * 
		 * 
		 * System.out.println("안녕하세요. 반갑습니다 계산결과 알려드리겠습니다.");
		 * System.out.println("result : " + result);
		 */

		// 예외 처리: 예외가 "발생했을 때" 실행할 내용을 미리 작성해 놓는 방법

		/*
		 * try catch 방법 try{ 예외가 발생될 수 있는 구문 } catch(발생될 예외클래스 매개변수){ 해당 예외가 발생됐을 경우 실행할
		 * 구문 }
		 */

		try {
			int result = num1 / num2;
			System.out.println("result : " + result);
		} catch (ArithmeticException e) { // 예외를 낚아챔
			System.out.println("0으론 나눌 수 벗읍니다!!!");
			// e.printStackTrace(); // 강제로 오류난 이력 보고자 할 때 실행하는 구문

		}

		System.out.println("프로그램을 종료합니다~");

	}

	public void method2() {
		// NegativeArraySizeException : 배열 할당 과정에서 배열의 크기를 음수로 지정하는 경우 발생되는 예외
		// ArrayIndexOutOfBoundsException : 배열에 부적절한 인덱스를 가지고 접근시 발생되는 예외
		System.out.println("배열의 크기 : ");
		int size = sc.nextInt();

		/*
		 * if 문으로 아싸리 예외자체가 발생이 안되도록 먼저 막는 방법 if (size >= 101) { int[] arr = new
		 * int[size]; System.out.println("100번 인덱스의 값 : " + arr[100]); }
		 */

		try {
			int[] arr = new int[size]; // 음수 입력, 100번 인덱스를 구할 때 문제가 됨
			System.out.println("100번 인덱스의 값 : " + arr[100]);
		} catch (NegativeArraySizeException e) {
			System.out.println("배열의 크기로 음수를 제시할 수 없습니다");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스로 접근했습니다.");
		}
		System.out.println("프로그램을 종료합니다");

		// catch 다중 작성 가능

		// int[] arr = new int[size];

		// System.out.println("100번 인덱스의 값 : " + arr[100]);

	}

	public void method3() {

		System.out.println("배열의 크기 : ");

		/*
		 * // int size = sc.nextInt(); 
		 * try { int size = sc.nextInt(); // 배열 입력, 배열 생성 arr[100]:xxxx 
		 * int[] arr = new int[size]; 
		 * System.out.println("100번째 인덱스 : " + arr[100]); 
		 * } catch (ArrayIndexOutOfBoundsException e) {
		 * System.out.print("인덱스 안맞아서 "); 
		 * } catch (NegativeArraySizeException e) {
		 * System.out.print("음수라서 "); 
		 * } catch (InputMismatchException e) { 
		 * // import 해줘야함 => java.util에 있어서 System.out.println("똑바로 안 적어서");
		 *  }
		 * System.out.println("프로그램 종료요");
		 * 
		 * 다중 catch 블럭 작성 가능
		 * 
		 * 각각의 예외 발생시 실행할 내용이 별개인 경우
		 * = 세분화해서 다중 catch 블럭으로 기술하는게 적절함
		 */

		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 째 인덱스의 값 : " + arr[100]);
		} catch (InputMismatchException e) {
			System.out.println("정수가 아닌 값 입력함");
		}

		catch (RuntimeException e) { // 다형성 적용해서 부모타입 예외 클래스 작성가능
										// 모든 자식 예외 발생시 다 받아서 처리할 수 있음
			System.out.println("예외가 발생했음.. 배열의 크기가 잘 못 됐던가, 부적절한 인덱스가 제시 됐던가....");
		}
		// 부모예외클래스와 자식예외클래스를 가지고 catch 블럭을 기술하고자 할 때는
		// 자식 예외클래스 catch 블럭이 위에 있어야만 함(아니면 unreachable catch block 오류뜸)
		
		/*
		 * RuntimeExcepton 관련 애들은 UnCheckedException (예외처리 구문 필수는 아님)
		 * if문 : 애초에 예외 자체가 발생 되기 전에 소스코드로 핸들링 하는 것(예외처리 구문 아님)
		 * try - catch문 : 예외가 '발생했을 경우' 처리해주는 구문을 작성해두는 것(예외처리 구문 맞음) 
		 * 
		 * 예측 가능한 상황은 if문 조건검사로 해결하는게 권장사항임
		 * 부득이하게 조건문으로 핸들링이 안되는 구문 예외처리 구문으로 작성해둘 것
		 */
		
		
	}

}
