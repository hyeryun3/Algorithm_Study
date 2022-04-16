package study.level1;

public class MakePrimeNum {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		solution(nums);
	}
	public static int solution(int[] nums) {
        int answer = -1;

        int cnt = 0;
        for(int i=0; i<3; i++) {
        	for(int j=i+1; j<3; j++) {
        		for(int k=i+2; k<3; k++) {
        			answer= nums[i] + nums[j] + nums[k];
        			
        			for(int p = 2; p<answer; p++) {
        				if(answer % p == 0) {
        					cnt++;
        				}
        			}
        		}
        	}
        }
        
        System.out.println(cnt);
        return cnt;
    }
	
}
