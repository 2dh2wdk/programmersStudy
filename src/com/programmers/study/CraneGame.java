package com.programmers.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CraneGame {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int[][] board;
		int[] moves;
		
		String readBoard = br.readLine();
		StringTokenizer stkBoardY = new StringTokenizer(readBoard);
		String[] boardY = new String[stkBoardY.countTokens()];
		
		board = new int[boardY.length][];
		
		for(int i=0;i<boardY.length;i++) {
			boardY[i] = stkBoardY.nextToken();
			StringTokenizer stkBoardX = new StringTokenizer(boardY[i], ",");
			board[i] = new int[stkBoardX.countTokens()];
			for(int j=0;j<board[i].length;j++) {
				board[i][j] = Integer.parseInt(stkBoardX.nextToken());
			}
		}
		
		String readMoves = br.readLine();
		StringTokenizer stkMoves = new StringTokenizer(readMoves, ",");
		
		moves = new int[stkMoves.countTokens()];
		
		for(int i=0;i<moves.length;i++) {
			moves[i] = Integer.parseInt(stkMoves.nextToken());
		}
		
		solution(board, moves);
		
		br.close();
	}
	
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int idx = 0;
        List<Integer> list = new ArrayList<>();
        
//        for(int i=0;i<board.length;i++) {
//        	for(int j=0;j<board[i].length;j++) {
//        		System.out.print(board[i][j]);
//        	}
//        	System.out.println();
//        }
        for(int i=0;i<moves.length;i++) {
        	for(int j=0;j<board.length;j++) {
        		if(board[j][moves[i]-1]!=0) {
        			if(list.size()!=0) {
        				if(list.get(idx-1)!=board[j][moves[i]-1]) {
        					list.add(board[j][moves[i]-1]);
        					idx++;
        				} else {
        					list.remove(idx-1);
        					answer+=2;
        					idx--;
        				}
        			} else {
        				list.add(board[j][moves[i]-1]);
        				idx++;
        			}
    				board[j][moves[i]-1] = 0;
        			break;
        		}
        	}
        }
        return answer;
    }

}
