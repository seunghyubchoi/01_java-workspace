package com.kh.chap06_method.controller;

class Foo {
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";

	public static void classMethod() {
		System.out.println(classVar);
//		System.out.println(instanceVar);
	}

	public void instanceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar);

	}
}

public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); // 클래스를 통해서 클래스 변수에 접근 가능
//		System.out.println(Foo.instanceVar); // 인스턴스 변수는 인스턴스를 통해서 접근
		Foo.classMethod();
//		Foo.instanceMethod();
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar);
		System.out.println(f1.instanceVar);
		
		f1.classVar = "changed by f1";
		System.out.println(f1.classVar);
		System.out.println(Foo.classVar);
		System.out.println(f2.classVar);
		
		f1.instanceVar = "changed by f1";
//		System.out.println(Foo.instanceVar);
		System.out.println(f1.instanceVar);
		System.out.println(f2.instanceVar);
		
	}

}
