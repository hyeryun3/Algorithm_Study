package study.level1;

public class SumNoNum {
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		solution(numbers);
	}
	public static int solution(int[] numbers) {
        int sum=0;
        for(int i=0; i<numbers.length; i++) {
        	sum+=numbers[i];
        }
        
        sum=45-sum;
		
        return sum;
    }
}
