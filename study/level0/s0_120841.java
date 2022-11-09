package study.level0;

public class s0_120841 {
    public static void main(String[] args) {
        int[] dot = {2,4};
        System.out.println(solution(dot));
    }
    public static int solution(int[] dot) {
        int answer = 0;
        if(dot[0]>0){
            if(dot[1]>0){
                answer = 1;
            }else{
                answer = 4;
            }
        }else{
            if(dot[1]>0){
                answer = 2;
            }else{
                answer = 3;
            }
        }
        return answer;
    }
}
