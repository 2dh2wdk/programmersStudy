package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeNum {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(solution(br.readLine()));
		
		br.close();
	}
	
	public static int solution(String s) {
        int answer = 0;
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}
