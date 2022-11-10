package study.level0;

public class s0_120910 {
    public static void main(String[] args) {
        int n=7, t=15;
        System.out.println(solution(n,t));
    }
    public static int solution(int n, int t) {
        int answer = 0;
        for(int i=0; i<t; i++){
            n *= 2;
        }
        answer = n;
        return answer;
    }
}
