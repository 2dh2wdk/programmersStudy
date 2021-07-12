package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class LottoTest {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String lotNumIn = br.readLine();
		String winNumIn = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer stkLot = new StringTokenizer(lotNumIn);		
		StringTokenizer stkWin = new StringTokenizer(winNumIn);
		
		int lottos[] = new int[stkLot.countTokens()];
		int win_nums[] = new int[stkWin.countTokens()];
		
		for(int i=0;i<6;i++) {
			lottos[i] = Integer.parseInt(stkLot.nextToken());
			win_nums[i] = Integer.parseInt(stkWin.nextToken());
		}
		
		for(int j=0;j<2;j++) {
			sb.append(solution(lottos, win_nums)[j]);
			sb.append(" ");
		}
		
		System.out.println(sb);
		
		br.close();
	}
	
	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = {};
		
		int topRank;
		int lowRank;
		
		int correct = 0;
		int cnt = 0;
		
//		HashMap<Integer, Boolean> map = new HashMap<>();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i : lottos) {
			if(i != 0) {
				list.add(i);
//				map.put(i, true);
			} else {
				cnt++;
			}
		}
		
		for(int j : win_nums) {
			if(list.contains(j)) {
//			if(map.containsKey(j)) {
				correct++;
			}
		}
		
//		for(int i=0;i<6;i++) {
//			if(lottos[i] != 0) {
//				for(int j=0;j<6;j++) {
//					if(lottos[i]==win_nums[j]) {
//						correct++;
//					}
//				}
//			} else {
//				cnt++;
//			}
//		}
		
		topRank = chkRank(correct+cnt);
		lowRank = chkRank(correct);
		
		answer = new int[] {topRank, lowRank};
		
		return answer;
	}
	
	public static int chkRank(int correctCnt) {
		int result;
		switch(correctCnt) {
		case 6 : result = 1; break;
		case 5 : result = 2; break;
		case 4 : result = 3; break;
		case 3 : result = 4; break;
		case 2 : result = 5; break;
		default : result = 6;
	}
		
		return result;
	}

}
