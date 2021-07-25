package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TrasureMap {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer arr1Stk = new StringTokenizer(br.readLine(), ",");
		StringTokenizer arr2Stk = new StringTokenizer(br.readLine(), ",");
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		for(int i=0;i<n;i++) {
			arr1[i] = Integer.parseInt(arr1Stk.nextToken());
			arr2[i] = Integer.parseInt(arr2Stk.nextToken());
		}
		for(int j=0;j<n;j++) {
			System.out.println(solution(n, arr1, arr2)[j]);
		}
		br.close();
	}
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0;i<n;i++) {
        	List<Integer> arr1List = binaryChange(n, arr1[i]);
        	List<Integer> arr2List = binaryChange(n, arr2[i]);
        	StringBuilder sb = new StringBuilder();
        	
        	for(int j=n-1;j>=0;j--) {
        		if(arr1List.get(j)==1 || arr2List.get(j)==1) {
        			sb.append("#");
        		} else {
        			sb.append(" ");
        		}
        	}
        	answer[i] = sb.toString();
        }
        
        return answer;
    }
	
	public static List<Integer> binaryChange(int n, int a) {
        List<Integer> resultList = new ArrayList<>();
        int chk =0;
        while(a>0) {
        	resultList.add(a%2);
        	chk++;
        	a/=2;
        }
        if(n>chk) {
        	while(n>chk) {
        		resultList.add(0);
        		chk++;
        	}
        }
        
        return resultList;
    }
}
