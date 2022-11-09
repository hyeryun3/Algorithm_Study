package study.level0;

public class s0_120854 {
    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world!"};
        System.out.println(solution(strlist)[0]);
    }
    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i=0; i< strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
