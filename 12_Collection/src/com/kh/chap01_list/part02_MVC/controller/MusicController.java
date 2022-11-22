package com.kh.chap01_list.part02_MVC.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_MVC.model.vo.Music;
import com.kh.chap01_list.part02_MVC.view.MusicMenu;

// 사용자의 요청을 처리해주는 클래스, 출력문 쓰지 않기!!

/**
 * @author 최승협
 *
 */
public class MusicController {
	private ArrayList<Music> list = new ArrayList<Music>();
	{ // 초기화 블럭
		list.add(new Music("Attention", "뉴진스"));
		list.add(new Music("새삥", "지지지지아코"));

	}

	public void insertMusic(String title, String artist) { //insert 반환형 int로 짤 경우가 많음 
		list.add(new Music(title, artist));
	}

	public ArrayList<Music> selectMusic() {
		return list;
	}

	public int deleteMusic(String title) { //delete 반환형 int로 짤 경우가 많음 

		int result = 0;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result = 1;
				// System.out.println("성공적으로 삭제 됐습니다");
				break; // 반복문 빠져나오기
			}
			// result == 0 (삭제할 곡을 못 찾음) | 1 (성공적으로 삭제 했다)
		}
		return result;

	}
	
	//1. 기본 버전
	/*
	public ArrayList<Music> searchMusic(int menu, String keyword) {
		// 전체, 여러 개를 반환할때는 ArrayList를 씀

		ArrayList<Music> searchList = new ArrayList<Music>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
			}
		}
		return searchList;

	}
	*/
	
	
	// 2. 심화버전
	
	public ArrayList<Music> searchMusic(int menu, String keyword){
		ArrayList<Music> searchList = new ArrayList<Music>();
		if(menu == 1) {
			// 제목으로 검색
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		} else {
			// 가수명으로 검색
			for(int i = 0; i <list.size(); i++) {
				if(list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		}
		
		
		return searchList;
	}
	
	
	
	
	
	
	public int updateMusic(String title, String upArtist, String upTitle) {
		// 처리 건수와 같이 출력하기 위해 int 반환형 많이 씀
		
		int result = 0; 
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setArtist(upArtist);
				list.get(i).setTitle(upTitle);
				result = 1;
				break;
			}
		}
		
		
		return result;
	}
	
	
	
}
