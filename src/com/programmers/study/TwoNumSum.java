package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TwoNumSum {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer numStk = new StringTokenizer(br.readLine(), ",");
		int[] numbers = new int[numStk.countTokens()];
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(numStk.nextToken());
		}
		
		for(int j=0;j<solution(numbers).length;j++) System.out.println(solution(numbers)[j]);
		
		br.close();
	}
	
	public static int[] solution(int[] numbers) {
        int[] answer;
        
        List<Integer> answerList = new ArrayList<>();
        for(int i=0;i<numbers.length;i++) {
        	for(int j=i+1;j<numbers.length;j++) {
        		if(answerList.contains(numbers[i]+numbers[j])==false) {
        			answerList.add(numbers[i]+numbers[j]);
        		}
        	}
        }
        answerList.sort(null);
        answer = new int[answerList.size()];
        
        for(int k=0;k<answerList.size();k++) {
        	answer[k] = answerList.get(k);
        }
        
        return answer;
    }
}
