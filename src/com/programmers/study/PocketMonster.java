package com.programmers.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;

public class PocketMonster {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		StringTokenizer stk = new StringTokenizer(a);

		int[] pocketNum = new int[stk.countTokens()];
		for(int i=0;i<pocketNum.length;i++) {
			pocketNum[i] = Integer.parseInt(stk.nextToken());
		}
		System.out.println(solution(pocketNum));
		
		br.close();
	}
	public static int solution(int[] nums) {
        int answer = 0;
        int getPocket = nums.length/2;
        
        List<Integer> pocketList = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++) {
        	if(pocketList.contains(nums[i])==false) pocketList.add(nums[i]);
        }

        answer = getPocket <= pocketList.size() ? getPocket:pocketList.size();
        
        return answer;
    }
}
