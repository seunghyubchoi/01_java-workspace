package com.kh.chap02_TCP.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientProgram {

	// 클라이언트용 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BufferedReader br = null;
		PrintWriter pw = null;

		Socket socket = null;

		// 요청하고자 하는 서버 : 192.168.30.212
		// 포트번호 : 3000

		int port = 3000;

		String serverIp;

		try {
			serverIp = "192.168.30.211";

			// 1. 서버에 연결 요청 보내는 구문
			// => 요청하고자 하는 서버의 IP 주소와 지정된 포트번호 제시하면서 소켓 객체 생성

			socket = new Socket(serverIp, port);

			// 서버가 꺼져있거나 못 찾으면 통신 실패 socket에 null이 담김

			if (socket != null) {
				// null이 아니라는 의미는 서버와 연결이 잘 됨을 의미
				System.out.println("서버와 연결 성공!");

				// 2. 서버와 입출력 기반스트림 생성
				// 3. 보조스트림을 통해서 성능 개선

				// 입력용 스트림 만들기
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

				// 출력용 스트림 만들기
				pw = new PrintWriter(socket.getOutputStream());

				while (true) {
					// 4. 스트림을 통해 읽고 쓰기
					System.out.println("서버에 보낼 내용 : ");
					String sendMessage = sc.nextLine();
					
					pw.println(sendMessage);
					pw.flush();
					
					
					String message = br.readLine(); // 한 줄 단위로 읽어들이는 보조스트림
					
					System.out.println("서버로부터 전달받은 메세지 : " + message);
					
					
				}

			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 통신 종료
			try {
				pw.close();
				br.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}
