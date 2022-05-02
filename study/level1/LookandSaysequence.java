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
			System.out.println(ans[i]);
		}
		
		
		String answer = "11231121311222311231211122321121132131112131122131112112221131132112321321123121133112312112221131112113213212312113311223123112312112223211211321113113211221312111223111213112213111211223311321113112221131132112231231132112312211213112213111211223123113211231211131211121311121123212223111213112213111";
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
			answer+=cnt;

		}

		return answer;
	}
}
