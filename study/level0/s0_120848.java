package study.level0;

public class s0_120848 {
    public static void main(String[] args) {
        int n= 7;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int answer = 0;
        int temp = 1;
        for(int i=1; i<=10; i++){
            temp *= i;
            if(temp==n){
                answer = i;
                break;
            }else if(temp>n){
                answer = i-1;
                break;
            }
        }
        return answer;
    }
}
