package study.level1;

public class StrangeString {

	public static void main(String[] args) {

		solution("try hello world");
	}

	public static String solution(String s) {
		String answer = "";
		String ans[] = s.split(" ");

		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length(); j++) {
				char word = ans[i].charAt(j);
				if (j % 2 == 0) {
//					System.out.print(Character.toUpperCase(word));
					answer += Character.toUpperCase(word);
				} else {
//					System.out.print(Character.toLowerCase(word));
					answer += Character.toLowerCase(word);
				}
			}
//			System.out.print(" ");
			answer += (i == ans.length - 1) ? "" : " ";
		}

		System.out.println(answer);

		return answer;
	}
}
