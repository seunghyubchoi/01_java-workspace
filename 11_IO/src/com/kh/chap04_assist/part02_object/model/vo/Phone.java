package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable {
	
	// 객체를 바이트 통로로 입출력 하고자할 때 사용
	private String name;
	private int price;
	
	public Phone()  {
		
	}

	// alt + shift + s => o
	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	// alt + shift + s => r
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	// alt + shift + s => s
	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
		

	
}
