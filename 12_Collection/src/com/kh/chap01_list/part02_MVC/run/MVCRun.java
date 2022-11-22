package com.kh.chap01_list.part02_MVC.run;

import com.kh.chap01_list.part01.model.vo.Music;
import com.kh.chap01_list.part02_MVC.view.MusicMenu;

public class MVCRun {

	public static void main(String[] args) {
		/*
		 
		 MVC 패턴 : 각 클래스마다 역할(데이터(vo), 화면(main), 요청처리(controller)을 부여해서 작업)
		 사용하는 이유 : 유지보수가 용이하다
		 
		 M(Model)
		 : 데이터를 담당하는 역할(데이터를 담기 위한 클래스, 비지니스 로직을 처리하기 위한 클래스, 데이터가 보관되어 있는 보관함과 연결해서 입출력 클래스)
		 V(View)
		 : 화면을 담당하는 역할 = 사용자에게 보여지는 시각적인 요소들 : 출력문(print), 입력문(Scanner)) 
		 C(Controller)
		 : 사용자가 요청한 내용을 처리한 후 그 결과를 돌려주는 역할(출력문 같은건 안 쓸꺼임!)
		 
		 
		 */
		
		MusicMenu mm = new MusicMenu();
		mm.mainMenu();
	}

}
