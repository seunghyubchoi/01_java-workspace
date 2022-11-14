package com.kh.chap02_string.controller;

public class B_StringMethodTest {
	public void method() {
		String str1 = "Hello World";

		// 메소드명(매개변수) : 반환형

		// 1. 문자열.charAt(int index) : char
		// 문자열에서 전달받은 index 위치의 문자만을 추출해서 리턴
		char ch = str1.charAt(6);
		System.out.println("ch : " + ch);

		// 2. 문자열.concat(String str) : String
		// 문자열과 전달된 또 다른 문자열을 하나로 합쳐서 새로운 문자열 리턴
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);

		String str3 = str1 + "!!!";
		System.out.println("str3 : " + str3);

		System.out.println("str2와 str3가 일치하나요? : " + str2 == str3);
		// 근데 아까전에 StringPool에서 같은 글자면 같은 주소 아닌가요?
		// concat에는 new가 있어 새로운 heap영역을 만듦
		// str3만 StringPool에 있다

		// 3. 문자열.equals(Object obj) : boolean return
		// 문자열과 전달된 또 다른 문자열 가지고 주소값 비교가 아닌 실제 문자열 가지고 동등 비교한다

		System.out.println("str2와 str3가 일치합니까(equals) : " + str2.equals(str3));

		// 4. 문자열.contains(CharSequence s) : boolean
		System.out.println("str1에 Hello 문자열이 포함되어 있습니까? : " + str1.contains("Hello"));
		System.out.println("str1에 bye 문자열이 포함되어 있습니까? : " + str1.contains("bye"));

		// 5. 문자열.length() : int
		System.out.println("str1의 길이 : " + str1.length());

		// 6. 문자열.substring()

		// 문자열.substring(int beginIndex) : String
		// => 문자열의 beginIndex 위치에서부터 끝까지의 문자열 추출
		// 문자열.substring(int beginIndex, int endIndex) : String
		// => 문자열의 beginIndex 위치에서부터 endIndex-1까지 나옴

		// Hello World
		System.out.println(str1.substring(3)); // 3부터 나옴
		System.out.println(str1.substring(3, 7)); //

		// 1. Worl만 추출 + concat() !를 붙여서 Worl! = str1에서 추출해서 concat 붙히고 str0 대입
		// 2. contains 함수를 이용해서 !가 포함 돼 있는지 여부 추출 = str0에 느낌표가 포함 되어 있습니까?

		String str0 = str1.substring(6, 10).concat("!");
		// str0 = str0.concat("!");
		System.out.println("===============================================");
		System.out.println(str0);
		System.out.println("str0에 !이 포함되어 있습니까? : " + str0.contains("!"));

		// 7. 문자열.replace(char oldChar, char newChar) : String
		// 문자열에서 oldChar 문자들을 newChar로 변환한 새 문자열 리턴

		String str4 = str1.replace('l', 'c');
		System.out.println(str4);
		System.out.println("str1이 변경 됐나? : " + str1);

		// 8. 문자열.toUpperCase() : String => 문자열을 다 대문자로 변경한 새 문자열 리턴
		// 문자열.toLowerCase() : String => 문자열을 다 소문자로 변경한 새 문자열 리턴

		String str5 = str1.toUpperCase();
		System.out.println("str5 : " + str5);
		System.out.println("Lower : " + str5.toLowerCase());
		
		/*
		 * System.out.print("계속하시겠습니까? (y/n) : ");
		 * char ch = sc.nextLine().charAt(0);
		 * 
		 * if(ch == 'n' || ch ==  'N') {
		 *	프로그램 종료
		 * }
		 * 
		 * char ch = sc.nextLine().toUpperCase().charAt(0);
		 * if(ch ==  'N') {
		 *	프로그램 종료
		 * }
		 * 
		 * char ch = sc.nextLine().charAt(0).toUpperCase(); => 이런 포맷은 안 됨
		 * = String 클래스에서 제공하는 함수임, toUpper는 String에서만 사용 가능
		 */
		
		// 9. 문자열.trim() : String(얘 많이 씀)
		//	  문자열 앞 뒤 공백을 제거시킨 새 문자열 리턴
		String str6 = "   JA   VA   ";
		System.out.println("str6 :" + str6.trim());
		
		System.out.println("10.");
		// 10. 문자열.toCharArray() : char[]
		char[] arr = str1.toCharArray();
		System.out.println(arr[0]);
		
		
		System.out.println("11.");
		// 11. String.valueOf(char[] data)
		System.out.println(String.valueOf(arr));
		
	}
}