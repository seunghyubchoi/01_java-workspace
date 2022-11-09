package com.kh.chap00_myInheritance.model.vo;

public class Louisie extends MarioWorld {
	private String team;

	public Louisie() {

	}

	public Louisie(String name, int age, String job, double height, int income, double bonus, String team) {
		super(name, age, job, height, income, bonus);
		this.team = team;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String information() {
		return super.information() + ", 직장 = " + team;
	}

}
