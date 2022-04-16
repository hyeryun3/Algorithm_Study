package study.level1;

public class MakePrimeNum {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		solution(nums);
	}
	public static int solution(int[] nums) {
        int answer = 0;
        int ans = 0;
        
        int cnt = 0;
        for(int i=0; i<nums.length; i++) {
        	for(int j=i+1; j<nums.length; j++) {
        		for(int k=j+1; k<nums.length; k++) {
        			ans= nums[i] + nums[j] + nums[k];
        			for(int p = 2; p<ans; p++) {
        				if(ans % p == 0) {
        					cnt++;
        					break;
        				}
        			}
        			if(cnt==0) {
        				answer++;
        			}
        			cnt=0;
        		}
        	}
        }
        
        return answer;
    }
	
}
