package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class CleanDivision {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer arrStk = new StringTokenizer(br.readLine(), ",");
		int[] arr = new int[arrStk.countTokens()];
		int divisor = Integer.parseInt(br.readLine());
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(arrStk.nextToken());
		}
		for(int i=0;i<solution(arr, divisor).size();i++) {
			System.out.println(solution(arr, divisor).get(i));
		}
		
		br.close();
	}
	
	public static List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]%divisor==0) answer.add(arr[i]);
        }
        
        if(answer.size()==0) answer.add(-1);
        
        return answer;
    }
}
