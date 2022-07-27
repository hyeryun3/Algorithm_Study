package study.level1;

public class Prac1 {

	public static void main(String[] args) {
		solution(2,5);
	}
	
	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=0; i<n; i++) {
        	answer[i] = (long)x*(i+1);
        }
        return answer;
    }
}
