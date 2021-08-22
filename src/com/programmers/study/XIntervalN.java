package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XIntervalN {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(solution(x, n));
		
		br.close();
	}
	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num =0;
        
        for(int i=0;i<n;i++) {
        	num+=x;
        	answer[i] = num;
        }
        
        return answer;
    }
}
