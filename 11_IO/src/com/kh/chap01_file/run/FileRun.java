package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {

		// 메모리는 휘발성임
		// 가나다라 라고 쓰고 컴퓨터 끄면 지워짐!! = 휘발성
		// 기록하기 위해서 파일이 필요해요

		// 간단하게 파일이 만들어지는 과정을 볼거에요
		// java.io.File 클래스를 가지고 파일을 만들거에요
		// io들어가면 예외 처리가 필수입니다

		// File f1 = new File(); => 기본 생성자가 없음


		try {
			// 1. 경로 지정을 딱히 하지 않은 상태로 파일 생성 => 현재 project 폴더에 파일 생성
						File f1 = new File("test.txt");
						f1.createNewFile(); // 메소드까지 실행해야만 실제 파일이 만들어짐
						
						// 2. "존재하는" 폴더에 파일을 생성하는 방법 => 해당 경로까지 지정
						File f2 = new File("D:\\test.txt");
						f2.createNewFile();
						
						// 3. 폴더 먼저 만들고 파일까지 만들어지게 하기
						// 폴더 만들기
						File tempFolder = new File("D:\\temp");
						tempFolder.mkdir();
						
						// F3 => test.txt => D temp 폴더 안
						File f3 = new File("D:\\temp\\test.txt");
						f3.createNewFile();
						
						// 실행할 때 마다 파일이 계속 같은게 만들어지는 건가요???
						
						// 해당 파일이 존재하지 않으면 만들고 존재하면 덮어쓰기 (수정사항이 없으면 그대로 간다)
			
						// f1이라는 게 있는지 확인하는 boolean 메소드 
						System.out.println(f1.exists());
						
						// 파일은 createNewFile이라는 메소드를 통해 생성됩니다
						System.out.println(new File("ttt.txt").exists());
						
						// f1이 파일인가요??
						System.out.println(f1.isFile());
						
						// tempFolder가 파일인가요?
						System.out.println(tempFolder.isFile());
						
						//===================================================================
						
						File folder = new File("parents");
						folder.mkdir();
						
						File file = new File("parents\\person.txt");
						file.createNewFile();
						
						System.out.println("파일명 : " + file.getName());
						System.out.println("절대경로 : " + file.getAbsolutePath());
						// 모든 경로가 나열되어 있는 걸 절대경로라고 불러요
						System.out.println("파일 용량 : " + file.length());
						// 파일에 아무것도 없으면 용량은 0
						System.out.println("상위폴더 : " + file.getParent());
						// 파일이 어디에 있는지 상위폴더를 알려줌
						
						
					
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램을 종료합니다");
	}

	/*
	 * 프로그램 상의 데이터를 외부매체로 출력을 한다거나 외부매체로 부터 입력을 받아올 거에요
	 * 반드시 그 외부매체와 통하는 통로를 만들어야됨 = 통로를 스트림이라고 부릅니다
	 * 
	 * 스트림(통로)의 특징
	 * 
	 * - 개울, 한 방향으로 흐른다
	 * - 단방향, 입력이면 입력, 출력이면 출력만 가능한 통로
	 * => 입력과 출력을 동시다발적으로 하고 싶으면, 입력용스트림, 출력용스트림을 각각 만들어 줍니다
	 * - 선입선출(FIFO), 먼저 들어간 데이터가 먼저 나옵니다, 파이프 같은 개념
	 * - 시간지연(Delay) 이라는 문제가 생길 수 있음 
	 * 
	 * 스트림의 구분
	 * - 통로의 사이즈 (1byte : 바이트 스트림 / 2byte : 문자 스트림) = 두개의 기반 스트림
	 *
	 * - 바이트 스트림 : 1byte만 왔다갔다 할 수 있을 정도의 사이즈(좁은 통로)		
	 * => 바이트 스트림은 두 종류는 입력(InputStream) / 출력 (OutputStream) 라고 불린다
	 * 
	 * - 문자 스트림 : 2byte만 왔다갔다 할 수 있을 정도의 사이즈(넓은 통로)
	 * => 문자 스트림 두 종류는 입력(Reader) / 출력 (Writer) 라고 불린다 
	 * 
	 * - 외부매체 직접 파일 연결하는 유무
	 * - 기반 스트림 : 외부매체랑 직접적으로 연결이 되는 통로(필수, 바이트 스트림, 문자 스트림)
	 * - 보조 스트림 : 말 그대로 보조 역할만 하는 통로, 속도를 빠르게 도와준다거나 그 외의 유용한 기능을 제공(필수 아님)
	 * => 보조 스트림 단독으로는 사용이 불가능, 기반 스트림은 기본적으로 있어야 함
	 * 
	 * 
	 * 
	 * 외부 매체를 파일로 해보자
	 * 첨부파일 기능 구현할 때 필요한 개념
	 * 
	 * 참고) dao: data access object
	 * = 데이터를 주고 받고 하는 곳
	 * 
	 */
	
	
}
