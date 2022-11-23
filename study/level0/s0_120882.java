package study.level0;

import java.util.ArrayList;
import java.util.Collections;

public class s0_120882 {
    public static void main(String[] args) {
        int[][] score = {{1,2}, {1,1}, {1,1}};
        System.out.println(solution(score));
    }
    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        ArrayList<Float> avg = new ArrayList<>();
        for(int i=0; i<score.length; i++){
            avg.add((float)(score[i][0] + score[i][1] ) / 2);
        }
        Collections.sort(avg);
        Collections.reverse(avg);
        for(int i=0; i< answer.length; i++){
            answer[i] = avg.indexOf((float)(score[i][0] + score[i][1] ) / 2)+1;
        }

        return answer;
    }
}
