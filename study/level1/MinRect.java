package study.level1;

public class MinRect {
	public static void main(String[] args) {
		int[][] sizes = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
		int[][] sizes2 = { { 10, 7 }, { 12, 3 }, { 8, 15 }, { 14, 7 }, { 5, 15 } };
		int[][] sizes3 = { { 14, 4 }, { 19, 6 }, { 6, 16 }, { 18, 7 }, { 7, 11 } };
		solution(sizes);
	}
	
	
	public static int solution(int[][] sizes) {
		
		int temp=0;
		for(int i=0; i<sizes.length; i++) {
			if(sizes[i][0] < sizes[i][1]) {
				temp=sizes[i][1];
				sizes[i][1]=sizes[i][0];
				sizes[i][0]=temp;
			}
		}
		
		int max=sizes[0][0];
		int max1=sizes[0][1];
		for(int i=0; i<sizes.length; i++) {
			if(max<sizes[i][0]) {
				max=sizes[i][0];
			}
			if(max1<sizes[i][1]) {
				max1=sizes[i][1];
			}
		}
		
		return max*max1;
	}
	
}
