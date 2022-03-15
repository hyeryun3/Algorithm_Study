package study.level1;

public class StringPY {
	public static void main(String[] args) {
		solution("Pyy");
	}
	static boolean solution(String s) {
        boolean answer = true;
        int cnt =0;
        int cnt2 =0;
        
        s=s.toLowerCase();
        char s2[] = s.toCharArray();
        
        for(int i=0;i<s2.length;i++) {
        	if(s2[i]=='p') {
        		cnt++;
        	}else if(s2[i]=='y') {
        		cnt2++;
        	}
        }

        if(cnt!=cnt2) {
        	answer = false;
        }
        System.out.println(answer);

        return answer;
    }
}
