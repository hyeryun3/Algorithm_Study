package study.level0;

public class s0_120839 {
    public static void main(String[] args) {
        String rsp = "205";
        System.out.println(solution(rsp));
    }
    public static String solution(String rsp) {
        String answer = "";
        for(int i=0; i<rsp.length(); i++){
            switch(Integer.parseInt(rsp.charAt(i)+"")) {
                case 2:
                    answer += 0;
                    break;
                case 0:
                    answer += 5;
                    break;
                case 5:
                    answer += 2;
                    break;
            }
        }
        return answer;
    }
}
