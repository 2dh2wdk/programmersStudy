package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisorSum {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(solution(Integer.parseInt(br.readLine())));
		
		br.close();
	}
	
	public static int solution(int n) {
        int answer = 0;
        
        for(int i=1;i*i<=n;i++) {
        	if(n%i==0) {
        		answer+=i;
        		if(i!=n/i) {
        			answer+=n/i;
        		}
        	}
        }
        
        return answer;
    }
}
