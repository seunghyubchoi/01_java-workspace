package com.kh.chap03_character.run;

import com.kh.chap03_character.model.dao.FileCharDao;

public class FileCharRun {

	public static void main(String[] args) {
		FileCharDao dao = new FileCharDao();
		//dao.fileSave();
		dao.fileRead();
	}

}
