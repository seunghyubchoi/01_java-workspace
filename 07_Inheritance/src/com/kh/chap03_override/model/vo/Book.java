package com.kh.chap03_override.model.vo;

public class Book /* extends Object */ {
	private String title;
	private String author;
	private int price;

	public Book() {

	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// information 만들지 않아
	/*
	 * 오버라이딩 자식클래스가 상속받고 있는 부모클래스의 메소드를 재정의(재작성)하는 것 부모가 제공하는 메소드를 자식이 일부 고쳐서 사용하겠다는
	 * 의미 자식 객체를 통해 실행시 자식메소드가 우선권을 가짐
	 * 
	 * 오버라이딩 성립 조건 부모메소드명 동일 매개변수 갯수, 자료형 순서 동일(단, 매개변수 이름은 상관없음) ex public void
	 * howToMove(String s) { System.out.println("움직인다."); } 's', 매개변수의 이름은 달라도 상관 없음
	 * 부모메소드의 반환형 동일 부모메소드의 접근제한자보다 범위가 같거나 커야한다 (ex.부모가 protected면 자식이 private이면 성립
	 * 안됨) (자식 접근제한자는 protected, public이여야 한다) => 규약의 개념이 들어가 있다.(너가 재정의 할꺼면 이정도의
	 * 규칙은 지켜주라)
	 * 
	 * @Override 어노테이션 생략가능한 부분, 명시하지 않아도 오버라이딩이 된 상태 어노테이션 붙이는 이유 부모메소드 이름이나 매개변수가
	 * 수정될 경우 = 알아보기 쉽다 자식메소드 기술시 오타가 있을 경우 = 알아보기 쉽다 단지 이 메소드 오버라이딩한 메소드다 라고 알려줌
	 */

	@Override
	public String toString() { // 부모 그러니까 Object 객체에 toString()이라는 메소드가 있어서 오류 안남
		// 메소드는 하나만 쓸 수 있기 때문에 Object 객체에 있는 toString() 역시 하나 밖에 못 씀 
		// @Override 표시를 쓰면 부모의 클래스에 있는 걸 가져온다는 의미로 부모클래스는 Object, 자식클래스는 부모클래스에서 가져옴을 의미
		return "title : " + title + ", author : " + author + ", price : " + price;
	}

}
