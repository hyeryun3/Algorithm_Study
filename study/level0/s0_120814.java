package study.level0;

public class s0_120814 {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        if(n<=7){
            answer = 1;
        }else if(n%7==0){
            answer = n/7;
        }else{
            answer = n/7+1;
        }
        return answer;
    }
}
