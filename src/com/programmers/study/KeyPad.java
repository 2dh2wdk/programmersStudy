package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class KeyPad {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String numString = br.readLine();
		String hand = br.readLine();
		StringTokenizer stk = new StringTokenizer(numString , ",");
		int[] numbers = new int[stk.countTokens()];
		
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(stk.nextToken());
		}
		
		System.out.println(solution(numbers, hand));
		
		br.close();
	}
	public static String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuilder result = new StringBuilder();
        HashMap<String, Integer> handMap = new HashMap<>();
        handMap.put("L", 10);
        handMap.put("R", 12);
        
        for(int i=0;i<numbers.length;i++) {
        	if(numbers[i]==0) {
    			numbers[i]=11;
    		}
        	if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7) {
        		result.append("L");
        		handMap.put("L", numbers[i]);
        	} else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9) {
        		result.append("R");
        		handMap.put("R", numbers[i]);
        	} else {
        		if(chkL(numbers[i], handMap.get("L")) == chkR(numbers[i], handMap.get("R"))) {
        			if(hand.equals("left")) {
        				result.append("L");
        				handMap.put("L", numbers[i]); 
        			} else {
        				System.out.println(chkR(numbers[i], handMap.get("R")));
        				result.append("R");
        				handMap.put("R", numbers[i]);
        			}
        		} else {
        			if(chkL(numbers[i], handMap.get("L")) < chkR(numbers[i], handMap.get("R"))) {
        				result.append("L");
        				handMap.put("L", numbers[i]); 
        			} else {
        				result.append("R");
        				handMap.put("R", numbers[i]);
        			}
        		}
        	}
        }
        answer += result;
        return answer;
    }
	public static int chkL(int numbers, int location) {
		int cntL = 0;
		
		if(numbers>=location+3) {
			while(numbers>location+3) {
				location += 3;
				cntL++;
			}
		} if(location>=numbers) {
			while(numbers<location) {
				location -= 3;
				cntL++;
			}
		} if(numbers>=location+1){
				location += 1;
				cntL++;
		}
		
		return cntL;
	}
	
	public static int chkR(int numbers, int location) {
		int cntR = 0;

		if(numbers>=location) {
			while(numbers>location) {
				location += 3;
				cntR++;
			}
		} if(location>=numbers+3) {
			while(numbers+3<location) {
				location -= 3;
				cntR++;
			}
		} if(numbers<=location-1){
				location -= 1;
				cntR++;
		}
		return cntR;
	}
}