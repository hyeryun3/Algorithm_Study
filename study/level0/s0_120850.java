package study.level0;

import java.util.ArrayList;
import java.util.Collections;

public class s0_120850 {
    public static void main(String[] args) {
        String my_string = "hi12392";
        System.out.println(solution(my_string)[0]);
    }
    public static int[] solution(String my_string) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)>47 && my_string.charAt(i)<58){
                arr.add(Integer.parseInt(my_string.charAt(i)+""));
            }
        }
        Collections.sort(arr);

        answer = new int[arr.size()];
        for(int i=0; i<arr.size();i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }

}
