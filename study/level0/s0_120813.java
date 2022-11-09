package study.level0;

import java.util.ArrayList;

public class s0_120813 {
    public static void main(String[] args) {
        int n=10;
        System.out.println(solution(n));
    }
    public static int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1; i<=n; i=i+2){
            ans.add(i);
        }
        answer = new int[ans.size()];
        for(int i=0; i<ans.size();i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }
}
