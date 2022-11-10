package com.kh.model.vo.controller;

import com.kh.model.vo.Desktop;
import com.kh.model.vo.NoteBook;
import com.kh.model.vo.Tablet;

public class ElectronicShop1 {

	private Desktop desk;
	private NoteBook note;
	private Tablet tab;

	public void insert(Desktop d) {
		desk = d;
	}

	public void insert(NoteBook n) {
		note = n;
	}

	public void insert(Tablet t) {
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
