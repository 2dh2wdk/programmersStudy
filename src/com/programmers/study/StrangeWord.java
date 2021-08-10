package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StrangeWord {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(solution(br.readLine()));
		
		br.close();
	}

	public static String solution(String s) {
        String answer = "";
        StringBuilder answerBr = new StringBuilder();
        int idx=0;
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)==' ') {
        		answerBr.append(" ");
        		idx=0;
        	}
        	else {
        		if(idx%2==0) {
        			answerBr.append(Character.toUpperCase(s.charAt(i)));
        			idx++;
        		} else {
        			answerBr.append(Character.toLowerCase(s.charAt(i)));
        			idx++;
        		}
        	}
        }
        
        answer = answerBr.toString();
        
        return answer;
    }
}
