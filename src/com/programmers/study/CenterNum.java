package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CenterNum {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		System.out.println(solution(s));
		
		br.close();
	}
	
	public static String solution(String s) {
        String answer = "";
        
        if(s.length()%2==0) {
        	answer+=s.charAt(s.length()/2-1);
        	answer+=s.charAt(s.length()/2);
        } else {
        	answer+=s.charAt(s.length()/2);
        }
        
        return answer;
    }
}
