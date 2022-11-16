package study.level0;

public class s0_120902 {
    public static void main(String[] args) {
        String my_string = "3 + 4 + 1 - 1";
        System.out.println(solution(my_string));
    }
    public static int solution(String my_string) {
        String[] ms = my_string.split(" ");
        int answer = Integer.parseInt(ms[0]);
        for(int i=1; i<ms.length; i=i+2){
            if(ms[i].equals("+")){
                answer += Integer.parseInt(ms[i+1]);
            }else if(ms[i].equals("-")){
                answer -= Integer.parseInt(ms[i+1]);
            }
        }
        return answer;
    }
}
