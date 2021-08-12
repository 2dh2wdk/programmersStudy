package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CipherSum {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(solution(Integer.parseInt(br.readLine())));
		
		br.close();
	}
	public static int solution(int n) {
        int answer = 0;
        
        while(n>0) {
        	answer+=n%10;
        	n/=10;
        }
        return answer;
    }
}
