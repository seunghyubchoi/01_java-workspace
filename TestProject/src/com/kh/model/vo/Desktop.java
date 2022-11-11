package com.kh.model.vo;

public class Desktop extends Electronic{
	public static final String CPU = "intel";
	private String graphic;
	
	public Desktop(){
		
	}

	public Desktop(String brand, String name, int price, String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}

	public String getGraphic() {
		return graphic;
	}

	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}

	public static String getCpu() {
		return CPU;
	}

	@Override
	public String toString() {
		return super.toString() + ", graphic = " + graphic;
	}
	
	
	
}
