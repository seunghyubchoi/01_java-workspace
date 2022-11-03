package com.kh.run;
import com.kh.model.vo.*;
public class ClassRun {
	public static void main(String[] args) {
		
		Product p = new Product();
		p.setpName("보노보노 피규어");
		p.setPrice(5000);
		p.setBrand("포로리야");
		
		System.out.println("이름 : " + p.getpName());
		System.out.println("가격 : " + p.getPrice());
		System.out.println("브랜드 : " + p.getBrand());
		
	}
}
