package study.level0;

public class s0_120892 {
    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        System.out.println(solution(cipher,code));
    }
    public static String solution(String cipher, int code) {
        String answer = "";
        for(int i=code-1; i<cipher.length(); i=i+code){
            answer += cipher.charAt(i);
        }
        return answer;
    }
}
