package com.programmers.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;

public class ProgrammerPreference {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(br.readLine(), ",");
		String[] table = new String[stk.countTokens()];

		for(int i=0;i<table.length;i++) table[i] = stk.nextToken();
		
		stk = new StringTokenizer(br.readLine());
		String[] languages = new String[stk.countTokens()];
		for(int i=0;i<languages.length;i++) languages[i] = stk.nextToken();
		
		stk = new StringTokenizer(br.readLine());
		int[] preference = new int[languages.length];
		for(int i=0;i<preference.length;i++) preference[i] = Integer.parseInt(stk.nextToken());
		
		System.out.println(solution(table, languages, preference));
		
		br.close();
	}
	
	public static String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
//        HashMap<String, Integer> preferenceMap = new HashMap<>();
        StringTokenizer stk;

    	String maxName="";
    	int maxNum = 0;
    	
        for(int i=0;i<table.length;i++) {
        	stk = new StringTokenizer(table[i]);
        	List<String> chkList = new ArrayList<>();
        	
        	String chkName = stk.nextToken();
        	for(int j=0;j<5;j++) {
        		chkList.add(j, stk.nextToken());
        	}

//        	preferenceMap.put(chkList.get(0), 0);
        	int chkNum = 0;
        	for(int k=0;k<languages.length;k++) {
        		if(chkList.indexOf(languages[k])!=-1) {
        			chkNum=chkNum+(5-chkList.indexOf(languages[k]))*preference[k];
        		}
        	}
        	if(chkNum>maxNum) {
        		maxName = chkName;
        		maxNum = chkNum;
        	} else if(chkNum==maxNum && maxName.compareTo(chkName)>0) {
        		maxName = chkName;
        	}
//        	preferenceMap.put(chkList.get(0), chkNum);
        }
        
//        for(Object chkAnswer : preferenceMap.keySet()) {
//        	if(preferenceMap.get(chkAnswer).equals(Collections.max(preferenceMap.values()))) {
//        		answer = chkAnswer.toString();
//        		break;
//        	}
//        }
        answer = maxName;
        
        return answer;
    }
}
