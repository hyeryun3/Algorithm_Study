package study.level0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class s0_120835 {
    public static void main(String[] args) {
        int[] emergency = {3,76,24};
        System.out.println(solution(emergency));
    }
    public static int[] solution(int[] emergency) {
        int[] answer = emergency.clone();

        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(answer);

        for(int i=0; i<emergency.length; i++){
            map.put(answer[i],emergency.length-i);
        }

        for(int i=0; i<emergency.length; i++){
            answer[i] = map.get(emergency[i]);
        }

        return answer;
    }
}
