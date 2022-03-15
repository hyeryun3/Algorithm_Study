package study.level1;

public class CaesarCipher {

	public static void main(String[] args) {
		System.out.println(solution("z", 1));
//		
	}

	public static String solution(String s, int n) {
		String answer = "";
		char[] temp = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			temp[i] = s.charAt(i);
			if(temp[i]!=' ') {
				for (int j=0; j<n; j++) {
					temp[i]+=1;
					if((temp[i]>90 && temp[i]<97)||temp[i]>122) {
						temp[i]-=26;
					}
				}
			}
			answer+=temp[i];
		}
		return answer;
	}
}
