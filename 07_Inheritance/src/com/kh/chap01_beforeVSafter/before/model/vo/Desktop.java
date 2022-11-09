package com.kh.chap01_beforeVSafter.before.model.vo;
	
public class Desktop {
	//필드
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private boolean allInOne;
	
	//생성자
	public Desktop() {
		
	}

	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
	}
	
	//메소드
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
	// boolean은 get이 아닌 is
	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	
	public String information() {
	      return "brand : " + brand + ", pCode : " + pCode + ", pName : " + pName + ", price : " + price 
	            + ", allInOne : " + allInOne;
	   }

	
}
