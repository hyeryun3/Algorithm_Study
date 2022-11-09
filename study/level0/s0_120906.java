package study.level0;

public class s0_120906 {
    public static void main(String[] args) {
        int n=1234;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int answer = 0;
        while(n>0){
            answer += n%10;
            n=n/10;
        }
        return answer;
    }
}
