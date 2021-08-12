package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NumReverse {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		for(int i=0;i<solution(n).size();i++) {
			System.out.print(solution(n).get(i));
		}
		
		br.close();
	}
	
	public static List<Long> solution(long n) {
        List<Long> answer = new ArrayList<>();
        
        while(n>0) {
        	answer.add(n%10);
        	n/=10;
        }
        
        return answer;
    }
}
