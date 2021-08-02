package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsePrice {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int price = Integer.parseInt(br.readLine());
		int money = Integer.parseInt(br.readLine());
		int count = Integer.parseInt(br.readLine());
		
		System.out.println(solution(price, money, count));
		
		br.close();
	}

	public static long solution(int price, int money, int count) {
        long answer = 0;
        
        for(int i=1;i<count+1;i++) {
        	answer += price*i;
        }
        answer -= money;
        
        if(answer<=0) answer = 0;
        
        return answer;
    }
}
