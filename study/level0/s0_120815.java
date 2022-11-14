package study.level0;

public class s0_120815 {
    public static void main(String[] args) {
        int n=4;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int answer = 0;
        int cnt=0;
        while(true){
            cnt++;
            if((n*cnt)%6==0){
                answer = (n*cnt)/6;
                break;
            }
        }
        return answer;
    }
}
