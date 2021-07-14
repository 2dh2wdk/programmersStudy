package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PlusMinus {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String absoluteInput = br.readLine();
		String signInput = br.readLine();
		
		StringTokenizer abstk = new StringTokenizer(absoluteInput);
		StringTokenizer sistk = new StringTokenizer(signInput);
		
		int[] absolutes = new int[abstk.countTokens()];
		boolean[] signs = new boolean[sistk.countTokens()];
		
		for(int i=0;i<absolutes.length;i++) {
			absolutes[i] = Integer.parseInt(abstk.nextToken());
			signs[i] = Boolean.valueOf(sistk.nextToken());
		}
		
		System.out.println(solution(absolutes, signs));
		br.close();
	}
	
	public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0;i<absolutes.length;i++) {
        	if(signs[i]==false) {
        		absolutes[i] *= -1;
        	}
        	answer+=absolutes[i];
        }
        
        return answer;
    }
}
