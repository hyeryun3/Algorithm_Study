package study.level2;

public class NumExpression {
	public static void main(String[] args) {
		System.out.println(solution(15));
		
	}
	public static int solution(int n) {
        int answer = 0;
        int temp=0;
         
        for(int i=1; i<=n; i++) {
        	for(int j=i;j<=n; j++) {
        		temp +=j;
        		if(temp == n ) {
        			answer++;
        			temp=0;
        			break;
        		}
        		if(temp > 15) {
        			temp=0;
        			break;
        		}
        		
        	}
        }
        
        return answer;
    }
}
