package study.level1;

public class SumofAliquot {

	public static void main(String[] args) {
		solution(12);
	}

	public static int solution(int n) {
		int answer = 0;

		for (int i = 1; i < n + 1; i++) {
			if (n % i == 0) {
				answer += i;
			}
		}
		System.out.println(answer);
		return answer;
	}
}
