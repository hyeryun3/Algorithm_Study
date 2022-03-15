package study.level1;

public class SecretMap {

	public static void main(String[] args) {

		int n = 5;
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		solution(n, arr1, arr2);
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
        
        for(int i=0; i<n; i++) {
        	answer[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i]|arr2[i]));
        	answer[i] = answer[i].replaceAll("1", "#");
        	answer[i] = answer[i].replaceAll("0", " ");
        	System.out.println(answer[i]);
        }
        
        return answer;
    }
}
