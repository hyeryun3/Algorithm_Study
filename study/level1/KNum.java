package study.level1;

import java.util.ArrayList;
import java.util.Collections;

public class KNum {

	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},
							{4,4,1},
							{1,7,3}
		};
		solution(array,commands);
	}
	
	public static int[] solution(int[] array, int[][] commands) {
		int answer[] = new int[commands.length];
		ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0; i<commands.length; i++) {
        	for(int j=commands[i][0]-1; j<commands[i][1]; j++) {
        		ans.add(array[j]);
        	}
        	Collections.sort(ans);
        	answer[i]=ans.get(commands[i][2]-1);
        	ans.clear();
        }
        
        return answer;
    }
}
