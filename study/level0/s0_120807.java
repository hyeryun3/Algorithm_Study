package study.level0;

public class s0_120807 {
    public static void main(String[] args) {
        int num1=2, num2=3;

        System.out.println(solution(num1,num2));
    }
    public static int solution(int num1, int num2) {
        int answer = 0;
        if(num1==num2)
            answer = 1;
        else
            answer = -1;
        return answer;
    }
}
