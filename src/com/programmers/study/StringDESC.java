package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringDESC {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		System.out.println(solution(s));
		
		br.close();
	}
	
	public static String solution(String s) {
        String answer = "";
        List<Character> stringList = new ArrayList<>();
        for(int i=0;i<s.length();i++) {
        	stringList.add(s.charAt(i));
        }
        
        stringList.sort(Collections.reverseOrder());
        
        for(int j=0;j<stringList.size();j++) {
        	answer += stringList.get(j);
        }
       
        return answer;
    }
}
