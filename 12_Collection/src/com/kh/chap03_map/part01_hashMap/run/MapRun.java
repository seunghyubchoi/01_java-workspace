package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {
		HashMap hm = new HashMap(); // 제네릭 아닌 일반 hashMap =
		// 계층구조를 보면
		// List 계열, Set 계열의 클래스들은 Collection을 구현한 클래스다.
		// => 객체를 추가하고자 할 때 공통적으로 add 메소드 이용!

		// Map 계열은 Collection을 구현한 클래스가 아님 => add 메소드 못 씀
		// 추가하고자 할 때 put 메소드 이용 (이 때 key + value 세트로 담아야 됨!)

		// 1. put(K, V) : 컬렉션에 키 밸류 세트로 추가시켜주는 메소드
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸쵸", new Snack("옥수수맛", 600));
		hm.put("새우깡", new Snack("짠맛", 500));

		hm.put("포테이토칩", new Snack("짠맛", 500));
		System.out.println(hm); // {키 = 밸류, 키 = 밸류, ...}
		// hashMap으로 저장되는 순서는 유지가 안됨, value 값이 중복이 되도 key 값이 중복이 안되면 잘 저장 됨!

		hm.put("새우깡", new Snack("매운맛", 700));
		System.out.println(hm);
		// 동일한 key 값이 중복되면 value 값이 덮어쓰기가 된다 = 중복된 key 값이 공존할 수 없음

		// 2. get(Object key) : V => 컬렉션에서 해당 키 값을 가지는 Value 값을 반환시켜주는 메소드
		Snack s = (Snack) hm.get("다이제"); // 형변환이나 제네릭 맞춰 줘야함
		System.out.println(s);

		// 3. size() : 컬렉션에 담겨있는 객체들의 개수 반환
		System.out.println("몇개 있을까? : " + hm.size() + "개 있음");

		// 4. replace(key, value) => 컬렉션에서 해당 키 값을 찾아서 다시 전달한 value 값으로 수정 시켜주는 메소드
		hm.replace("포테이토칩", new Snack("겁나 짠맛", 1000));
		System.out.println("replace 후 : " + hm);

		// 5. remove(Object key) => 컬렉션에서 해당 키 값을 찾아서 그 키 - 밸류 세트를 삭제시켜주는 메소드
		hm.remove("포테이토칩");
		System.out.println("remove 후 : " + hm);
		System.out.println();
		System.out.println(
				"=======================================================================================================");
		System.out.println();
		System.out.println("=== 하나씩 출력하기 === ");
		System.out.println();
		// ArrayList 사용해볼까? => 사용 안됨
		// ArrayList list = new ArrayList(hm); // ArrayList는 value만 담을 수 있음

		// Iterator 반복자를 이용
		// Iterator it = hm.Iterator(); // "곧바로" iterator() 호출 못 함
		// iterator()는 List 계열, Set 계열에서만 쓸 수 있는 메소드 => 우회해서 사용하자~~!!!

		// 우회법
		// Map을 Set으로 바꿔주는 메소드 제공함 (게다가 2개나..!)
		// Map계열 => Set계열

		// 1. keySet() 이용하는 방법

		// 현재 hm 에는 k+v가 함께 들어가 있음

		// 1) hm에 있는 key들만 Set에 담기(key들의 집합 형태)

		Set keySet = hm.keySet();
		// hm의 key 값만 keySet에 담긴 상태 ex. 다이제 칸쵸 새우깡

		// 2) 1번 과정에서 작업된 keySet을 iterator에 담기
		Iterator itKey = keySet.iterator();
		// hm.iterator 안됨!!!! set값만 iterator 사용 가능 기억하세용~~~
		// 실행하는 순간 itKey 공간이 생긱고 keySet.iterator(); 사용시 keySet의 값이 하나씩 Iterator에 들어감
		// Iterator에 다이제 새우깡 칸쵸 들어가 있는거임

		// 3) 반복문을 통해서 뽑기 : 이거 왜함??? = key+value를 한 번에 가져오는 건 못함
		while (itKey.hasNext()) {
			String key = (String) itKey.next();
			// iterator itKey에 있는 keySet의 키 값이 String key로 하나씩 들어감

			// value를 가지고 있는 hm을 가지고 오자, value는 iterator로 가져 올 수 없어요, 맵에서만 가져올 수 있음
			// 2. get(Object key) : V => 컬렉션에서 해당 키 값을 가지는 Value 값을 반환시켜주는 메소드

			Snack value = (Snack) hm.get(key);
			System.out.println(key + " = " + value);
		}
		System.out.println();
		
		
		
		
		System.out.println("=== entrySet() 이용 ===");
		System.out.println();
		// 

		// 1) hm.entrySet() : Set
		Set<Entry<String, Snack>> entrySet = hm.entrySet(); // Entry(K+V)

		// 2) entrySet.iterator() : Iterator
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();

		// 3) 반복문을 통해서 가져오기
		while (itEntry.hasNext()) {
			// iterator는 무조건 while
			Entry<String, Snack> entry = itEntry.next();
			// 이 안에 key, value가 다 담겨있음!

			String key = entry.getKey();
			Snack value = entry.getValue();

			System.out.println(key + "=" + value);
		}
	}

}
