package study.level1;

public class NumberCardGame {
	public static void main(String[] args) {
		String s = "one4seveneight";
		solution(s);
	}
	
	public static int solution(String s) {
		
		String[] word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		for(int i=0; i<word.length; i++) {
			if(s.contains(word[i])) {
				System.out.println("i");
				s = s.replace(word[i], i+"");
			}
		}
		
		System.out.println(s);
		
        return Integer.parseInt(s);
    }
	

}
