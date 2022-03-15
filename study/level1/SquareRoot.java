package study.level1;

public class SquareRoot {

	public static void main(String[] args) {
		System.out.println(solution(121));
	}

	public static long solution(long n) {
		long answer = 0;
		long num = (long) Math.sqrt(n); // 제곱근

		answer = (n == (long) (Math.pow(num, 2))) ? (long) (Math.pow((num + 1), 2)) : -1;

		return answer;
	}
}
