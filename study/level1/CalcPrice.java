package study.level1;

public class CalcPrice {
	public static void main(String[] args) {
		solution(3,20,4);
	}

	static public long solution(int price, int money, int count) {
		long answer = -1;
		int cnt=1;
		long charge=0;
		
		for(int i=0; i<count; i++) {
			charge+=price*cnt;
			cnt++;
		}
		
		if(charge<=money){
            answer=0;
        }else{
            answer= Math.abs(money-charge);
        }
		return answer;
	}
}
