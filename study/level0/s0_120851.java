package study.level0;

public class s0_120851 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        System.out.println(solution(my_string));
    }
    public static int solution(String my_string) {
        int answer = 0;
        for(int i=0; i<my_string.length(); i++){
            if( my_string.charAt(i) < 65){
                answer += Integer.parseInt(my_string.charAt(i)+"");
            }
        }
        return answer;
    }
}
