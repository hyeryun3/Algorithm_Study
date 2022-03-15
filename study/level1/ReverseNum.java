package study.level1;

public class ReverseNum {

	public static void main(String[] args) {
		solution(8934567892l);
	}
	public static int[] solution(long n) {
        int[] answer = new int[(int)(Math.log10(n)+1)];
        
        for(int i=0; i<answer.length; i++) {
        	answer[i] = (int)(n%10);
        	n /= 10;
        }
        
        return answer;
    }
	
	public static int[] solution1(long n) {
		char[] str = String.valueOf(n).toCharArray();
		int[] answer = new int[str.length];
		char temp = ' ';
		
		
		for(int i=0; i<str.length/2; i++){
			temp = str[i];
			str[i] = str[(str.length-1)-i]; 
			str[(str.length-1)-i] = temp;
		}
		
		
		for(int i=0; i<str.length;i++) {
			answer[i] = Character.getNumericValue(str[i]);
		}
		
		return answer;
	}
}
