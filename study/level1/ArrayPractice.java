package study.level1;

public class ArrayPractice {
	public static void main(String[] args) {
		ArrayPractice ap = new ArrayPractice();
		ap.solution(-4, 2);
	}
 
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		
		for (long i = 0; i < n; i++) {
			answer[(int) i] = x * (i + 1);
			System.out.print(answer[(int) i] + " ");
		}
		return answer;
	}
}
