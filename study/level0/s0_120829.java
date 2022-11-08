package study.level0;

public class s0_120829 {
    public static void main(String[] args) {
        int angle = 180;
        System.out.println(solution(angle));
    }
    public static int solution(int angle) {
        int answer = 0;

        if(angle<90){
            answer = 1;
        }else if(angle==90){
            answer = 2;
        }else if(angle<180){
            answer = 3;
        }else if(angle==180){
            answer = 4;
        }

        return answer;
    }
}
