
package com.kh.chap02.loop;
import java.util.Scanner;
public class C_DoWhile {
/*
 *  do-while문
 *  
 *  do {
 *  	반복적으로 실행할 코드
 *  } while(조건식);
 *  
 *  처음에 무조건 실행코드 실행 후,
 *	=> 조건식 검사 => true 일 경우 실행 코드 실행
 *				=> false 일 경우 실행 코드 실행 X
 *
 * 기존의 for / while문과의 차이점
 * for / while문 경우, 조건 검사 후 true여야만 실행
 * do-while문 경우, 일단 한 번은 실행
 */
	public void method1() {
		int num = 1;
		do {
			System.out.println("num의 값 : " + num );
		} while(false); // 조건이 false여도 무조건 한 번은 실행
		
	}
	
	public void method2() {
		// 1 2 3 4 5
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while(i <= 5);
	}
	public void method3() {
		// 1부터 사용자가 입력한 수 까지의 총 합계
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 값 : ");
		int num = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		do {
			sum += i;
			i++;
		} while(i <= num);
		System.out.print("1부터 " + num + "까지의 합 : " + sum);
	}
}
