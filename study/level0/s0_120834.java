package study.level0;

public class s0_120834 {
    public static void main(String[] args) {
        int age = 23;
        System.out.println(solution(age));
    }
    public static String solution(int age) {
        String answer = "";
        String[] resAge = {"a","b","c","d","e","f","g","h","i","j"};
        String ageStr = String.valueOf(age);
        for(int i=0; i<ageStr.length(); i++){
            answer += resAge[Integer.parseInt(ageStr.charAt(i)+"")];
        }
        return answer;
    }
}
