package study.level0;

import java.util.*;

public class s0_120896 {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        String answer = "";

        for(int i=0; i<s.length(); i++){
            if(s.substring(i+1).contains(s.charAt(i)+"")){
               s=s.replace(s.charAt(i)+""," ");
            }
        }
        s=s.replace(" ","");
        char[] cha = s.toCharArray();
        Arrays.sort(cha);
        for(char c:cha){
            answer += c;
        }
        return answer;
    }
}
