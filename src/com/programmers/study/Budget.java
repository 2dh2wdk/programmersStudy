package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Budget {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String dString = br.readLine();
		int budget = Integer.parseInt(br.readLine());
		
		StringTokenizer stk = new StringTokenizer(dString, ",");
		
		int d[] = new int[stk.countTokens()];
		
		for(int i=0;i<d.length;i++) d[i] = Integer.parseInt(stk.nextToken());
		
		System.out.println(solution(d, budget));
		
		br.close();
	}
	public static int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        	
        for(int i=0;i<d.length;i++) {
        	if(budget>=d[i]) {
        		budget-=d[i];
        		answer++; 
        	} else break;
        }
        
        return answer;
    }

}
