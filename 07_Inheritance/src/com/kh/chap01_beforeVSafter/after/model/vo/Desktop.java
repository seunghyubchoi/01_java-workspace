package com.kh.chap01_beforeVSafter.after.model.vo;
// Desktop은 자식(후손, 하위) Product는 부모(조상, 상위)

// 자식은 this로 부모는 super로 가져올 수 있다

public class Desktop extends Product { // 자식클래스 extends 부모클래스(공통적으로 가지고 있는 필드)
	private boolean allInOne; // 자식클래스의 필드부에는 각기 다른 전역 변수를 적습니다

	public Desktop() { // 기본생성자

	}

	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// brand ~ price 네 개의 값들은 부모클래스(product)의 필드에 대입
		// super. 으로 부모에 접근

		// 해결방법 1. 부모 클래스에 있는 필드를 protected 접근제한자로 수정

		/*
		 * protected String brand; protected String pCode; protected String pName;
		 * protected int price;
		 */

		/*
		 * super.brand = brand; super.pCode = pCode; super.pName = pName; super.price =
		 * price;
		 */

		// 해결방법 2. 부모클래스에 있는 setter 메소드 활용하기 (public 이기 때문에 접근 가능)
		/*
		 * super.setBrand(brand); // this.brand = brand; super.setpCode(pCode); //
		 * this.pCode = pCode; super.setpName(pName); // this.pName = pName;
		 * super.setPrice(price); // this.price = price;
		 */

		// 해결방법 3. 부모생성자를 호출하기
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;

	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	// 오버라이딩 : 부모클래스에 있는 메소드를 자식클래스에서 재정의 하는 것
	public String information() {
		return super.information() + ", allInOne : " + allInOne;
	}

}
