package study.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Rope {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int answer = 0;
		int k = scan.nextInt();	// 로프 갯수
		int w[] = new int[k];	// 각 로프에 달 수 있는 최대중량
		for(int i=0; i<k; i++) {
			w[i] = scan.nextInt();
		}
		
		Arrays.sort(w);
		int cnt=0;
		for(int i=w.length-1; i>=0; i--) {
			cnt++;
			if(answer<w[i]*cnt) {
				answer = w[i]*cnt;
			}
		}
		
		System.out.println(answer);
	}
}
