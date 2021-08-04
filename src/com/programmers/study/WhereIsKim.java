package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class WhereIsKim {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer stk = new StringTokenizer(br.readLine(), ",");
		String[] seoul = new String[stk.countTokens()];
		
		for(int i=0;i<seoul.length;i++) {
			seoul[i] = stk.nextToken();
		}
		
		System.out.println(solution(seoul));
		
		br.close();
	}
	
	public static String solution(String[] seoul) {
        String answer = "";
        
        List<String> seoulList = Arrays.asList(seoul);
        int idx = seoulList.indexOf("Kim");

        answer+="김서방은 "+idx+"에 있다";
        
        return answer;
    }
}
