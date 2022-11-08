package study.level0;

public class s0_120830 {
    public static void main(String[] args) {
        int n=10, k=3;
        System.out.println(solution(n,k));
    }
    public static int solution(int n, int k) {
        int answer = 0;
        k-=n/10;
        answer = 12000*n + 2000*k;
        return answer;
    }
}
