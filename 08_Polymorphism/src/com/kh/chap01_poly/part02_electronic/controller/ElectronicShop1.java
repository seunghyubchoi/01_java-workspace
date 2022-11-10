package com.kh.chap01_poly.part02_electronic.controller;
// 다형성 적용 안 했을 때

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicShop1 {
	// Run 클래스는 납품업체라고 생각
	// ElectronicShop은 용산 전자상가에 있는 가게
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	// 세 개의 제품을 갖다 놓기 위해 자리만 마련해둠 
	public void insert(Desktop d) { // d = Desktop(~~~), // Desktop d = new Desktop(~~~)
		desk = d;
	}
	
	public void insert(NoteBook n) { // new NoteBook("LG", "그램", 2000000, 4 = 이게 n으로 그리고 note로..
		note = n;
	}
	
	public void insert(Tablet t) { // new Tablet("Apple", "아이패드", 800000, false = 이게 t로 그리고 tab으로..
		tab = t;
	}
	
	public Desktop selectDesktop() {
		return desk;
	}
	

	public NoteBook selectNoteBook() {
		return note;
	}

	public Tablet selectTablet() {
		return tab;
	}
	
	
}
