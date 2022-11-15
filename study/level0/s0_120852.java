package study.level0;

import java.util.*;

public class s0_120852 {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(solution(n));
    }
    public static int[] solution(int n) {
        HashSet<Integer> set = new HashSet<>();
        int i = 2;
        while(n>=i){
            if(n%i==0){
                set.add(i);
                n=n/i;
            }else{
                i++;
            }
        }
        int[] answer = new int[set.size()];
        int size=0;
        TreeSet<Integer> ts = new TreeSet<>();
        ts.addAll(set);
        for(int a:ts){
            answer[size++]=a;
        }

        return answer;
    }
}
