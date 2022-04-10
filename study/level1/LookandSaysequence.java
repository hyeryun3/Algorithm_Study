package study.level1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LookandSaysequence {

	static String[] ans;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("몇 번째 항? ");
		int num = scan.nextInt();

		ans = new String[num];
		ans[0] = "1";

		for (int i = 1; i < num; i++) {
			ans[i] = test(ans[i - 1]);
		}
		System.out.println(ans[num - 1]);
	}

	public static String test(String str) {
		String answer = "";

		int cnt = 1;
		char[] anschar = str.toCharArray();

		answer = String.valueOf(anschar[0]);
		Queue<Character> que = new LinkedList<Character>();

		for (int i = 0; i < str.length(); i++) {
			que.add(anschar[i]);
		}

		if (str.length() == 1) {
			answer += cnt;
		}
		char temp = que.poll();

		while (!que.isEmpty()) {
			if (temp == que.peek()) {
				cnt++;
				temp = que.poll();
				if (que.isEmpty()) {
					answer += cnt;
					cnt = 1;
				}else if( temp != que.peek()) {
					answer+=cnt;
					temp=que.poll();
					answer+=temp;
					cnt = 1;
				}
			} else {
				answer+=cnt;
				temp = que.poll();
				answer+=temp;
				if(que.isEmpty()) {
					answer+=cnt;
				}
			}

		}

		/*
		 * if (str.length() == 1) { answer += cnt; } else { for (int i = 0; i <
		 * str.length() - 1; i++) { if(anschar[i]==anschar[i+1]) { cnt++; answer+=cnt;
		 * }else { answer += cnt + String.valueOf(anschar[i+1]); cnt=1; answer +=cnt; }
		 * } }
		 */
		return answer;
	}
}
