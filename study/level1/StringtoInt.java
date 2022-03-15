package study.level1;

public class StringtoInt {
	public static void main(String[] args) {
		System.out.println(solution1("-3625"));
	}

	public static int solution1(String s) {
		int answer = 0;

		answer = Integer.parseInt(s);
		
		return answer;
	}
	
	public static int solution(String s) {
		int answer = 0;
		
		if(s.charAt(0) != '-' && s.charAt(0) !='+') {
			for(int i=0; i<s.length(); i++) {
				answer += Character.getNumericValue(s.charAt(i)) * Math.pow(10, s.length() - 1 - i);
			}
		}
		else if(s.charAt(0) == '-') {
			for(int i=1; i<s.length(); i++) {
				answer += Character.getNumericValue(s.charAt(i)) * Math.pow(10, s.length() - 1 - i);
			}
			answer *= -1;
		}else if(s.charAt(0) == '+') {
			for(int i=1; i<s.length(); i++) {
				answer += Character.getNumericValue(s.charAt(i)) * Math.pow(10, s.length() - 1 - i);
			}
		}
		
		return answer;
	}
}
