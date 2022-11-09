package study.level0;

public class s0_120822 {
    public static void main(String[] args) {
        String my_string = "jaron";
        System.out.println(solution(my_string));
    }
    public static String solution(String my_string) {
        String answer = "";
        for(int i=my_string.length()-1; i>=0; i--){
            answer += my_string.charAt(i);
        }
        return answer;
    }
}
