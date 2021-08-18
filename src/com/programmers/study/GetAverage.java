package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GetAverage {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(br.readLine(), ",");
		int[] arr = new int[stk.countTokens()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
		}
		
		System.out.println(solution(arr));
		
		br.close();
	}

	public static double solution(int[] arr) {
        double answer = 0;
        
        for(int i : arr) {
        	answer+=i;
        }
        
        answer/=arr.length;
        
        return answer;
    }
}
