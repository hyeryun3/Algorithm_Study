package study.level0;

public class s0_120868 {
    public static void main(String[] args) {
        int[] sides = {11,7};
        System.out.println(solution(sides));
    }
    public static int solution(int[] sides) {
        int answer = 0;
        int temp = sides[0];
        if(temp < sides[1]){
            for(int i=1; i<=sides[1]; i++){
                if(temp + i > sides[1]){
                    answer++;
                }
            }
            for(int i=sides[1]+1; i<sides[0]+sides[1]; i++){
                answer++;
            }
        }else{
            temp = sides[1];
            for(int i=1; i<=sides[0]; i++){
                if(temp + i > sides[0]){
                    answer++;
                }
            }
            for(int i=sides[0]+1; i<sides[0]+sides[1]; i++){
                answer++;
            }
        }

        return answer;
    }
}
