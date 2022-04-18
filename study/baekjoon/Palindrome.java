package study.baekjoon;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();

		char[] cha = str.toCharArray();

		int[] abc = new int[26];

		// 해당 알파벳의 갯수 구함
		for (int i = 0; i < cha.length; i++) {
			abc[cha[i] - 'A']++;
		}

		String start = "";
		String end = "";
		String mid = "";

		int cnt = 0;
		
		// 길이가 짝수면, 홀수값이 있으면 안됨.
		if (cha.length % 2 == 0) {
			for (int i = 0; i < abc.length; i++) {
				if (abc[i] % 2 != 0) {
					System.out.println("I'm Sorry Hansoo");
					return;
				}
				if (abc[i] != 0) {
		 			for (int j = 0; j < abc[i] / 2; j++) {
						start += (char) (i + 'A');
						end += (char) (i + 'A');
					}
				}
			}
			for (int i = end.length() - 1; i >= 0; i--) {
				start += end.charAt(i);
			}
		} else { // 길이가 홀수면, 하나는 홀수 나머지는 짝수개여야함.
			for (int i = 0; i < abc.length; i++) {
				if (abc[i] != 0) {
					for (int j = 0; j < abc[i] / 2; j++) {
						start += (char) (i + 'A');
						end += (char) (i + 'A');
					}
					if (abc[i] % 2 != 0) {
						cnt++;
		 				mid += (char) (i + 'A');
					}
				}
				if(cnt > 1) {
					System.out.println("I'm Sorry Hansoo");
					return;
				}
			}
			start +=mid;
			for (int j = end.length() - 1; j >= 0; j--) {
				start += end.charAt(j);
			}
		}
		System.out.println(start);
	}
}
