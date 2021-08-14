package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChkSqaureRoot {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(solution(Long.parseLong(br.readLine())));
		
		br.close();
	}
	
	public static long solution(long n) {
        long answer = 0;
        
        if(Math.sqrt(n)==Math.round(Math.sqrt(n))) {
        	answer = (long) Math.pow(Math.sqrt(n)+1, 2);
        } else {
        	answer=-1;
        }
        
        return answer;
    }
}
