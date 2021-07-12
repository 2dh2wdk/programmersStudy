package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
//import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class MathGiveup {

	/**
	 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
	   2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
	   3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
	 */
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		StringTokenizer stk = new StringTokenizer(a);
		StringBuilder sb = new StringBuilder();
		
		int[] answers = new int[stk.countTokens()];
		
		for(int i=0;i<answers.length;i++) {
			answers[i] = Integer.parseInt(stk.nextToken());
		}
		
		for(int j=0;j<solution(answers).length;j++) {
			sb.append(solution(answers)[j]);
			sb.append(" ");
		}
		System.out.println(sb);
		
		br.close();
	}
	
	public static int[] solution(int[] answers) {
        int[] answer = {};
        
        int firstCnt = 0;
        int secondCnt = 0;
        int thirdCnt = 0;
        
        int problemCnt = answers.length;
        
		int[] firstAnswer = firstAnswers(problemCnt);
		int[] secondAnswer = secondAnswers(problemCnt);
		int[] thirdAnswer = thirdAnswers(problemCnt);
		
        for(int i=0;i<problemCnt;i++) {
        	if(firstAnswer[i]==answers[i]) {
        		firstCnt++;
        	}
        	if(secondAnswer[i]==answers[i]) {
        		secondCnt++;
        	}
        	if(thirdAnswer[i]==answers[i]) {
        		thirdCnt++;
        	}
        }
        
        answer = maxChk(firstCnt, secondCnt, thirdCnt);
        
        return answer;
    }
	
	public static int[] firstAnswers(int problemCnt) {
		
		int[] firstAnswer = new int[problemCnt];
		int answer = 1;
		
		for(int i=0;i<problemCnt;i++) {
			firstAnswer[i] = answer;
			if(answer != 5) {
				answer++;
			} else {
				answer=1;
			}
		}
		
		return firstAnswer;
	}
	
	public static int[] secondAnswers(int problemCnt) {
		
		int[] secondAnswer = new int[problemCnt];
		
		for(int i=0;i<problemCnt;i++) {
			if(i%2==0) {
				secondAnswer[i] = 2;
			} else {
				switch(i%8) {
				case 1 : secondAnswer[i] = 1; continue;
				case 3 : secondAnswer[i] = 3; continue;
				case 5 : secondAnswer[i] = 4; continue;
				case 7 : secondAnswer[i] = 5; continue;
				}
			}
		}
		
		return secondAnswer;
	}
	
	public static int[] thirdAnswers(int problemCnt) {
		
		int[] thirdAnswer = new int[problemCnt];
		
		for(int i=0;i<problemCnt;i++) {
			switch(i%10) {
			case 0 : 
			case 1 : thirdAnswer[i] =3; continue;
			case 2 : 
			case 3 : thirdAnswer[i] =1; continue;
			case 4 : 
			case 5 : thirdAnswer[i] =2; continue;
			case 6 : 
			case 7 : thirdAnswer[i] =4; continue;
			case 8 : 
			case 9 : thirdAnswer[i] =5; continue;
			}
		}
		
		return thirdAnswer;
	}
	
	public static int[] maxChk(int firstCnt, int secondCnt, int thirdCnt) {
		
		List<Integer> list = new ArrayList<>();
		List<Integer> resultList = new ArrayList<>();
		list.add(firstCnt);
		list.add(secondCnt);
		list.add(thirdCnt);
		
		list.sort(Comparator.reverseOrder());
		
		if(list.get(0)==firstCnt) resultList.add(1);
		if(list.get(0)==secondCnt) resultList.add(2);
		if(list.get(0)==thirdCnt) resultList.add(3);
		
		int[] result = new int[resultList.size()];
        
		for(int i=0;i<resultList.size();i++) {
			result[i] = resultList.get(i);
		}
		
		return result;
	}
}
