package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CntPrimeNum {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(solution(Integer.parseInt(br.readLine())));
		
		br.close();
	}
	public static int solution(int n) {
        int answer = 0;
        
        for(int i=2;i<=n;i++) {
        	if(chkPrime(i)==true) answer++; 
        }
        
        return answer;
    }
	public static boolean chkPrime(int i) {
		
		for(int j=2;j*j<=i;j++) {
			if(i%j==0)  return false;
		}
		
		return true;
	}
}
