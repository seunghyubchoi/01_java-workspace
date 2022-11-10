package com.kh.chap01_poly.part01_basic.model.vo;

public class Parents {
	private int x;
	private int y;

	public Parents() {

	}

	public Parents(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public void printParents() {
		System.out.println("나 부모야");

	}

	public void print() {
		System.out.println("나 부모야");
	}
}
