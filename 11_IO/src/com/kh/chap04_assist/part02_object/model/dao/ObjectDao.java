package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {

	// 프로그램 ===== > 파일 (출력)
	// 파일은 사실 우리가 보려고 관상용으로 만든다기보다는
	// 나중에 읽어오기 위해 만드는 거에요

	public void fileSave() {

		// 출력할 데이터(Phone 객체)
		Phone ph1 = new Phone("아이폰", 1300000);
		Phone ph2 = new Phone("갤럭시", 1200000);
		Phone ph3 = new Phone("플립", 1500000);

		// 객체 단위로 출력해 줄 수 있는 보조스트림 필요

		// ObjectXXX => Writer, Reader가 없음
		// OutputStream, InputStream만 사용 가능
		// 따라서 뒤 이름도 FileOutputStream : 파일과 연결해서 1바이트 단위로 출력할 수 있는 기반스트림
		// ObjectOutputStream : 객체 단위로 출력할 수 있도록 도움을 주는 보조스트림(ObjectWriter 이런 건 없음!!)

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))) {
			oos.writeObject(ph1);
			oos.writeObject(ph2);
			oos.writeObject(ph3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	
	public void fileRead() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"))) {
			try {
				while (true) {
					System.out.println(ois.readObject());
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} catch (EOFException e) {
			System.out.println("파일이 없어요");
			// e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
