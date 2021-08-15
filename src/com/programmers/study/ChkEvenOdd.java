package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChkEvenOdd {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(solution(Integer.parseInt(br.readLine())));
		
		br.close();
	}
	
	public static String solution(int num) {
        String answer = "";
        
        answer = num%2==0 ? "Even" : "Odd"; 
        
        return answer;
    }

}
