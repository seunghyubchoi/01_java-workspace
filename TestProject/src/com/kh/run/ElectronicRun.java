package com.kh.run;

import com.kh.model.vo.Desktop;
import com.kh.model.vo.NoteBook;
import com.kh.model.vo.Tablet;
import com.kh.model.vo.controller.ElectronicShop1;

public class ElectronicRun {

	public static void main(String[] args) {
		
		ElectronicShop1 es = new ElectronicShop1();
		
		es.insert(new Desktop("Samsung", "데땁", 1200000, "Geforce1070"));
		es.insert(new NoteBook("LG", "그램", 2000000, 4));
		es.insert(new Tablet("Apple", "아이패드", 800000, false));
		
		Desktop d = es.selectDesktop();
		NoteBook n = es.selectNoteBook();
		Tablet t = es.selectTablet();
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
	}

}
