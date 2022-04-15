package study.level1;

public class SumMandP {
	public static void main(String[] args) {
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		solution(absolutes, signs);
	}
	
	public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0; i< signs.length; i++) {
        	if(signs[i]==false) {
        		absolutes[i] = -1*absolutes[i];
        	}
        	answer += absolutes[i];
        }
        return answer;
    }
}
