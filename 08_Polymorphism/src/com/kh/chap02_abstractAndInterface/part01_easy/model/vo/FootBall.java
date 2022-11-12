package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public class FootBall extends Sports {
// 추상메소드를 사용하기 위해선 abstract 클래스를 상속 받아야 한다
	
// 추상클래스의 추상메소드를 오버라이딩 받아 구체적인 로직을 적어줘야 함
// abstract 클래스는 메소드 레이아웃을 만들고 
// 추상 클래스를 상속받은 자식 클래스는 그 것을 중괄호를 사용하여 구체적으로 작성
	@Override
	public void rule() {
		System.out.println("공을 항상 발로만 차야한다.");
	}

}
