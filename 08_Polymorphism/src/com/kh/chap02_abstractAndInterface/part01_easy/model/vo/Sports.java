package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public abstract class Sports {
	private int people;

	public Sports() {

	}

	public Sports(int people) {
		this.people = people;
	}

	public int getPeople() { // 머리부
		return people; // 몸통부 => 몸통부 없으면 완벽한 메소드가 아님
	}

	public void setPeople(int people) {
		this.people = people;
	}

	public String toString() {
		return "people : " + people;
	}

	// 추상메소드 : 만들다만 메소드
	// public void rule(); // 머리부만 있음, 몸통부가 없다고 에러가 남
	// abstract라고 하는 키워드를 가지고 있으면 추상 메소드 라는 뜻
	// 일반 다른 메소드는 {}가 있지만 추상메소드는 ()에서 끝남 
	// rule() 메소드는 시그니쳐만 가지고 있는, 추상적인 모습만 남아 있는 메소드
	// abstract라는 메소드를 사용하기 위해서는 오버라이딩을 사용하여 
	// 메소드 rule()에 대한 구체적인 사용법을 적어야함
	
	/*
	public abstract void rule() {
		System.out.println("Hello");
	} 
	*/
	// 추상 메소드일 때는 위와 같이 사용 불가
	
		
	public abstract void rule();  
	// 미완성된 메소드가 있다는 소리는 이 클래스도 아직 미완성이라는 이야기
	
	// 그럼 언제 완성하나요? => 해당 추상클래스를 상속 받는 자식에서
	
	public void handsome() {
		System.out.println("잘생긴 징징이");
	}
	
	// 클래스가 추상 클래스라고 해서 일반 메소드 작성을 못 하는 게 아님
}
