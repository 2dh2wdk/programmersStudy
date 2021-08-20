package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HarshadNum {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(solution(Integer.parseInt(br.readLine())));
		
		br.close();
	}
	
	public static boolean solution(int x) {
        boolean answer = true;
        int chk = 0;
        int chkX = x;
        
        while(chkX>0) {
        	chk+=chkX%10;
        	chkX/=10;
        }
        
        if(x%chk!=0) {
        	answer=false;
        }
        
        return answer;
    }
}
