package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringUseBasic {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(solution(br.readLine()));
		
		br.close();
	}
	
	public static boolean solution(String s) {
        boolean answer = true;
        String chk = "^[0-9]*$";

        if(s.length()!=4 && s.length()!=6 || s.replaceAll(chk, "").length()!=0) {
        	answer = false;
        }
        
        return answer;
    }
}
