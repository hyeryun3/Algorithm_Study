package study.level1;

import java.util.Arrays;
import java.util.Comparator;

public class OrderbyDesc {

	public static void main(String[] args) {
		System.out.println(solution(7985423615l));
	}

	public static long solution(long n) {
		long answer = 0;
		char[] str = String.valueOf(n).toCharArray();
		Long[] num = new Long[str.length];

		for (int i = 0; i < str.length; i++) {
			num[i] = (long) Character.getNumericValue(str[i]);
		}

		Arrays.sort(num, Comparator.reverseOrder());

		for (int i = 0; i < num.length; i++) {
			answer += num[i] * ((long) Math.pow(10, num.length - (i + 1)));
		}

		return answer;
	}

	public static long solution3(long n) {
		long answer = 0;
		Long[] num = new Long[(int) Math.log10(n) + 1];

		for (int i = 0; i < num.length; i++) {
			num[i] = n % 10;
			n /= 10;
//			System.out.println("num[" + i + "] = " + num[i]);
		}

		Arrays.sort(num, Comparator.reverseOrder());

		for (int i = 0; i < num.length; i++) {
			answer += num[i] * ((long) Math.pow(10, num.length - (i + 1)));
		}

		return answer;
	}

	public static long solution2(long n) {
		long answer = 0;
		long temp = 0;
		long[] num = new long[(int) Math.log10(n) + 1];

		for (int i = 0; i < num.length; i++) {
			num[i] = n % 10;
			n /= 10;
//			System.out.println("num[" + i + "] = " + num[i]);
		}

		for (int i = 0; i < num.length; i++) { // sort
			for (int j = 0; j < i; j++) {
				if (num[j] < num[i]) {
					temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			answer += num[i] * ((long) Math.pow(10, num.length - (i + 1)));
		}

		return answer;
	}

	public static long solution1(long n) {

		long answer = 0;
		char[] str = String.valueOf(n).toCharArray();
		int[] num = new int[str.length];
		String nums = "";
		int temp = 0;

		for (int i = 0; i < str.length; i++) {
			num[i] = Character.getNumericValue(str[i]);
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < i; j++) {
				if (num[j] < num[i]) {
					temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			nums += Integer.valueOf(num[i]);
		}

		answer = Integer.parseInt(nums);

		return answer;
	}
}