package study.level1;

public class TrinarydigitReverse {
	public static void main(String[] args) {
		solution(45);
	}
	
	public static int solution(int n) {
        int answer = 0;
        String ans = "";
        while(true) {
        	ans += n%3;
        	if(n<3) {
        		break;
        	}
        	n=n/3;
        }
        
        System.out.println(ans);
        
        answer=Integer.parseInt(ans,3); // 문자열넣고, 진법 넣으면 10진법으로 바꿔주네..?
        System.out.println(answer);
        return answer;
    }
}
