package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetGCDLCM {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine());
		
		for(int i=0;i<2;i++) {
			System.out.println(solution(n, m)[i]);
		}
		
		br.close();
	}
	public static int[] solution(int n, int m) {
        int[] answer = {1,1};
        int i=2;
        while(i<=n) {
        	while(n%i==0 && m%i==0) {
        		answer[0]*=i;
        		answer[1]*=i;
        		n/=i;
        		m/=i;
        	}
        	i++;
        }
        
        answer[1]*=n*m;
        
        return answer;
    }
}
