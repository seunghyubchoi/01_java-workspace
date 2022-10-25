package com.kh.practice1.func;
import java.util.Scanner; 
public class VariablePractice3 {
	public void inputTest3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		System.out.print("세로 : ");
		double length = sc.nextDouble();
		
		System.out.println("면적 : " + (width * length));
		System.out.println("둘레 : " + (width+length) * 2 );
		
		sc.close(); 
	}
}
