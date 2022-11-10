package com.kh.chap02_inherit.model.vo;

public class Vehicle {
	private String Vname;
	private double mileage;
	private String kind;
	
	
	public Vehicle() {
		
	}


	public Vehicle(String name, double mileage, String kind) {
		super();
		this.Vname = name;
		this.mileage = mileage;
		this.kind = kind;
	}


	public String getName() {
		return Vname;
	}


	public void setName(String name) {
		this.Vname = name;
	}


	public double getMileage() {
		return mileage;
	}


	public void setMileage(double mileage) {
		this.mileage = mileage;
	}


	public String getKind() {
		return kind;
	}


	public void setKind(String kind) {
		this.kind = kind;
	}


	public String information() {
		return "name : " + Vname + ", mileage : " + mileage + ", kind : " + kind;
	}
	
	public void howToMove() {
		System.out.println("움직인다.");
	}
	
	
}
