package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCompression {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(solution(br.readLine()));
		
		br.close();
	}
	
	public static int solution(String s) {
        int answer = 0;
        
        for(int i=0;i<s.length()/2;i++) {
        	for(int j=0;j<s.length();) {
        		int idx=i;
        		
        		while(s.indexOf(j)==s.indexOf(j+idx)) {
        			
        		}
        	}
        }
        
        return answer;
    }
}
