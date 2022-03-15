package study.level1;

public class MiddleChar {
	public static void main(String[] args) {
		solution("abcd");
	}
	public static String solution(String s) {
        String answer = "";
        if(s.length()%2==1) {
        	answer=String.valueOf(s.charAt(s.length()/2));
        }else {
        	answer=String.valueOf(s.charAt(s.length()/2-1));
        	answer+=String.valueOf(s.charAt(s.length()/2));
        }
        return answer;
    }
}
