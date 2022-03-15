package study.level1;

public class Dart {

	public static void main(String[] args) {
		System.out.println(solution("0S10S10S"));
	}

	public static int solution(String dartResult) {
		int answer = 0;
		int idx = 0;
		int[] scores = new int[3];

		for (int i = 0; i < dartResult.length(); i++) {
			if(dartResult.charAt(i)=='1') {
				if(dartResult.charAt(i+1)=='0') {
					scores[idx]=10;
					i++;
				}else {
					scores[idx]=1;
				}
				continue;
			}
			switch (dartResult.charAt(i)) {
			case 'S':
				scores[idx] = scores[idx];
				idx++;
				break;
			case 'D':
				scores[idx] = (int) Math.pow(scores[idx], 2);
				idx++;
				break;
			case 'T':
				scores[idx] = (int) Math.pow(scores[idx], 3);
				idx++;
				break;
			case '*':
				if(idx>0) {
					scores[idx-1] *=2;
				}
				if(idx>1) {
					scores[idx-2] *=2;
				}
				break;
			case '#':
				idx--;
				scores[idx] = -scores[idx];
				idx++;
				break;
//			case '0':
//				scores[idx] = dartResult.charAt(i-1)=='1' ? 10 : 0;
//				break;
			default:
				scores[idx]=Character.getNumericValue(dartResult.charAt(i));
				
			}
		}

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			answer+=scores[i];
		}

		return answer;
	}
}
