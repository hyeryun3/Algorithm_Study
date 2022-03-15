package study.level1;

public class HashadNumber {

	public static void main(String[] args) {
		HashadNumber hm = new HashadNumber();
		hm.solution(13);

//		int len = Integer.toString(x).length();
 
	}
 
	public boolean solution(int x) {
		boolean answer = true;

		int len = (int) (Math.log10(x) + 1);
		int sum = 0;
		int temp = x;
		
		//자릿수 더하기
		for (int i = 0; i < len; i++) {
			sum += temp % 10;
			temp /= 10;
		}
		
		//결과
		if (x % sum != 0) {
			answer = false;
		}

		System.out.println(answer);
		return answer;

	}
}
