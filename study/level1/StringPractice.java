package study.level1;

public class StringPractice {

	public static void main(String[] args) {
		solution("122a");
	}

	public static boolean solution(String s) {
		boolean answer = true;

		if (s.length() == 4 || s.length() == 6) {
			for (int i = 0; i < s.length(); i++) {
				if (!Character.isDigit(s.charAt(i))) {
					System.out.println("i" + i);
					answer = false;
					break;
				}
			}
		} else {
			answer = false;
		}
		
		
		System.out.println(answer);
		return answer;
	}
}

//			answer = s.matches("[+-]?\\d*(\\.\\d+)?");