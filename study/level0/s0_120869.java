package study.level0;

import java.util.Arrays;

public class s0_120869 {
    public static void main(String[] args) {
        String[] spell = {"z","d","x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};
        System.out.println(solution(spell,dic));
    }
    public static int solution(String[] spell, String[] dic) {
        int answer = 0;
        Arrays.sort(spell);
        String temp = "", temp2="";
        for(String s:spell){
            temp+=s;
        }

        for(int i=0; i<dic.length; i++){
            String[] temps = dic[i].split("");
            Arrays.sort(temps);
            for(String s:temps){
                temp2+=s;
            }
            if(temp.equals(temp2)){
                answer++;
            }
            temp2="";
        }
        return answer>0?1:2;
    }
}
