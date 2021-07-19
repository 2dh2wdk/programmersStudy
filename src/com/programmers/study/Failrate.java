package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
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
        int[] answer;
        HashMap<Integer, Integer> stageMap = new HashMap<>();
        HashMap<Integer, Integer> stageRslt = new HashMap<>();
        
        for(int i=1;i<N+2;i++) {
        	stageMap.put(i, 0);
        }
        
        Arrays.sort(stages);
        
       	for(int stage : stages) {
       		for(int i=1;i<stage+1;i++) {
       			stageMap.put(i, stageMap.get(i)+1);
       		}
       	}
       	
       	for(int i=0;i<stages.length;) {
       		int cnt = 1;
       		int j = i+1;
       		if(i!=stages.length-1) {
       			while(stages[i]==stages[j]) {
       				cnt++;
       				j++;
       			}
       		}
       		stageRslt.put(stages[i], cnt*100/stageMap.get(stages[i]));
       		i+=cnt;
       	}
       	answer = new int[stageRslt.size()];
       	Set<Entry<Integer, Integer>> entrySet = stageRslt.entrySet();

       	for(Entry<Integer, Integer> x : entrySet) {
       		System.out.print(x.getKey()+" ");
       		System.out.println(x.getValue());
       	}
       	
       	return answer;
    }
}
