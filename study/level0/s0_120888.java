package study.level0;

public class s0_120888 {
    public static void main(String[] args) {
        String my_string = "people";
        System.out.println(solution(my_string));
    }
    public static String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if(!answer.contains(my_string.charAt(i)+""))
                answer += my_string.charAt(i);
        }
        return answer;
    }
}
