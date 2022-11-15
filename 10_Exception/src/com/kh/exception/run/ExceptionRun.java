package com.kh.exception.run;

import com.kh.exception.controller.A_UnchekcedException;
import com.kh.exception.controller.B_CheckedException;

public class ExceptionRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 에러 종류
		 * - 시스템 에러
		 * : 컴퓨터의 오작동으로 발생하는 에러 => 스스로 해결이 안됨, 심각한 에러
		 * 
		 * - 컴파일 에러
		 * : 소스코드 문법상 오류 => 빨간 줄로 오류로 알려줌(개발자의 실수)
		 * 
		 * - 런타임 에러
		 * : 코드 상으로는 문제가 없는데 프로그램 실행 중에 발생하는 에러
		 * : (사용자의 실수 or 개발자의 실수) => 예외 처리 해야함
		 * 
		 * - 논리 에러
		 * : 문법적으로도 문제없고 실행했을 때도 굳이 문제는 없지만 프로그램 의도상 맞지 않는 것
		 * 
		 * 시스템 에러를 제외한 컴파일에러, 런타임에러, 논리에러와 같은 비교적 덜 심각한 것들
		 * = 얘들을 예외라고 부름
		 * 
		 * 이런 "예외"가 "발생"했을 경우에 대해서 "처리"하는 방법을 "예외처리"라고 한다
		 * 
		 * 예외처리를 하는 목적
		 * - 예외처리를 하지 않고 그대로 예외가 발생되는 경우 프로그램이 비정상적으로 종료될 수 있음
		 * 
		 * 예외처리 방법
		 * 1. try~catch 문 이용(try~with~resource)
		 * 2. throws를 이용 (떠넘기기 == 위임하기)
		 * 
		 * 
		 */
		
		A_UnchekcedException a = new A_UnchekcedException();
		// a.method1();
		// a.method2();
		// a.method3();
		
		B_CheckedException b = new B_CheckedException();
		b.method1();
	}

}
