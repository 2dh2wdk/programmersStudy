package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumListDESC {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(solution(Long.parseLong(br.readLine())));
		
		br.close();
	}
	public static long solution(long n) {
		long answer = 0;
        
		List<Long> numList = new ArrayList<>();
		
		while(n>0) {
			numList.add(n%10);
			n/=10;
		}
		numList.sort(null);
		for(int i=0;i<numList.size();i++) {
			answer+=numList.get(i)*Math.pow(10, i);
		}
		
        return answer;
    }
}
