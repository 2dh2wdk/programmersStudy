package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WatermelonN {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(solution(Integer.parseInt(br.readLine())));
		
		br.close();
	}

	public static String solution(int n) {
        String answer = "";
        StringBuilder answerBr = new StringBuilder();
        
        for(int i=0;i<n;i++) {
        	switch (i%2) {
			case 0:
				answerBr.append("수");
				break;
			default:
				answerBr.append("박");
				break;
			}
        }
        answer=answerBr.toString();
        
        return answer;
    }
}
