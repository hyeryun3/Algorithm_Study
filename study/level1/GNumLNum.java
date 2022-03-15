package study.level1;

public class GNumLNum {
	public static void main(String[] args) {
		GNumLNum gl = new GNumLNum();
		System.out.println("[" + gl.solution(3, 12)[0] +", "+ gl.solution(3, 12)[1] + "]");
	}
	public int[] solution(int n, int m) {
		int[] answer = {0,0};
		int i = 1;
		while (n >= i && m >= i) {
			if (n % i == 0 && m % i == 0) {
				answer[0] = i;
			}
			i++;
		}
		answer[1] = (n * m)/ answer[0];	//최소 공배수 = 두 수의 곱 / 최대 공약수
		
		return answer;
		
	}
}
