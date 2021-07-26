package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DartGame {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String dartResult = br.readLine();
		System.out.println(solution(dartResult));
		
		br.close();
	}
	
	public static int solution(String dartResult) {
        int answer = 0;
        List<Integer> resultList = new ArrayList<>();
        
        for(int i=0;i<dartResult.length();i++) {
	        if(dartResult.charAt(i)=='S') {
	        	if(dartResult.charAt(i-1)!='0') {
	        		resultList.add(dartResult.charAt(i-1)-'0'); 
	        	} else {
	        		if(i-2>=0 && dartResult.charAt(i-2)=='1') {
	        			resultList.add(10);
	        		} else {
	        			resultList.add(0);
	        		}
	        	}
	        } else if(dartResult.charAt(i)=='D') {
	        	if(dartResult.charAt(i-1)!='0') {
	        		resultList.add((int) Math.pow(dartResult.charAt(i-1)-'0', 2));
	        	} else {
	        		if(i-2>=0 && dartResult.charAt(i-2)=='1') {
	        			resultList.add((int) Math.pow(10, 2));
	        		} else {
	        			resultList.add(0);
	        		}
	        	}
	        } else if(dartResult.charAt(i)=='T') {
	        	if(dartResult.charAt(i-1)!='0') {
	        		resultList.add((int) Math.pow(dartResult.charAt(i-1)-'0', 3));
	        	} else {
	        		if(i-2>=0 && dartResult.charAt(i-2)=='1') {
	        			resultList.add((int) Math.pow(10, 3));
	        		} else {
	        			resultList.add(0);
	        		}
	        	}
	        }
	        if(dartResult.charAt(i)=='*') {
	        	if(resultList.size()!=1) {
	        		resultList.set(resultList.size()-1, resultList.get(resultList.size()-1)*2);
	        		resultList.set(resultList.size()-2, resultList.get(resultList.size()-2)*2);
	        	} else {
	        		resultList.set(resultList.size()-1, resultList.get(resultList.size()-1)*2);
	        	}
	        } else if(dartResult.charAt(i)=='#') {
	        	resultList.set(resultList.size()-1, resultList.get(resultList.size()-1)*-1);
	        }
        }
        
        for(int j=0;j<resultList.size();j++) {
        	answer+=resultList.get(j);
        }
        return answer;
    }
}
