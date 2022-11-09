package com.kh.chap00_myInheritance.model.vo;

public class Yoshi extends MarioWorld {
	private String species;

	public Yoshi() {

	}

	public Yoshi(String name, int age, String job, double height, int income, double bonus, String species) {
		super(name, age, job, height, income, bonus);
		this.species = species;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String information() {
		return super.information() + ", 종류 = " + species;
	}

}
