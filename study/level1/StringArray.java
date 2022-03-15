package study.level1;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		String[] str = { "azxtab", "xxteeg", "abxasdf", "acxaaaa" };
		solution(str, 2);
	}

	public static String[] solution(String[] strings, int n) {
		String temp = "";

		Arrays.sort(strings);

		for (int i = 1; i < strings.length; i++) {
			for (int j = 0; j < strings.length - i; j++) {
				if (strings[j].charAt(n) > strings[j + 1].charAt(n)) {
					temp = strings[j];
					strings[j] = strings[j+1];
					strings[j+1] = temp;
				}
			}
		}

		return strings;
	}
}
