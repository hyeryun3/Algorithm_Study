package study.level0;

public class s0_120826 {
    public static void main(String[] args) {
        String my_string = "abcdef";
        String letter = "f";
        System.out.println(solution(my_string,letter));
    }
    public static String solution(String my_string, String letter) {
        String answer = my_string.replace(letter,"");
        return answer;
    }
}
