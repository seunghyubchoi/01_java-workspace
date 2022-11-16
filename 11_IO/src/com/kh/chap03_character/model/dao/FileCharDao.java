package com.kh.chap03_character.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {

	/*
	 * "문자 기반 스트림"을 가지고 입출력 해보기
	 * 
	 * - 문자스트림 : 데이터를 2바이트 단위로 전송하는 통로 
	 * - 기반스트림 : 외부 매체왜 직접적으로 연결되는 통로 
	 * - xxxReader : 입력용 스트림
	 * = xxxWriter : 출력용 스트림
	 * 
	 * 
	 */
	// 출력: 프로그램에서 바깥 파일에 쓰는 것
	public void fileSave() {
		// FileWriter : 파일로 데이터를 2바이트 단위로 출력할 수 있는 스트림
		FileWriter fw = null;
		try {
			// 1. FileWriter 객체 생성
			fw = new FileWriter("b_char.txt");
			// 해당 파일이 없으면 새로 만들고 연결, 있으면 그냥 연결
			// fw = new FileWriter("b_char.txt", true); => 계속 추가 생성
			// 2.write() 이용, 데이터 출력
			// 2바이트 단위로 데이터를 전송, 한글 가능

			fw.write("와! IO 재밌다!");
			fw.write(' ');
			fw.write('A');
			fw.write('\n');

			char[] arr = { 'a', 'p', 'p', 'l', 'e' };
			fw.write(arr);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close(); // 스트림 반납
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// 입력 : 프로그램으로 읽어 오는 것
	public void fileRead() {
		// FileReader : 파일로부터 데이터를 2바이트 단위로 입력 받을 수 있는 스트림

		FileReader fr = null;
		try {
			// 1. FileReader 객체 생성
			fr = new FileReader("b_char.txt");
			// 파일이 없다면 알아서 만들어지는 게 아님, 없는데 읽을 수 없음

			// 2. read 메소드 이용해서 읽어들이자(정수 값)
			// 파일의 끝을 만나는 순간 -1을 출력
				
			int value = 0;
			while ((value = fr.read()) != -1) {
				System.out.print((char)value);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3. 스트림 반납
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
