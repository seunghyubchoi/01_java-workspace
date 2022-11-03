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
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getHeight());
		System.out.println(p1.getGender());
		System.out.println(p1.getBirth());
	}
}
