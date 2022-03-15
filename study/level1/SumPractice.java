package study.level1;

public class SumPractice {

	public static void main(String[] args) {
		solution(98765432);
	}
	public static int solution(int n) {
		int length=(int)Math.log10(n)+1;
//		System.out.println(length);
        int answer = n%10;
        for(int i=0; i<length; i++){
        	System.out.println("ans : " + answer);
        	n /= 10;
        	answer += n%10;
        	System.out.println("n : " + n);
        }
        System.out.println(answer);
        return answer;
    }
}
