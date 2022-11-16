package study.level0;

import java.util.ArrayList;

public class s0_120853 {
    public static void main(String[] args) {
        String s="1 1 Z Z";
        System.out.println(solution(s));
    }
    public static int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");

        ArrayList<String> arr = new ArrayList<>();
        for(String st:str){
            arr.add(st);
        }

        for(int i=0; i<arr.size(); i++){
            if(arr.get(i).equals("Z") && arr.get(i-1).charAt(0) <= 57){
                arr.remove(i);
                arr.remove(i-1);
                i=0;
            }else if(arr.get(i).equals("Z")){
                arr.remove(i);
            }
        }

        for(String ans: arr){
            answer+= Integer.parseInt(ans);
        }
        return answer;
    }
}
