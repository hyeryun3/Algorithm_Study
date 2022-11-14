package study.level0;

import java.util.ArrayList;

public class s0_120897 {
    public static void main(String[] args) {
        int n= 24;
        System.out.println(solution(n));
    }
    public static int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        int size = 0;
        answer = new int[arr.size()];
        for(int a:arr){
            answer[size++] = a;
        }
        return answer;
    }

}
