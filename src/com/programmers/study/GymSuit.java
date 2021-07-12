package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class GymSuit {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String lostList = br.readLine();
		String reserveList = br.readLine();
		
		StringTokenizer lostStk = new StringTokenizer(lostList);
		StringTokenizer reserveStk = new StringTokenizer(reserveList);
		
		int lost[] = new int[lostStk.countTokens()];
		int reserve[] = new int [reserveStk.countTokens()];
		
		for(int i=0;i<lost.length;i++) {
			lost[i] = Integer.parseInt(lostStk.nextToken());
		}
		
		for(int i=0;i<reserve.length;i++) {
			reserve[i] = Integer.parseInt(reserveStk.nextToken());
		}		
		
		System.out.println(solution(n, lost, reserve));
		
		br.close();
	}
	
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        HashMap<Integer, Integer> resultMap = new HashMap<>();
        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();

        for(int a=0;a<lost.length;a++) {
        	lostList.add(lost[a]);
        }
        
        for(int b=0;b<reserve.length;b++) {
        	reserveList.add(reserve[b]);
        }
        
        for(int i=1;i<n+1;i++) {
        	if(reserveList.contains(i)) {
        		resultMap.put(i, 2);
        	} else{
        		resultMap.put(i, 1);
        	}
        	if(lostList.contains(i)) {
        		resultMap.put(i, resultMap.get(i)-1);
        	}
        } 
        
        Set<Entry<Integer, Integer>> entrySet = resultMap.entrySet();
        
        for(Entry<Integer, Integer> entryChk : entrySet) {
        	if(entryChk.getValue()==2) {
        		if(resultMap.get(entryChk.getKey()-1)!=null && resultMap.get(entryChk.getKey()-1)==0) {
        			resultMap.put(entryChk.getKey(), 1);
        			resultMap.put(entryChk.getKey()-1, 1);
        		} else if(resultMap.get(entryChk.getKey()+1)!=null && resultMap.get(entryChk.getKey()+1)==0) {
        			resultMap.put(entryChk.getKey(), 1);
        			resultMap.put(entryChk.getKey()+1, 1);
        		}
        	}
        }
        
        for(Entry<Integer, Integer> entryRlt : entrySet) {
        	System.out.println(entryRlt);
        	if(entryRlt.getValue()!=0) {
        		answer++;
        	}
        }
        return answer;
    }
}
