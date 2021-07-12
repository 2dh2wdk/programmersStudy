package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class MarathonerTest2 {

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
		
		List<String> participantList = new ArrayList<String>();
		List<String> completionList = new ArrayList<String>();
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		/* String[]->List 변환 */
		participantList = Arrays.asList(participant);
		completionList = Arrays.asList(completion);
		
//		ArrayList<String> participantList = new ArrayList<>();
//		ArrayList<String> completionList = new ArrayList<>();
		
		/* String[]->ArrayList 변환 */
//		Collections.addAll(participantList, participant);
//		Collections.addAll(completionList, completion);

//		participantList.sort(null);
//		completionList.sort(null);
		
//		List<String> participantList = (List<String>) Arrays.asList(participant).stream().sorted();
//		List<String> completionList = (List<String>) Arrays.asList(completion).stream().sorted();
		
		for(int i=0;i<participantList.size()-1;i++) {
//			int idx = -1;
//			for(int j=0;j<completionList.size();j++) {
				if(participantList.get(i).equals(completionList.get(i))==false) {
//					completionList.set(j, "");
//					idx=i;
					answer = participantList.get(i);
					break;
//				}
			}
//			if(idx==-1) {
//				answer=participantList.get(i);
//				break;
//			}
		}
		if(answer=="") {
			answer=participantList.get(participantList.size()-1);
		}
		
		return answer;
	}

}
