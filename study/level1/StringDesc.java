package study.level1;

public class StringDesc {

	public static void main(String[] args) {
		solution("Zbcdefg");
	}
	
	public static String solution(String s) {
        String answer = "";
        char[] str = s.toCharArray();

        for(int i=0; i<str.length; i++) {
        	for(int j=0; j<i; j++) {
        		if(str[j]<str[i]) {
        			char temp = str[j];
        			str[j] = str[i];
        			str[i] = temp;
        		}
        	}
        }
        
        for(int i=0; i<str.length;i++) {
        	answer+=str[i];
        }
        
        System.out.println(answer);
        return answer;
    }
}
