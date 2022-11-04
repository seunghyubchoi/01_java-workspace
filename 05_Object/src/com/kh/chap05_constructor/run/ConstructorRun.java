package com.kh.chap05_constructor.run;
import com.kh.chap05_constructor.model.vo.*;
public class ConstructorRun {
	public static void main(String[] args) {
		
		User u1 = new User();
		System.out.println(u1.information());
		
		// 각 필드에 JVM의 초기 값이 담겨 있음(null,0)
		
		
		// 1. 객체 생성 후 값을 대입하는 방법
		
		// 회원가입 시 필수 입력 사항만 받는다면?
		
		/*
		u1.setUserId("boglebogle");
		u1.setUserPwd("9999");
		u1.setUserName("스폰지밥");
		u1.setAge(30);
		u1.setGender('남');
		 */
		
		// 2. 매개변수 3개짜리 생성자로 객체 생성
		User u2 = new User("boglebogle","9999","스폰지밥");
		System.out.println(u2.information());
		
		// 3. 매개변수 전체 필드 넣어서 생성자 만들고 객체 생성
		User u3 = new User("user03", "pwd03", "장원영", 18, 'F');
		System.out.println(u3.information());
		
		// 그럼 setter 안 만들어도 되지 않을까?
		// 스폰지밥 => 스폰지송
		
		//u2.setUserName("스폰지송");
		//System.out.println(u2.information());
		
		
		// 그럼 getter는 안 만들면 안될까?
		// 비번을 까먹은 경우에는 비번만 보여줘야함.
		// 특정 데이터 하나만 던져주고 싶을 때 필요함
		//System.out.println(u2.getUserPwd());
		
		
		
		
		
		
		
		
		
		//System.out.println(u1.information());		
		
		
	}
}
