package com.kh.chap02_abstractAndInterface.part02_basic.run;

import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Mother;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Person;

public class BasicRun {

	public static void main(String[] args) {

		// Person p = new Person(); 미완성 클래스인 추상 클래스는 객체 생성 불가

		/*
		 * Person mom = new Mother("김엄마", 50, 70, "출산"); Person baby = new Baby("김아기",
		 * 3.5, 70);
		 * 
		 * System.out.println(mom); System.out.println(baby);
		 * 
		 * mom.eat(); // 몸무게 +10 건강도 -10 baby.eat(); // 몸무게 +3 건강도 +1
		 * 
		 * mom.sleep(); // 건강도 +20 baby.sleep(); // 건강도 +3
		 * 
		 * System.out.println("===== 다음 날 ====="); System.out.println(mom);
		 * System.out.println(baby);
		 */

		// Basic b = new Basic(); 레퍼런스 변수로는 사용 가능하나 객체 생성은 불가능하다
		//자바는 static이란 키워드 붙은 아이들부터 읽음, 생략 가능
		
		Basic mom = new Mother("김엄마", 50, 70, "출산"); // static 읽고 나서 읽는 부분(Basic mom), stack에 올라감
		Basic baby = new Baby("김아기", 3.5, 70); // heap 영역에는 Person( name, weight, health) 자리 생김
												// Mother면 heap 영역에 babybirth도 함께 생김
		System.out.println(mom);
		System.out.println(baby);
		
		mom.eat();
		baby.eat();
		
		mom.sleep();
		baby.sleep();
		
		System.out.println("===== 다음 날 =====");
		System.out.println(mom);
		System.out.println(baby);
		
		
		/*
		 * 클래스에서 클래스를 상속 받을 때 : 클래스 extends 클래스 (단일 상속만 가능) : 화살표 실선
		 * 클래스에서 인터페이스를 구현할 때 : 클래스 implements 인터페이스1, 인터페이스2... : 화살표 점선
		 * 인터페이스에서 인터페이스를 상속 : 인터페이스 extends 인터페이스1, 인터페이스2... (다중 상속) : 화살표 실선
		 * 				| 		추상 클래스		|			인터페이스
		 * ============================================================================
		 * 상속개수		|		단일 상속			|			다중상속
		 * ----------------------------------------------------------------------------
		 * 키워드			|		extends			|			implements
		 * ---------------------------------------------------------------------------
		 * 추상메소드		|	추상메소드 0개 이상		|										
		 * ----------------------------------------------------------------------------
		 * 표현법/개수		|	명시적으로 abstract	|		묵시적으로 abstract(생략가능)	
		 * ----------------------------------------------------------------------------
		 * 일반메소드 여부	|			O			|				X
		 * ----------------------------------------------------------------------------
		 * 일반 필드		|			O			|X : 상수필드만 가질 수 있음(묵시적 public static final)
		 * 
		 * 
		 * 
		 * extends 일반 클래스 => extends 추상클래스 => implements 인터페이스 
		 * -----------------------------------------------------------------------------
		 * 
		 * 					갈 수록 강제성이 더 짙어짐(규약이 더 쎄진다)
 		 * 			
		 */
	}

}
