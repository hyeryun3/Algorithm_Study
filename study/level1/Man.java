package study.level1;

import java.util.Arrays;

public class Man {

	public static void main(String[] args) {
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		solution(participant,completion);
	}
	
	public static String solution(String[] participant, String[] completion) {

		String answer = "";

		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i=0; i<completion.length; i++) {
			if(!completion[i].equals(participant[i])) {
				return answer=participant[i];
			}
		}
		
		return participant[participant.length-1];
		
    }
}
