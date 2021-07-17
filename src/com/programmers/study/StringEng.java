package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringEng {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		System.out.println(solution(s));
		
		br.close();
	}
	public static int solution(String s) {
        int answer = 0;
        
        s = s.replace("zero", "0")
        	 .replace("one", "1")
        	 .replace("two", "2")
        	 .replace("three", "3")
        	 .replace("four", "4")
        	 .replace("five", "5")
         	 .replace("six", "6")
         	 .replace("seven", "7")
         	 .replace("eight", "8")
         	 .replace("nine", "9");
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}
