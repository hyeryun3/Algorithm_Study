package study.level0;

public class s0_120909 {
    public static void main(String[] args) {
        int n = 976;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int answer = 0;
        answer = Math.sqrt(n) % 1==0 ? 1 : 2;
        return answer;
    }
}
