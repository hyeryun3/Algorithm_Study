package study.level0;

public class s0_120895 {
    public static void main(String[] args) {
        String my_string = "hello";
        int num1=1, num2=2;
        System.out.println(solution(my_string,num1,num2));
    }
    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        char temp = ' ';
        temp = my_string.charAt(num1);
        for(int i=0; i<my_string.length(); i++){
            if(i==num1){
                answer += my_string.charAt(num2);
            }else if(i==num2) {
                answer += my_string.charAt(num1);
            }else{
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}
