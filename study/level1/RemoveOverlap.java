package study.level1;

import java.util.ArrayList;

public class RemoveOverlap {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		solution(arr);
	}

	public static ArrayList<Integer> solution(int[] arr) {
		ArrayList<Integer> ans = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				ans.add(arr[i]);
				break;
			}
			if (arr[i] != arr[i + 1]) {
				ans.add(arr[i]);
			}
		}

		return ans;
	}
}
