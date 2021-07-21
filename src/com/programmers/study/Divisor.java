package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divisor {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int left = Integer.parseInt(br.readLine());
		int right = Integer.parseInt(br.readLine());
		
		System.out.println(solution(left, right));
		
		br.close();
	}
	
	public static int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left;i<=right;i++) {
        	answer+=divisor(i);
        }
        
        return answer;
    }
	
	public static int divisor(int num) {
		int cnt = 0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				cnt++;
			}
		}
		
		if(cnt%2==0) {
			return num;
		} else {
			return num*-1;
		}
	}
}
