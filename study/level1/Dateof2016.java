package study.level1;

public class Dateof2016 {

	public static void main(String[] args) {
		solution(12,31);
	}
	
	public static String solution(int a, int b) {
        String answer = "";
        String[] date = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] lastdays= {31,29,31,30,31,30,31,31,30,31,30,31};
        
        int sum=0;
        for(int i=0; i<a-1; i++) {
        	sum+=lastdays[i];
        }
        
        switch((sum+b)%7) {
        case 0: answer=date[4]; break; 
        case 1: answer=date[5]; break;
        case 2: answer=date[6]; break;
        case 3: answer=date[0]; break;
        case 4: answer=date[1]; break;
        case 5: answer=date[2]; break;
        default : answer=date[3]; break;
        	
        }
        if(a>12 || b>lastdays[a-1]) {
        	answer="";
        }
        return answer;
    }
}
