package com.kh.chap03_class.run;
import com.kh.chap03_class.model.vo.*;
public class ClassRun {
	public static void main(String[] args) {
		
		// 4. 객체 만들기
		
		Person p1 = new Person();
		
		// 생성 후에 필드에 담긴 값을 곧바로 알아보면
		// JVM이 초기화(값 세팅)까지 진행해줬음!!
		
		p1.setId("bonobono");
		p1.setPwd("pptmaster");
		p1.setName("보노보노");
		p1.setAge(30);
		p1.setGender('m');
		p1.setPhone("02-3288-8080");
		p1.setEmail("bono@bono.com");
				
		System.out.println("아이디 : " + p1.getId());
		System.out.println("비밀번호 : " + p1.getPwd());
		System.out.println("이름 : " + p1.getName());
		System.out.println("나이 : " + p1.getAge());
		System.out.println("성별 : " + p1.getGender());
		System.out.println("전화번호 : " + p1.getPhone());
		System.out.println("이메일 : " + p1.getEmail());
	}
}
