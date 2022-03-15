package study.level1;

public class SeoulKim {
	public static void main(String[] args) {
		String[] seoul = {"Jane","Kim"};
		solution(seoul);
	}

	public static String solution(String[] seoul) {
		String answer = "";
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + String.valueOf(i) + "에 있다";
			}
		}
		return answer;
	}
}
