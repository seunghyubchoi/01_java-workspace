package com.kh.chap01_beforeVSafter.after.model.vo;

public class Smartphone extends Product {
	private String mobileAgency;

	public Smartphone() {

	}

	public Smartphone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super(brand, pCode, pName, price);
		this.mobileAgency = mobileAgency;
		
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	public String information() {
		return super.information() + ", mobileAgency : " + mobileAgency;
		
	}
	
	
}
