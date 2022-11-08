package study.level0;

public class s0_120810 {
    public static void main(String[] args) {
        int num1=3, num2=2;
        System.out.println(solution(num1,num2));
    }

    public static int solution(int num1, int num2) {
        int answer = num1%num2;
        return answer;
    }
}
