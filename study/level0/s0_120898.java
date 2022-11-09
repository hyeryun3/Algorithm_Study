package study.level0;

public class s0_120898 {
    public static void main(String[] args) {
        String message = "happy birthday!";
        System.out.println(solution(message));
    }
    public static int solution(String message) {
        int answer = message.length()*2;
        return answer;
    }
}
