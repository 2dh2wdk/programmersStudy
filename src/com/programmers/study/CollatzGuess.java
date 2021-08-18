package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CollatzGuess {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(solution(Integer.parseInt(br.readLine())));
		
		br.close();
	}
	
	public static int solution(long num) {
        int answer = 0;

        while(num!=1) {
        	if(num%2==0) {
        		num/=2;
        		answer++;
        	} else {
        		num=num*3+1;
        		answer++;
        	}
        	System.out.println(num);
        	if(answer==500 && num!=1) {
        		answer=-1;
        		break;
        	}
        }
        
        return answer;
    }
}
