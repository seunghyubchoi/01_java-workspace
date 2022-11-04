package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.*;

public class ClassRun {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("케로로");
		p1.setAge(1900);
		p1.setHeight(120.5);
		p1.setGender('M');
		p1.setBirth(118);
		
<<<<<<< Updated upstream
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getHeight());
		System.out.println(p1.getGender());
		System.out.println(p1.getBirth());
=======
		Person p2 = new Person("보노보노", "pptmaster", 30, "02-3288-8080");
		System.out.println(p2.information());
		
		Person p3 = new Person("bonobono", "pptmaster", "보노보노", 30, 'M', "02-3288-8080", "bono@bono.com");
		System.out.println(p3.information());
				
		
		
		// 생성 후에 필드에 담긴 값을 곧바로 알아보면
		// JVM이 초기화(값 세팅)까지 진행해줬음!!
		/*
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
		
		/*
		Product p1 = new Product();
		Product p2 = new Product();
		
		p1.setPname("다람이 피규어");
		p1.setPrice(10000);
		p1.setBrand("니켈로디언");
		
		p2.setPname("집게 사장 피규어");
		p2.setPrice(8000);
		p2.setBrand("비키니 시티");
		
		System.out.print("pName : " + p1.getPname() + " Price : " +  p1.getPrice() + " Brand : " + p1.getBrand());
		System.out.println();
		System.out.print("pName : " + p2.getPname() + " Price : " +  p2.getPrice() + " Brand : " + p2.getBrand());
		System.out.println();
		System.out.println("=== 메소드 만들고 난 후 ===");
		System.out.println(p1.information());
		System.out.println(p2.information());
		*/
		//System.out.println(p1.information());
		
>>>>>>> Stashed changes
	}
}
