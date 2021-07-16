package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeNum {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(br.readLine(), ",");
		int nums[] = new int[stk.countTokens()];
		for(int i=0;i<nums.length;i++) {
			nums[i] = Integer.parseInt(stk.nextToken());
		}
		System.out.println(solution(nums));
		br.close();
	}
	
    public static int solution(int[] nums) {
        int answer = 0;
        int result;
        for(int i=0;i<nums.length-2;i++) {
        	for(int j=i+1;j<nums.length-1;j++) {
        		for(int k=j+1;k<nums.length;k++) {
        			int chk = nums[i]+nums[j]+nums[k];
        			result = 0;
        			for(int l=2;l<=chk/2;l++) {
        				if(chk%l==0)  result++;
        			}
        			if(result==0) answer++;
        		}
        	}
        }
        
        return answer;
    }
}
