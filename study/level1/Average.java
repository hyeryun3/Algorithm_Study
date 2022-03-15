package study.level1;

public class Average {

	public static void main(String[] args) {
		Average avg = new Average();
		int arr[] = {1,2,3,4};
		avg.solution(arr);
		
	}
	
	public double solution(int[] arr) {
        double answer = 0;
        int sum=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            cnt++;
        }
        answer=(double)sum/cnt;
        
        System.out.println(answer);
        return answer;
    }
}
