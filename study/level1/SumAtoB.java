package study.level1;

public class SumAtoB {

	public static void main(String[] args) {
		System.out.println(solution(3,5));
		System.out.println(solution(5,3));
	}
	public static long solution(int a, int b) {
        long answer = 0;
        if(a<b){
            for(long i=a; i<=b; i++){
                answer += i;
            }
        }else{
            for(long i=b; i<=a; i++){
                answer +=i;
            }
        }
        return answer;
    }
}
