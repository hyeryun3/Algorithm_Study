package study.level0;

public class s0_120891 {
    public static void main(String[] args) {
        int order = 29423;
        System.out.println(solution(order));
    }
    public static int solution(int order) {
        int answer = 0;
        String orderS = String.valueOf(order);
        for(int i=0; i<orderS.length(); i++){
            if(orderS.charAt(i) == '3' || orderS.charAt(i) == '6' || orderS.charAt(i) == '9')
                answer++;
        }
        return answer;
    }
}
