package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class NumberOfKth {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String a = br.readLine();
		StringTokenizer stkArr = new StringTokenizer(a);
		int[] array = new int[stkArr.countTokens()];
		
		for(int i=0;i<array.length;i++) {
			array[i] = Integer.parseInt(stkArr.nextToken());
		}
		
		String b = br.readLine();
		StringTokenizer stkCommand = new StringTokenizer(b);		 // 2,5,3  4,4,1  1,7,3 1,4,9
		String[] commandY = new String[stkCommand.countTokens()]; // length 4

		for(int i=0;i<commandY.length;i++) {
			commandY[i] = stkCommand.nextToken();				 // stkCommandY[1] = 2,5,3 stkCommandY[2] = 4,4,1 ...
		}
		
		int[][] commands = new int[commandY.length][3];
		
		for(int i=0;i<commandY.length;i++) {
			StringTokenizer stkCommandX = new StringTokenizer(commandY[i], ",");
			for(int j=0;j<3;j++) {
				commands[i][j] = Integer.parseInt(stkCommandX.nextToken());
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int k=0;k<solution(array, commands).length;k++) {
			sb.append(solution(array, commands)[k]);
		}
		System.out.println(sb);
		
		br.close();
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        
        int i,j,k;
        
        for(int l=0;l<commands.length;l++) {
        	i=commands[l][0];
        	j=commands[l][1];
        	k=commands[l][2];

        	answer[l] = result(array, i, j, k);
        }
        
        return answer;
    }
	
	public static int result(int[] array, int i, int j, int k) {
		List<Integer> list = new ArrayList<>();
		for(int l=i-1;l<j;l++) {
			list.add(array[l]);
		}
		list.sort(null);
		
		return list.get(k-1);
	}
}
