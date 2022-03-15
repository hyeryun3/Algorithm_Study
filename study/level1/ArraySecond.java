package study.level1;

public class ArraySecond {

	public static void main(String[] args) {

		int[][] arr1 = { { 1, 2 }, { 2, 3 } };
		int[][] arr2 = { { 3, 4 }, { 5, 6 } };
 
		ArraySecond as = new ArraySecond();
		as.solution(arr1, arr2);
		System.out.println();

	}

	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];
		System.out.print("[");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				answer[i][j] = (arr1[i][j] + arr2[i][j]);
				System.out.print("[" + answer[i][j] + "]");
			}
			if (i < arr1.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("]");

		return answer;
	}
}
