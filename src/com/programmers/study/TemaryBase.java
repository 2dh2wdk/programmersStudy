package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TemaryBase {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		System.out.println(solution(n));
		
		br.close();
	}
	public static int solution(int n) {
        int answer = 0;
        
        List<Integer> answerList = new ArrayList<>();
        
        while(n>=3) {
        	answerList.add(n%3);
        	n/=3;
        } answerList.add(n);
        for(int i=0;i<answerList.size();i++) {
        	answer += answerList.get(i)*Math.pow(3, answerList.size()-i-1);
        }
        
        return answer;
    }
}
