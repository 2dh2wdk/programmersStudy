package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HidePhoneNum {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println(solution(br.readLine()));
		
		br.close();
	}
	
	public static String solution(String phone_number) {
        String answer = "";
        
        char[] phoneChar = phone_number.toCharArray();
        
        for(int i=0;i<phoneChar.length-4;i++) {
        	phoneChar[i] = '*';
        }
        answer = String.valueOf(phoneChar);
        
        return answer;
    }
}
