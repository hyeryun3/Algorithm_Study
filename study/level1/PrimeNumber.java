package study.level1;

public class PrimeNumber {
	public static void main(String[] args) {
		PrimeNumber pm = new PrimeNumber();
		pm.solution(10);
	}

	public int solution(int n) {
		int answer = 0;
		
		boolean check[] = new boolean[n+1];
	
		for(int i=2; i<=n; i++) {
			if(check[i]==true) {
				continue;
			}
			for(int j=2*i; j<=n; j+=i) {	//배수를 걸러
				check[j] = true;
			}
		}
		
		for(int i=2; i<=n; i++) {
			if(check[i]==false) {
				System.out.println("i" + i);
				answer++;
			}
		}
		
//		int cnt = 0;
//		for (int i = 2; i <= n; i++) {
//			for (int j = 1; j < i; j++) {
//				if (i % j == 0) {
//					cnt++;
//				}
//			}
//			if(cnt==1) {
//				answer++;
//			}
//			cnt=0;
//		}

		System.out.println(answer);
		return answer;
	}
}
