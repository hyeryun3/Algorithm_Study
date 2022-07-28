package study.level1;

import java.util.ArrayList;

public class Prac3 {
	public static void main(String[] args) {
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		solution(3, words);
	}
	
	public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int cnt = 1;
        ArrayList<String> word = new ArrayList<String>();
        word.add(words[0]);
        
        for(int i=1; i<words.length; i++) {
        	if(words[i].startsWith(String.valueOf(words[i-1].charAt(words[i-1].length()-1)))) { 
        		if(!word.contains(words[i])) {
        			word.add(words[i]);
        			cnt++;
        			if(cnt==words.length) {
        				answer[0] = 0;
        				answer[1] = 0;
        				break;
        			}
        		}else {
        			answer[0] = (cnt%n)+1;
            		answer[1] = (cnt/n)+1;
            		break;
        		}
        	}else {
        		answer[0] = (cnt%n)+1;
        		answer[1] = (cnt/n)+1;
        		break;
        	}
        	
        }
        
        
        return answer;
    }

}
