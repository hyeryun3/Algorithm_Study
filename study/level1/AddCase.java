package study.level1;

import java.util.Arrays;
import java.util.HashSet;

public class AddCase {
	public static void main(String[] args) {
		int[] nums = { 0, 100, 1000, 10 };
		solution(nums);
	}

	public static int[] solution(int[] numbers) {
		HashSet<Integer> Hashlist = new HashSet<Integer>(); // 중복X

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				Hashlist.add(numbers[i] + numbers[j]);
			}
		}

		Integer[] ans = Hashlist.toArray(new Integer[0]);
		int answer[] = Arrays.stream(ans).mapToInt(Integer::intValue).toArray();
		Arrays.sort(answer);
		
		return answer;
	}
}
