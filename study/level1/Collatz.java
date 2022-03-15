package study.level1;

public class Collatz {

	public static void main(String[] args) {
		Collatz col = new Collatz();
		System.out.println(col.solution(3));
	}

	public int solution(long num) {
		int answer = 0;
		boolean flag = false;

		if (num == 1) {
			return 0;
		} else {
			while (!flag) {

				if (num % 2 == 0) {
					num /= 2;
					answer++;
					if (num == 1) {
						flag = true;
					}
				} else {
					num = (num * 3) + 1;
					answer++;
				}

				if (answer == 500 && num != 1) {
					return -1;
				}
			}
			return answer;
		}
	}
}
