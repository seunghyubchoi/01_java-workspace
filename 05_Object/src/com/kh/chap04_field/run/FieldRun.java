package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.*;

public class FieldRun {
	public static void main(String[] arge) {
		/*
		 * // ===== FieldTest 1 ===== FieldTest1 f1 = new FieldTest1(); f1.test1(5);
		 */

		// ===== FieldTest 2 =====

		FieldTest2 f2 = new FieldTest2();
		// public
		System.out.println(f2.pub);

		// protected : 같은 패키지내에서는 접근 가능, 다른 패키지라면 상속 구조에서만 접근 가능
		// System.out.println(f2.pro);

		// default : 오로지 같은 패키지 내에서만 접근 가능, 다른 패키지 접근 절대 불가!!!
		// System.out.println(f2.def);

		// private : ONLY 해당 클래스에서만 접근 가능!!!!!!!!!!
		// System.out.println(f2.pri);
		
		// FieldTest3
		System.out.println(FieldTest2.sta);
		System.out.println(FieldTest3.sta);
		
		// 수정하고 싶다면?
		FieldTest3.sta = "ㅋㅋㅋㅋㅋ";
		System.out.println(FieldTest3.sta);
		
		// 근데 절대 변경 안되게 하고 싶다면? => 상수필드로 선언해야함
		System.out.println(FieldTest3.STA_FIN);
		
		// final 수정 도전!!!
		// FieldTest3.STA_FIN = "ㅠㅠ"; 
		// static final은 변경 불가
		
		System.out.println(Math.PI);
	}
}
