package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product {
	/*
	 * 1. 세 클래스가 공통적으로 가지고 있는 요소들만 기술(필드, 메소드)
	 * => brand, pName, pCode, price 필드들
	 */
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	// 2. 공통 요소 기술 후 생성자 만들기 
	
	public Product() {
		
	}

	public Product(String brand, String pCode, String pName, int price) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	// 3. getter / setter 만들기

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		return "brand : " + brand + ", pCode : " +  pCode + ", pName : " + pName + ", price : " + price;
				
	}
	
	
}
