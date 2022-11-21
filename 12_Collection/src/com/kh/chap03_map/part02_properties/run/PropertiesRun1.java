package com.kh.chap03_map.part02_properties.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesRun1 {

	public static void main(String[] args) {
		// properties : Map계열의 컬렉션
		// 키 + 밸류 세트로 저장
		// HashMap과의 차이점 : properties에는 key 값도 String, value도 String으로 담는다
		
	Properties prop = new Properties();
	
	/*
	prop.put("다이제", new Snack("초코맛",1500));
	
	prop.put("새우깡", new Snack("짠맛",500));
	// 객체를 String 으로 바꿀 수 없어서 오류 생김
	
	System.out.println(prop);
	System.out.println(prop.get("다이제"));
	// 위는 HashMap과 같음
	// 하지만 Properties 사용하는 경우 
	// : 주로, Properties에 담긴 것들을 파일로 출력 또는 입력 받아올 때 사용함
	// 즉, Properties에서 제공하는 store(), load() 메소드를 사용하기 위해서 
	
	try {
		prop.store(new FileOutputStream("test.properties"), "properties Test");
		// ClassCastException
		// 이 예외가 발생한 이유 
		// : 내부적으로 store() 실행시 properties에 담겨있는 키와 밸류 세트를 String으로 형변환해서 출력함
		// 밸류 => 객체타입으로 적었기 때문에 형변환 불가
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	*/
	
	
	// 파일 입출력 하고 싶으면 put이 아닌 다른 것을 사용해야한다!!
	
	// Prop[키 + 밸류] => 스트링으로 추가해보자
	// 1. setProperty(String key, String value)
	prop.setProperty("List", "ArrayList");
	prop.setProperty("Set", "HashSet");
	prop.setProperty("Map", "HashMap");
	prop.setProperty("Map", "Properties");
	
	System.out.println(prop);
	// Map에 value 값은 중복이 되도 괜찮지만 key 값은 중복이 있음 안 되서 덮어쓰기
	// 저장 순서는 유지가 안 됨
	// key 값 중복시 덮어 씌여짐
	
	// 2. getProperty(String key) : String
	System.out.println(prop.getProperty("List"));
	System.out.println(prop.getProperty("바보")); 
	// 없는 키 값 입력 시 null 값 나옴
	
	try {
		// 3. store(OutputStream os, String comments) : Properties에 담겨 있는 key-value 값을 파일로 출력
		
		prop.store(new FileOutputStream("test.properties"), "perperties Test");
		
		prop.storeToXML(new FileOutputStream("test.xml"), "properties Test");
	
	
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} 
	// 키 값 밸류 값 글자 색 다름
			
			
	}

}
