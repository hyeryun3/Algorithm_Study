package study.level0;

import java.util.ArrayList;

public class s0_120905 {
    public static void main(String[] args) {
        int n = 3;
        int[] numlist = {4,5,6,7,8,9,10,11,12};
        System.out.println(solution(n,numlist));
    }
    public static int[] solution(int n, int[] numlist) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n == 0){
                arr.add(numlist[i]);
            }
        }
        int size = 0;
        answer = new int[arr.size()];
        for(int a: arr){
            answer[size++] = a;
        }
        return answer;
    }
}
