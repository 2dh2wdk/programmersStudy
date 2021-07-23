package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DatyOf2016 {
	
	static int Y = 2016;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		System.out.println(solution(a, b));
		
		br.close();
	}
	
	public static String solution(int a, int b) {
        String answer = "";
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] date = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int result = 0;
        
        for(int i=0;i<a;i++) result+=month[i];
        
        result+=b;
        
        answer = date[result%7];
        return answer;
    }
	
}
