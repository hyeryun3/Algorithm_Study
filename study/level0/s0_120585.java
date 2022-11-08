package study.level0;

import java.util.Arrays;

public class s0_120585 {
    public static void main(String[] args) {
        int[] array = {149, 180, 192, 170};
        int height = 167;
        System.out.println(solution(array,height));
    }
    public static int solution(int[] array, int height) {
        int answer = 0;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            if(array[i] > height){
                answer++;
            }
        }
        return answer;
    }
}
