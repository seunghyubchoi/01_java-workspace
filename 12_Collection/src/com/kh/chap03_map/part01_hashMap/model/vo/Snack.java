package com.kh.chap03_map.part01_hashMap.model.vo;

public class Snack {
	private String flavor;
	private int calory;

	public Snack() {
	}

	public Snack(String flavor, int calory) {
		super();
		this.flavor = flavor;
		this.calory = calory;
	}

	protected String getFlavor() {
		return flavor;
	}

	protected void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	protected int getCalory() {
		return calory;
	}

	protected void setCalory(int calory) {
		this.calory = calory;
	}

	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calory=" + calory + "]";
	}

}
