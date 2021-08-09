package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaesarCipher {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(solution(s, n));
		
		br.close();
	}

	public static String solution(String s, int n) {
        String answer = "";
        
        for(int i=0;i<s.length();i++) {
        	switch (s.charAt(i)) {
			case 32:
				answer +=(char) s.charAt(i);
				break;
			default:
				if(s.charAt(i)>=65 && s.charAt(i)<=90) {
					if(s.charAt(i)+n>90) {
						answer += (char) (s.charAt(i)+n-26);
					} else answer += (char) (s.charAt(i)+n);
				} else {
					if(s.charAt(i)+n>122) {
						answer += (char) (s.charAt(i)+n-26);
					} else answer += (char) (s.charAt(i)+n);
				}
				break;
			}
        }
        
        return answer;
    }
}
