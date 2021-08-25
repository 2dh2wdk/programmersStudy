package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MutualEvaluation {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk1 = new StringTokenizer(br.readLine());
		StringTokenizer stk2;
		int[][] scores = new int[stk1.countTokens()][stk1.countTokens()];
		
		for(int i=0;i<scores.length;i++) {
			stk2 = new StringTokenizer(stk1.nextToken(), ",");
			for(int j=0;j<scores[i].length;j++) {
				scores[i][j] = Integer.parseInt(stk2.nextToken());
			}
		}

		System.out.println(solution(scores));
		
		br.close();
	}
	
	public static String solution(int[][] scores) {
        String answer = "";
        
        for(int x=0;x<scores.length;x++) {
        	for(int y=0;y<scores[x].length;y++) {
        		System.out.print(scores[x][y]+" ");
        	}
        	System.out.println();
        }
        
        for(int i=0;i<scores.length;i++) {
        	List<Integer> chk = new ArrayList<>();
        	
        	for(int x=0;x<scores.length;x++) {
        		chk.add(scores[x][i]);
        	}
        	
        	int result = 0;
        	chk.sort(null);
        	
        	if(chk.get(0)==scores[i][i] || chk.get(chk.size()-1)==scores[i][i]) {
        		if(chk.lastIndexOf(scores[i][i])==chk.indexOf(scores[i][i])) {
        			for(int j=0;j<scores.length;j++) {
        				if(j!=i) {
        					result+=scores[j][i];
        				}
        			}
        			result=result/(scores.length-1)/10;
        		} else {
        			for(int j=0;j<scores.length;j++) {
            			result+=scores[j][i];
            		}
        			result=result/(scores.length)/10;
        		}
        	} else {
        		for(int j=0;j<scores.length;j++) {
        			result+=scores[j][i];
        		}
        		result=result/(scores.length)/10;
        	}
        	
        	switch(result) {
        	case 10 :
        	case 9 : answer+="A"; break;
        	case 8 : answer+="B"; break;
        	case 7 : answer+="C"; break;
        	case 6 : 
        	case 5 : answer+="D"; break;
        	default : answer+="F"; break;
        	}
        }
        
        return answer;
    }
}
