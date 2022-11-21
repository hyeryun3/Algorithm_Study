package study.level0;

public class s0_120871 {
    public static void main(String[] args) {
        int n=15;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int answer = n;
        for(int i=1;i<=answer;i++){
            if((i+"").contains("3") || (i%3==0)){
                System.out.println("걸려라!");
                answer++;
            }
            System.out.println(i + " : " + answer);
        }
        return answer;
    }
}
