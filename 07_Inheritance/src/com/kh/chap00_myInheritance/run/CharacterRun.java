package com.kh.chap00_myInheritance.run;

import com.kh.chap00_myInheritance.model.vo.Bonobono;
import com.kh.chap00_myInheritance.model.vo.Louisie;
import com.kh.chap00_myInheritance.model.vo.Mario;
import com.kh.chap00_myInheritance.model.vo.Nuhburi;
import com.kh.chap00_myInheritance.model.vo.Porori;
import com.kh.chap00_myInheritance.model.vo.Yoshi;


public class CharacterRun {

	public static void main(String[] args) {
		
		Character[] character = new Character[3];
		
		character[0] = new Character("보노보노",30, 188.5, 'O', "하늘색", "조개껍데기");
		

		
		System.out.println("============================================================================");

		Mario m = new Mario("마리오", 85, "배관공", 133.3, 5000000, 0.5, true);
		Louisie l = new Louisie("루이지", 83, "개발자", 140, 4000000, 0.5, "KH정보교육원");
		Yoshi y = new Yoshi("요시", 552, "탈 것", 150, 8000000, 0.5, "공룡");

		System.out.println(m.information());
		System.out.println(l.information());
		System.out.println(y.information());
		System.out.println("============================================================================");

		m.setIncome(m.getIncome() + (int)(m.getIncome()*m.getBonus()));
		l.setIncome(l.getIncome() + (l.getIncome() * l.getAge()));
		y.setIncome(l.getIncome() * l.getAge());

		System.out.println(m.information());
		System.out.println(l.information());
		System.out.println(y.information());

	}

}
