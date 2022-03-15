package study.level1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayNumDivisor {

	public static void main(String[] args) {
		int[] arr = { 5, 9, 7, 10 };
		solution(arr, 5);
	}

	public static ArrayList<Integer> solution(int[] arr, int divisor) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				answer.add(arr[i]);
				cnt++;
			}
		}
		if (cnt == 0) {
			answer.add(-1);
		}

		Collections.sort(answer);
		
		return answer;
	}
}
