package com.kh.chap03_map.part01_hashMap.controller;

import java.util.HashMap;

public interface MethodList {
	void addNumber(String key, String value);
	String searchByName();
	HashMap<String, String> showAllNumber();
	HashMap<String, String> removeAllNumber();
	HashMap<String, String> removeByName();
	
}
