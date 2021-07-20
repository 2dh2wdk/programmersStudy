package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Failrate {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String stagesStr = br.readLine();
		
		StringTokenizer stk = new StringTokenizer(stagesStr, ",");
		
		int[] stages = new int[stk.countTokens()];
		
		for(int i=0;i<stages.length;i++) {
			stages[i] = Integer.parseInt(stk.nextToken());
		}
		
		System.out.println(solution(N, stages));
		
		br.close();
	}

	public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        HashMap<Integer, Integer> stageMap = new HashMap<>();
        HashMap<Integer, Integer> stageRslt = new HashMap<>();
        HashMap<Integer, Double> answerMap = new HashMap<>();
        
        for(int i=1;i<N+2;i++) {
        	stageMap.put(i, 0);
        	stageRslt.put(i, 0);
        	answerMap.put(i, (double) 0);
        }
        
       	for(int stage : stages) {
       		for(int i=1;i<stage+1;i++) {
       			stageMap.put(i, stageMap.get(i)+1);
       		}
       		stageRslt.put(stage, stageRslt.get(stage)+1);
       	}
       	
       	for(int stage : stages) {
       		answerMap.put(stage, (double) stageRslt.get(stage)*100/stageMap.get(stage));
       	}
       	
       	for(int i=0;i<N;i++) {
       		if(i==0) {
       			answer[i] = 1;
       		} else {
       			for(int j=i-1;j>=0;j--) {
       				if(answerMap.get(i+1)>answerMap.get(answer[j])) {
       					answer[j+1] = answer[j];
       					answer[j] = i+1;
       				} else {
       					answer[j+1] = i+1;
       					break;
       				}
       			}
       		}
       	}
       	return answer;
    }
}
