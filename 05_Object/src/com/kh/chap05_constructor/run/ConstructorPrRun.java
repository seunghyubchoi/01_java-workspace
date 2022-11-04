package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.*;

public class ConstructorPrRun {
	public static void main(String[] args) {

		ConstructorPr p1 = new ConstructorPr("원피스", "루피", 19, 173);
		System.out.println(p1.information());
	}

}
