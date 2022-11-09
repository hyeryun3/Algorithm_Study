package study.level0;

public class s0_120849 {
    public static void main(String[] args) {
        String my_string = "bus";
        System.out.println(solution(my_string));
    }
    public static String solution(String my_string) {
        String answer = "";
        String[] tmp = {"a","e","i","o","u"};
        for(int i=0; i<tmp.length; i++){
            my_string = my_string.replace(tmp[i],"");
        }
        answer=my_string;
        return answer;
    }
}
