package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class MinNumRemove {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine(), ",");
		int[] arr = new int[stk.countTokens()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] =Integer.parseInt(stk.nextToken());
		}
		
		for(int i=0;i<solution(arr).size();i++) {
			System.out.println(solution(arr).get(i));
		}
		
		br.close();
	}
	
	public static List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        
        if(arr.length==1) {
        	answer.add(-1);
        } else {
        	for(int i=0;i<arr.length;i++) {
        		answer.add(arr[i]);
        	}
        	answer.remove(Integer.valueOf(Collections.min(answer)));
        }
        
        return answer;
    }
}
