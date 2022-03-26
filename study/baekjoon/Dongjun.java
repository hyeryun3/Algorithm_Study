package study.baekjoon;

import java.util.Scanner;

public class Dongjun {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int levNum = scan.nextInt(); // 레벨의 수
		int score[] = new int[levNum];
		int cnt=0;
		for(int i=0; i<levNum; i++) {
			score[i] = scan.nextInt();
		}
		
		for(int i=levNum-1; i>0; i--) {
			if(score[i] <= score[i-1]) {
				while(true) {
					cnt++;
					score[i-1]--;
					if(score[i] > score[i-1]) {
						break;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}


