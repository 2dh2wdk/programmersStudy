package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class StringSort {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(br.readLine(),",");
		String[] strings = new String[stk.countTokens()];
		
		for(int i=0;i<strings.length;i++) {
			strings[i] = stk.nextToken();
		}
		int n = Integer.parseInt(br.readLine());
		for(int j=0;j<solution(strings, n).length;j++) {
			System.out.println(solution(strings, n)[j]);
		}
		solution(strings, n);
		br.close();
	}
	
	public static String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];
		List<String> stringsList = Arrays.asList(strings);
		List<Character> chk = new ArrayList<>();
		List<String> removeList = new ArrayList<>();
		
		for(int i=0;i<stringsList.size();i++) {
			chk.add(stringsList.get(i).charAt(n));
		}
		
		stringsList.sort(null);
		chk.sort(null);
		int idx = 0;
		for(int j=0;j<chk.size();j++) {
			for(int k=0;k<stringsList.size();k++) {
				if(chk.get(j)==stringsList.get(k).charAt(n) && removeList.contains(stringsList.get(k))==false) {
					answer[idx] = stringsList.get(k);
					idx++;
					removeList.add(stringsList.get(k));
				}
			}
		}
		
        return answer;
    }
}
