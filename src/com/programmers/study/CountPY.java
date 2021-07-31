package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountPY {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		System.out.println(solution(s));
		
		br.close();
	}
	
	public static boolean solution(String s) {
        boolean answer = true;
        int cntP = 0, cntY= 0;
        
        for(int i=0;i<s.length();i++) {
        	if(s.toLowerCase().charAt(i)=='p') {
        		cntP++;
        	} else if(s.toLowerCase().charAt(i)=='y') {
        		cntY++;
        	}
        }
        if(cntP!=cntY) {
        	answer = false;
        }
        return answer;
    }
}
