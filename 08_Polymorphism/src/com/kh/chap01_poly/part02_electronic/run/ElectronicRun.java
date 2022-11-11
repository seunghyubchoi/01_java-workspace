package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop1;
import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
		// 실행용 클래스는 납품업체

		// 1. 다형성 적용 안 했을 경우 (ElectronicShop1)

		/*
		 * ElectronicShop1 es = new ElectronicShop1(); // 생성을 하는 순간 방이 생김, 주소값 생김(필드 값을
		 * 필두로 한) // es에서 마련해놓은 desk, note, tab이라는 필드에 // 객체를 생성해서 넣어주기 위해 우선 es를 생성 //
		 * 객체 생성하는 순간 해당 클래스에 제시된 세 필드가 메모리 상에 할당
		 * 
		 * // 메소드를 써서 생성하겠음 // 먼저 필요한 메소드를 생각해보자
		 * 
		 * // 아직은 없는 메소드
		 * 
		 * 
		 * // Run 클래스는 납품업체라고 생각 // ElectronicShop은 용산 전자상가에 있는 가게
		 * 
		 * private Desktop desk; private NoteBook note; private Tablet tab;
		 * 
		 * // 세 개의 제품을 갖다 놓기 위해 자리만 마련해둠 public void insert(Desktop d) { // d =
		 * Desktop(~~~), // Desktop d = new Desktop(~~~) desk = d; }
		 * 
		 * public void insert(NoteBook n) 
		 * { // new NoteBook("LG", "그램", 2000000, 4 = 이게 n으로 그리고 note로.. note = n; }
		 * 
		 * public void insert(Tablet t) 
		 * { // new Tablet("Apple", "아이패드", 800000, false = 이게 t로 그리고 tab으로.. tab = t; }
		 * 
		 * public Desktop selectDesktop() { return desk; }
		 * 
		 * 
		 * public NoteBook selectNoteBook() { return note; }
		 * 
		 * public Tablet selectTablet() { return tab; }
		 * 
		 * 
		 * 
		 * // 추가용 메소드 = insert
		 * 
		 * // 데스크탑이라는 객체를 생성해서 넘기는 메소드 
		 * es.insert(new Desktop("Samsung", "데땁", 1200000, "gtx1070")); // 아직은 해당 메소드가 없기 때문에 에러가 난다
		 * 
		 * // 노트북이라는 객체를 생성해서 넘기는 메소드 
		 * es.insert(new NoteBook("LG", "그램", 2000000, 4));
		 * 
		 * // 태블릿이라는 객체를 생성해서 넘기는 메소드 
		 * es.insert(new Tablet("Apple", "아이패드", 800000,
		 * true));
		 * 
		 * // 가게에 해당 객체들이 잘 생성 돼 있는지를 확인해보자 // 조회용 메소드 => select
		 * 
		 * Desktop d = es.selectDesktop(); 
		 * NoteBook n = es.selectNoteBook(); 
		 * Tablet t = es.selectTablet();
		 * 
		 * 
		 * System.out.println(d); System.out.println(n); System.out.println(t);
		 * 
		 * // return 이기 때문에 콘솔창에 보이지 않음 // 출력을 하고 싶다면 무조건 sysout
		 * 
		 * // toString() 오버라이딩 했기 때문에 주소값이 아닌 값 출력문이 나온다
		 * 
		 */

		// 2. 다형성을 적용 했을 경우 (ElectronicShop2)
		ElectronicShop2 es = new ElectronicShop2();

		// 이번에는 내가 필요한 메소드 먼저 전부 써놓고 이따 짜자
		es.insert(new Desktop("Samsung", "데땁", 1200000, "gtx1070"));
		es.insert(new NoteBook("LG", "그램", 2000000, 4));
		es.insert(new Tablet("Apple", "아이패드", 800000, true));

		// 조회용 메소드 -> select
		// 이번에는 3개 다 이름을 select로 해보자

		/*
		 * // Desktop d = es.select(0); // 실제로 들어있는 값은 Desktop 객체가 맞으나 반환형이 Electronic
		 * 이라서 맞춰 줘야 함 // 문제가 되는 부분을 형변환 해 줘야함 Desktop d = (Desktop)es.select(0); // 다운
		 * 캐스팅 예시 NoteBook n = (NoteBook)es.select(1); // 0번으로 할시
		 * java.lang.ClassCastException Tablet t = (Tablet)es.select(2);
		 */

		// 양쪽 모두 부모클래스일 경우
		Electronic d = es.select(0);
		Electronic n = es.select(1);
		Electronic t = es.select(2);

		// 그럼 toString() 일 때 부모에 있는 toString을 불러오지 못 할까?
		// 왜? => 동적바인딩 때문에

		// 오버라이딩 된 부분은 sysout 이 부분 뿐(Object에서 받아와 각각 Desktop, NoteBook, Tablet 오버라이딩)
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);

		/*
		 * 다형성을 사용하는 이유 1. 부모타입 배열로 다양한 자식객체를 다룰 수 있음 (Electronic => Desktop, NoteBook,
		 * Tablet 만들 수 있음)
		 * 
		 * 2. 메소드 정의 시 매개변수(Electronic any)로 다형성을 적용하면, 메소드 개수가 확 줄어든다
		 * 
		 * 3. 다형성을 필수로 써야하는 곳이 있음 => 추상클래스(인터페이스)
		 */
	}
}
