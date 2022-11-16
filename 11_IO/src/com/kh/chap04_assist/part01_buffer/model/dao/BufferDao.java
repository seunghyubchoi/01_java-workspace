package com.kh.chap04_assist.part01_buffer.model.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDao {
	/*
	 * 
	 * 보조스트림 : 기반스트림만으로 부족했던 성능을 보다 향상 시켜주는 스트림
	 * 			 기반스트림에서 제공하지 않는 추가적인 메소드를 제공
	 * 			 데이터 전송 속도를 향상 시킴 + a
	 * 
	 * 기반스트림과 다른 점 : 외부매체와 직접적으로 연결되는 스트림은 아닙니다(단독사용불가)
	 */
	
	// 프로그램에서 파일로 출력(쓰기)
	public void fileSave() {
		// FileWriter 기반 스트림을 이용
		// 파일과 직접적으로 연결해서 2바이트 단위로 출력할 수 있는 스트림
		// 보조스트림은 기반스트림과 뒷 이름을 맞춰서 사용합니다~ 
		
		// BufferedWriter : '버퍼'라는 공간을 제공해주는 보조스트림(속도 향상) 
		// BufferedWriter bw = new BufferedWriter("c_buffer.txt");
		// : 단독 사용 불가
		
		// 1. 기반 스트림 생성
		//FileWriter fw = new FileWriter("c_buffer.txt");
		
		// 2. 보조스트림 생성시 기반스트림 객체를 전달하면서 생성
		// BufferedWriter bw = new BufferedWriter(fw);
		
		
		//BufferedWriter bw = null;
		
		/*
		try {
		// 위의 두 줄을 한 줄로 작성
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			// write 메소드 이용해서 데이터 출력
			bw.write("안녕하세요\n");
			bw.write("반갑습니다.");
			bw.newLine(); // 추가적인 메소드 활용가능 => 개행
			bw.write("저리가세요");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		// try~with~resource 구문으로 자원 반납까지 더 간단하게 작업할 수 있음
		// jdk7 버전 이상에서 가능
		
		/*
		 * try (try 블럭 내에서 사용할 스트림 객체 생성 구문) {
		 * 
		 * } catch(예외클래스 e){
		 * 
		 * }
		 */
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) {
			// write 메소드 이용해서 데이터 출력
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine();
			bw.write("저리가세요");
			// 버퍼라는 공간에 계속 쌓아놨다가 한번에 출력 => 속도 향상에 좋다
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
