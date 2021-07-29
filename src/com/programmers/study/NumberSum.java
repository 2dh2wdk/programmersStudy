package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberSum {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		System.out.println(solution(a, b));
		
		br.close();
	}
	
	
	public static long solution(int a, int b) {
        long answer = 0;
        
        if(a>b) {
        	for(int i=b;i<=a;i++) {
        		answer += i;
        	}
        } else {
        	for(int i=a;i<=b;i++) {
        		answer += i;
        	}
        }
        
        return answer;
    }
}
