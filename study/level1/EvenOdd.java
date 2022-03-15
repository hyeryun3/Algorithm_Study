package study.level1;

public class EvenOdd {	//홀수 짝수

	public static void main(String[] args) {
		EvenOdd eo = new EvenOdd();
		System.out.println(eo.solution(3));
	}
	
	public String solution(int num) {
        return num%2==0?"Even":"Odd";
    }
}
