package study.level0;

public class s0_120836 {
    public static void main(String[] args) {
        int n=20;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer++;
            }
        }
        return answer;
    }
}
