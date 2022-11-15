package study.level0;

public class s0_120864 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        System.out.println(solution(my_string));
    }
    public static int solution(String my_string) {
        int answer = 0;
        for(int i=0; i<my_string.length();i++){
            if(my_string.charAt(i)>=65){
                my_string=my_string.replace(my_string.charAt(i)+""," ");
            }
        }
        String[] ans = my_string.split(" ");
        for(int i=0; i<ans.length; i++){
            if(!ans[i].equals(""))
                answer += Integer.parseInt(ans[i]);
        }
        return answer;
    }
}
