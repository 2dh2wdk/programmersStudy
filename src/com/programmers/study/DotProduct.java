package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DotProduct {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String aString = br.readLine();
		String bString = br.readLine();
		
		StringTokenizer stkA = new StringTokenizer(aString);
		StringTokenizer stkB = new StringTokenizer(bString);
		
		int[] a = new int[stkA.countTokens()];
		int[] b = new int[stkB.countTokens()];
		
		for(int i=0;i<a.length;i++) {
			a[i] = Integer.parseInt(stkA.nextToken());
			b[i] = Integer.parseInt(stkB.nextToken());
		}
		
		System.out.println(solution(a, b));
		solution(a, b);
		br.close();
	}
	
    public static int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i=0;i<a.length;i++) {
        	answer += a[i]*b[i];
        }
        return answer;
    }
}
