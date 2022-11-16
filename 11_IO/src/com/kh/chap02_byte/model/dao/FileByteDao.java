package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// dao (Data Access Object : 데이터가 오가는 것을 관리함)
public class FileByteDao {

	/*
	 * "바이트 기반 스트림"를 가지고 데이터 입출력 해보기 - 바이트 스트림 : 데이터를 1바이트 단위로 전송하는 통로(좁은 통로기 때문에
	 * 1바이트면 한글이 깨짐) - 기반 스트림 : 외부 매체와 직접적으로 연결되는 통로 !
	 * 
	 * xxxInputStream : 'xxx' 외부매체 이름이며, xxx 매체로부터 데이터를 입력 받는 통로(외부매체로부터 데이터를 읽어오겠다)
	 * xxxOutputStream : xxx 매체로부터 데이터를 출력하는 통로(외부매체로 데이터를 내보내겠다)
	 */

	// 프로그램(자바 또는 메모리) => 외부매체(파일) (출력 : 프로그램 상의 데이터를 파일로 내보내기, 즉 파일로 저장)
	public void fileSave() {
		// FileOutputStream : 파일과 직접적으로 연결해서 1바이트 단위로 출력하는 스트림
		// 파일 출력의 단계
		// 1. 스트림 생성
		// 2. 스트림으로 데이터 출력(메소드 활용)
		// 3. 스트림 사용 후 스트림 반납(반드시 종료해주세요!!)

		// FileOutputStream fout = new FileOutputStream("a_byte.txt");
		// 1-2.try-catch
		FileOutputStream fout = null; // finally에서 fout을 못 받아서 전역변수 지정해주면서 null
		try {
			// 1. FileOutputStream 객체 생성 => 해당 파일과의 연결 통로가 만들어짐
			fout = new FileOutputStream("a_byte.txt");
			// 2. 파일에 데이터를 출력하고자 할 때 write라는 메소드를 사용
			// 숫자를 출력하든 문자를 출력하든 실상 파일에 기록이 되는건 문자로 기록됩니다 (아스키코드표)
			fout.write(97); // 숫자 또는 문자 한 글자를 넘겨주는 write(). 97 = 'a'
			fout.write('b'); // 'b'가 저장됨
			fout.write('힛'); // 한글은 2바이트여서 깨져서 저장됩니다~ => 바이트 스트림으로는 제한이 있음

			byte[] arr = { 99, 100, 101 }; // 배열도 문자로 담겨서 c d e 입니다
			fout.write(arr);

			// fout.write(b, off, len);
			fout.write(arr, 1, 2); // arr의 1번 인덱스로부터 1,2번 인덱스(d, e)가 fout에 저장됨

			// 3. 스트림을 다 이용했으면 반납하기! (반드시)
			// fout.close(); // 반납!!!!
			// *** 위에서 write() 실행시 IOException 발생하면 close() 무시하고 catch 블럭 빠져나감 (반납 안함)
			// 반드시 실행해야 하는 구문임 = finally{} 에 기술

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// 해당 파일이 없으면 새로 만들어주고 통로 연결까지 해줍니다.
		// 파일이 있으면 해당 파일과 통로 연결만 해줍니다~
		catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 이 안에 작성된 코드는 어떤 예외가 발생했던 간에 마지막에 무조건 실행하고 빠져나간다
			try {
				// 3. 스트림 다 이용했으면 반납하기 (반드시 반드시 해야합니다)
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	// 포르그램 <----------- 파일 (입력 : 파일로부터 데이터 가져오기)
	public void fileRead() {
		// FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력을 받는 스트림
		// 1. 스트림 생성으로 통로 만들기
		// 2. 스트림을 통해서 입력을 받아옴 (메소드 활용)
		// 3. 사용한 스트림을 반납(반드시)

		FileInputStream fin = null;

		try {
			// 1. FileInputStream 객체 생성 => 해당 파일과 연결 통로 만들집니다
			fin = new FileInputStream("a_byte.txt");

			// 2. 파일로부터 데이터를 읽어들이기 => read()
			// => 1byte 단위로 하나씩 읽어옴 / 반환형이 int여서 숫자로 읽어들입니다

			/*
			 * 조건 검사하면서 fin.read() 함수를 실행해버리니 출력할 때 전부 나오지않음 while (fin.read() != -1) { //
			 * 읽어들인 값이 -1이 아닐 경우메나 반복적으로 실행 되도록 System.out.println(fin.read()); }
			 */
			/*
			 * System.out.println(fin.read()); System.out.println(fin.read());
			 * System.out.println(fin.read()); System.out.println(fin.read());
			 * System.out.println(fin.read()); System.out.println(fin.read());
			 * System.out.println(fin.read()); System.out.println(fin.read());
			 * 
			 * System.out.println(fin.read());// 파일의 끝을 만나는 순간 -1을 받아온다
			 */

			// 해결 방법 1. 무한 반복으로 돌리면서 매번 조건검사
			/*
			 
			while (true) {
				int value = fin.read(); // 반복문 돌때마다 한 번만 fin.read()에서 메소드가 실행됨
				if (value == -1) {
					break;
				}
				System.out.println(value); // 여기선 value에 담긴 fin.read() 값을 가져오기만 함
			}
			
			*/
			
			// 해결 방법 2. 권장 방법
			int value = 0;
			while((value = fin.read()) != -1) { // 읽어들인 값이 -1이 아닌 경우에만 반복적으로 실행
				System.out.println(value);
			}
			
			
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
