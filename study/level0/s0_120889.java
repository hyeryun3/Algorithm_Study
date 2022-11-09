package study.level0;

import java.util.ArrayList;
import java.util.Collections;

public class s0_120889 {
    public static void main(String[] args) {
        int[] sides = {3,6,2};
        System.out.println(solution(sides));
    }
    public static int solution(int[] sides) {
        int answer = 0;
        ArrayList<Integer> side = new ArrayList<>();
        for(int data:sides){
            side.add(data);
        }
        int max = Collections.max(side);
        side.remove(side.indexOf(max));
        int sum=0;
        for(int tmp:side){
            sum+=tmp;
        }

        if(sum>max){
            answer=1;
        }else{
            answer=2;
        }
        return answer;
    }
}
