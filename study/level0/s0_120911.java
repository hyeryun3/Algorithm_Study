package study.level0;

import java.util.Arrays;

public class s0_120911 {
    public static void main(String[] args) {
        String my_string = "Bcad";
        System.out.println(solution(my_string));
    }
    public static String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        char[] arr = new char[my_string.length()];
        for(int i=0; i<my_string.length(); i++){
            arr[i] = my_string.charAt(i);
        }
        Arrays.sort(arr);
        for(char a:arr){
            answer += a;
        }
        return answer;
    }
}
