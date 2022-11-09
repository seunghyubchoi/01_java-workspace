package com.kh.chap00_myInheritance.model.vo;

public class Mario extends MarioWorld {
	private boolean girlfriend;

	public Mario() {

	}

	public Mario(String name, int age, String job, double height, int income, double bonus, boolean girlfriend) {
		super(name, age, job, height, income, bonus);
		this.girlfriend = girlfriend;
	}

	public boolean isGirlfriend() {
		return girlfriend;
	}

	public void setGirlfriend(boolean girlfriend) {
		this.girlfriend = girlfriend;
	}

	
	public String information() {
		return super.information() + ", 여자친구 = " + girlfriend;
	}
	
	

}
