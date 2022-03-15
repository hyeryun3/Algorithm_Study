package study.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class ProjectTeams {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int team = scan.nextInt();	// 팀 수

		int stdno = 2 * team;		// 총 학생 수 (학생2명이 1팀이니까)
		long stdw[] = new long[stdno];	// 각 학생의 코딩역량 _4

		for (int i = 0; i < stdno; i++) {
			stdw[i] = scan.nextInt();		// 학생들의 역량 입력
		}
		
		Arrays.sort(stdw);				// 정렬. 제일낮은학생 + 제일 높은학생 순차적으로 팀을 만들기 위해

		long teamw[] = new long[team];	// 팀별 역량
		for (int i = 0; i < team; i++) {
			teamw[i] = stdw[i]+stdw[stdno-1-i];
		}
		Arrays.sort(teamw);
		
		
		System.out.println(teamw[0]);  
	}

}
