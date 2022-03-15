package study.level1;

public class Remainder1 {

	public static void main(String[] args) {
		solution(12);
	}
	
	static public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<n; i++) {
        	if(n%i==1) {
        		answer=i;
        		break;
        	}else {
        		continue;
        	}
        }
        
        System.out.println(answer);
        return answer;
    }
}
