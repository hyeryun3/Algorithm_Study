package study.level0;

import java.util.Arrays;

public class s0_120886 {
    public static void main(String[] args) {
        String before="aa", after="aa";
        System.out.println(solution(before,after));
    }
    public static int solution(String before, String after) {
        int answer = 0;
        char[] bef = before.toCharArray();
        char[] aft = after.toCharArray();
        Arrays.sort(bef);
        Arrays.sort(aft);

        int cnt=0;
        for(int i=0; i<bef.length; i++){
            if(bef[i] == aft[i]){
                cnt++;
            }else{
                break;
            }
        }
        answer = cnt==before.length() ? 1 : 0;
        return answer;
    }
}
