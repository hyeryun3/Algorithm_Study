package study.level1;

public class Watermelon {

	public static void main(String[] args) {
		solution(10);
	}

	public static String solution(int n) {
		String answer = "";
		char[] ans = { '수', '박' };
		for (int i = 0; i < n; i++) {
			System.out.print(ans[i%2]);
			answer += ans[i%2];
		}

		return answer;
	}
}
