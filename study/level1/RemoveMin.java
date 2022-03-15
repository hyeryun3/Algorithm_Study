package study.level1;

import java.util.ArrayList;

public class RemoveMin {

	public static void main(String[] args) {
		RemoveMin ad = new RemoveMin();
		int[] arr = { 4, 3, 1, 2, 5 };
		System.out.println(ad.solution(arr)[0]);
		System.out.println(ad.solution(arr)[1]);
		System.out.println(ad.solution(arr)[2]);
		System.out.println(ad.solution(arr)[3]);
	}

	public int[] solution(int[] arr) {

		ArrayList<Integer> list = new ArrayList<>();

		if (arr.length == 1) {
			int[] answer = { -1 };
			return answer;
		} else {
			int[] answer = new int[arr.length - 1];

			for (int i = 0; i < arr.length; i++) {
				list.add(arr[i]);
			}

			int min = list.get(0);
			for (int i = 0; i < list.size(); i++) {
				min = (min > list.get(i)) ? list.get(i) : min;
			}

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).equals(min)) {
					list.remove(i);
				}
			}

			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}

			return answer;
		}

	}

	/*
	 * public int[] solution(int[] arr) { int[] answer = {}; int temp = 0; for (int
	 * i = 0; i < arr.length; i++) { for (int j = 0; j < i; j++) { if (arr[i] >
	 * arr[j]) { temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; } } }
	 * 
	 * if (arr.length == 1) { arr[0]=-1; answer = Arrays.copyOf(arr, arr.length); }
	 * else { answer = Arrays.copyOf(arr, arr.length - 1); } return answer; }
	 */
}
