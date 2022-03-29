package study.baekjoon;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		int changes[] = {500,100,50,10,5,1};
		int answer=0;
		int money = scan.nextInt();
		money = 1000-money;
		
		for(int x:changes) {
			answer += money/x;
			money%=x;
		}
		
		System.out.println(answer);
		
	}
}
