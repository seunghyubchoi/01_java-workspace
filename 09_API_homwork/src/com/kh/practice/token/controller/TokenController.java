package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController{ // start of class
    
    // constructor
    public TokenController() {}
    
    // method
    public String afterToken(String str) { // start of afterToken(String str)
        // 매개변수로 받아온 str을 StringTokenizer를 이용하여
        // 띄어쓰기를 없애고 없앤 문자열 반환

        StringTokenizer stn = new StringTokenizer(str, " ");
        String stn2 = "";

        while (stn.hasMoreTokens()) {
            stn2 += stn.nextToken();
        }
        
        return stn2;
    } // end of afterToken(String str)

    public String firstCap(String input){ // start of firstCap(String input)
        // 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
        
        input = input.toUpperCase().substring(0, 1) + input.substring(1);

        return input;
        
    } // end of firstCap(String input)

    public int findChar(String input, char one){ // start of findChar(String input, char one)
        // 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
        
        int count = 0;
        
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == one) {
                count++;
            }
        }

        return count;
        
    } // end of findChar(String input, char one)
    
} // end of class