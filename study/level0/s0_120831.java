package study.level0;

public class s0_120831 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        for(int i=0; i<=n; i=i+2){
            answer += i;
        }
        return answer;
    }
}
