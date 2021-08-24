package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArraySum {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk1 = new StringTokenizer(br.readLine());
		StringTokenizer stk2;
		
		int[][] arr1 = new int[stk1.countTokens()][];
		
		for(int i=0;i<arr1.length;i++) {
			stk2 = new StringTokenizer(stk1.nextToken(), ",");
			arr1[i] = new int[stk2.countTokens()];
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j] = Integer.parseInt(stk2.nextToken());
			}
		}
		
		StringTokenizer stk3 = new StringTokenizer(br.readLine());
		StringTokenizer stk4;
		
		int[][] arr2 = new int[stk3.countTokens()][];
		
		for(int i=0;i<arr2.length;i++) {
			stk4 = new StringTokenizer(stk3.nextToken(), ",");
			arr2[i] = new int[stk4.countTokens()];
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j] = Integer.parseInt(stk4.nextToken());
			}
		}
		
		for(int i=0;i<solution(arr1, arr2).length;i++) {
			for(int j=0;j<solution(arr1, arr2)[i].length;j++) {
				System.out.print(solution(arr1, arr2)[i][j]);
			}
			System.out.println();
		}
		
		br.close();
	}
	public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][];
        
        for(int i=0;i<arr1.length;i++) {
        	answer[i] = new int[arr1[i].length];
        	for(int j=0;j<answer[i].length;j++) {
        		answer[i][j] = arr1[i][j] + arr2[i][j];
        	}
        }
        
        return answer;
    }
}
