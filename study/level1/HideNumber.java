package study.level1;

public class HideNumber {

	public static void main(String[] args) {
		HideNumber hm = new HideNumber();
		hm.solution("027778888");
		
	}
	 public String solution(String phone_number) {
	        String answer = "";
	        
	        for(int i=0; i<phone_number.length()-4;i++) {
	        	answer += "*";
	        }
	        answer += phone_number.substring(phone_number.length()-4,phone_number.length());
	        System.out.println(answer);
	         
	        return answer;
	    }
}
