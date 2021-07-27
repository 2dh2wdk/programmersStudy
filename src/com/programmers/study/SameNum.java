package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SameNum {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(br.readLine(), ",");
		
		int[] arr = new int[stk.countTokens()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
		}
		for(int j=0;j<solution(arr).size();j++) {
			System.out.println(solution(arr).get(j));
		}
		
		br.close();
	}
	
	public static List<Integer> solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++) {
        	if(answer.size()==0 || arr[i] != answer.get(answer.size()-1)) {
        		answer.add(arr[i]);
        	}
        }
        
        return answer;
    }

}
