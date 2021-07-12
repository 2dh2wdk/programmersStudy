package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class MarathonerTest {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String b = br.readLine();
		
		StringTokenizer stkPart = new StringTokenizer(a);
		StringTokenizer stkCompletion = new StringTokenizer(b);
		
		String[] participant = new String[stkPart.countTokens()];
		String[] completion = new String[stkCompletion.countTokens()];
		
		for(int i=0;i<participant.length;i++) {
			participant[i] = stkPart.nextToken();
		}
		
		for(int i=0;i<completion.length;i++) {
			completion[i] = stkCompletion.nextToken();
		}
		System.out.println(solution(participant,completion));
		
		br.close();
	}
	
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		HashMap<Integer, String> listParticipant = new HashMap<Integer, String>();
		
		for(int i=0;i<participant.length;i++) {
			listParticipant.put(i, participant[i]);
			for(int j=0;j<completion.length;j++) {
				if(completion[j].equals(listParticipant.get(i))==true) {
					completion[j]="";
					listParticipant.remove(i);
					break;
				}
			}
		}
		
		Set<Entry<Integer, String>> entrySet = listParticipant.entrySet();
		
		for(Entry<Integer, String> entry : entrySet) {
			answer = entry.getValue();
		}
		
		
//		Iterator<Entry<Integer, String>> it = entrySet.iterator();
//		
//		while(it.hasNext()) {
//			Map.Entry<Integer, String> entry = it.next();
//			System.out.println(entry.getKey()+entry.getValue());
//		}
//		
		return answer;
	}

}
