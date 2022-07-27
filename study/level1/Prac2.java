package study.level1;

public class Prac2 {
	public static void main(String[] args) {
		String s = "one4seveneight";
		solution(s);
	}

	public static int solution(String s) {
		String temp = "";
		String ans = "";
		int answer = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65) {
				temp += s.charAt(i);
				switch (temp) {
				case "zero":
					ans += '0';
					temp = "";
					break;
				case "one":
					ans += '1';
					temp = "";
					break;
				case "two":
					ans += '2';
					temp = "";
					break;
				case "three":
					ans += '3';
					temp = "";
					break;
				case "four":
					ans += '4';
					temp = "";
					break;
				case "five":
					ans += '5';
					temp = "";
					break;
				case "six":
					ans += '6';
					temp = "";
					break;
				case "seven":
					ans += '7';
					temp = "";
					break;
				case "eight":
					ans += '8';
					temp = "";
					break;
				case "nine":
					ans += '9';
					temp = "";
					break;
				}
			}else {
				ans+=s.charAt(i);
			}
		}
		answer = Integer.parseInt(ans);
		System.out.println(answer);
		return answer;
	}
}
