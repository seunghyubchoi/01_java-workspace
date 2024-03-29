package com.kh.chap02_TCP.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {
	/*
	 * TCP(Transmission Control Protocol) - 서버, 클라이언트 간의 1:1 소켓 통신 - 데이터를 교환하기에 앞서
	 * 서버, 클라이언트가 연결되어 있어야 됨 - 서버가 먼저 실행되어 클라이언트 요청 기다려야함
	 * 
	 * 
	 * 소켓(Socket) - 프로세스간의 통신을 담당 - Input / OutputStream을 가지고 있다(이 스트림을 통해 입출력이
	 * 이루어짐)
	 * 
	 * Server Socket - 포트와 연결되어(Bind) 외부의 연결 요청을 기다리다 연결요청이 들어오면 수락해 줄 용도 - 수락하게 되면
	 * 통신할 수 있는 소켓 생성(Client Socket)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 보조스트림
		BufferedReader br = null; // 입력보조스트림
		PrintWriter pw = null; // 출력보조스트림

		// 1. 서버의 포트 번호 지정 (서버측에서 몇 번 포트로 통로를 열꺼냐)
		int port = 3000;

		ServerSocket server = null;
		try {
			// 2. Server 소켓 객체 생성시 포트를 결합(Bind)
			// ServerSocket은 클라이언트의 연결 요청을 받아줄 용도의 소켓
			server = new ServerSocket(port);

			// 3. 클라이언트로 부터 접속 요청이 올 때까지 대기 상태
			System.out.println("클라이언트의 요청을 기다리고 있습니다!!!");

			// 4. 연결요청이 오면 연결 요청을 수락 후, 해당 클라이언트와 통신 할 수 있는 서버측 소켓을 생성
			Socket socket = server.accept(); // socket == 클라이언트와 통신 할 수 있는 소켓 객체
			System.out.println(socket.getInetAddress().getHostAddress() + "클라이언트가 연결을 요청했습니다");

			// 5. 클라이언트와 입출력 스트림 생성 (바이트스트림 밖에 안 됨 = 1byte 짜리)
			// => 바이트스트림이라 성능이 별로 좋지 않다

			// 6.보조스트림을 이용해 성능 개선
			// 클라이언트로부터 전달된 값을 한 줄 단위로 읽어들이기 위한 입력용 스트림
			// 입력용 스트림 => 1바이트 짜리 바이트스트림을 문자스트림으로 변경
			// socket.getInputStream() = 바이트스트림
			// 성능 더 좋게 보조스트림 추가
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// 출력용 스트림(클라이언트에게 한 줄 단위로 출력할 수 있는 출력용 스트림)
			pw = new PrintWriter(socket.getOutputStream());
			// PrintWriter : 데이터 출력시 print(), println() 메소드 가지고 있는 보조 스트림

			while (true) {
				// 7. 스트림을 통해 읽고 쓰기
				// 클라이언트로부터 전달된 메세지가 있을 경우 서버측 읽어들일거임!
				// (나한테 들어오는 거니까 입력용 스트림 사용)
				String message = br.readLine();
				System.out.println("클라이언트로부터 전달 받은 메세지 : " + message);

				// 반대로 클라이언트에게 데이터 전달
				System.out.println("클라이언트에게 보낼 내용 : ");
				String sendMessage = sc.nextLine();

				pw.println(sendMessage); // 클라이언트에게 출력
				pw.flush(); // 현재 스트림에 있는 데이터를 강제로 내보내는 메소드

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 반납하는 거 너무너무너무 중요
				// 8. 통신 종료
				pw.close();
				br.close();
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
