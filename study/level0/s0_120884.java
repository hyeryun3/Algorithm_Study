package study.level0;

public class s0_120884 {
    public static void main(String[] args) {
        int chicken = 1081;
        System.out.println(solution(chicken));
    }
    public static int solution(int chicken) {
        int answer = 0;
        while(chicken>9){
            answer += chicken/10;
            chicken = chicken%10 + chicken/10;
        }
        return answer;
    }
}