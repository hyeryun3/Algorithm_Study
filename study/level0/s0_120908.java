package study.level0;

public class s0_120908 {
    public static void main(String[] args) {
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        System.out.println(solution(str1,str2));
    }
    public static int solution(String str1, String str2) {
        int answer = str1.contains(str2)==true? 1: 2;
        return answer;
    }
}
