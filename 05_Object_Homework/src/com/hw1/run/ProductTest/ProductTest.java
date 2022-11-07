package com.hw1.run.ProductTest;
import com.hw1.model.vo.*;
public class ProductTest {

	public static void main(String[] args) {
			
		Product p1 = new Product("ssgnote9 ", "갤럭시노트9 ", "경기도 수원 ", 960000, 10.0);
		Product p2 = new Product("igxnote5 ", "LG스마트폰5 ", "경기도 평택 ", 780000, 0.7);
		Product p3 = new Product("ktsnote3 ", "KT스마트폰3 ", "서울시 강남 ", 250000, 0.3);
		
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		p1.setPrice(1200000);
		p2.setPrice(1200000);
		p3.setPrice(1200000);
		p1.setTax(0.05);
		p2.setTax(0.05);
		p3.setTax(0.05);
		
System.out.println("========================================");
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		
	
		//p1.setPrice((int) (p1.getPrice() + (double)((p1.getPrice() * p1.getTax()))));
		p1.setPrice((p1.getPrice() + (int)(p1.getPrice() * p1.getTax())));
		p2.setPrice((int) (p2.getPrice() + (double)((p2.getPrice() * p2.getTax()))));
		p3.setPrice((int) (p3.getPrice() + (double)((p3.getPrice() * p3.getTax()))));
		System.out.println("상품명 : " + p1.getProductName());
		System.out.println("부가세 포함 가격 : " + p1.getPrice());
		System.out.println("상품명 : " + p2.getProductName());
		System.out.println("부가세 포함 가격 : " + p2.getPrice());
		System.out.println("상품명 : " + p3.getProductName());
		System.out.println("부가세 포함 가격 : " + p3.getPrice());
		

	}

}
