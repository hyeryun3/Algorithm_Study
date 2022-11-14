package study.level0;

public class s0_120904 {
    public static void main(String[] args) {
        int num=232443, k=5;
        System.out.println(solution(num,k));
    }
    public static int solution(int num, int k) {
        int answer = 0;
        String numS = String.valueOf(num);
        answer = numS.indexOf(String.valueOf(k)) == -1 ? -1 : numS.indexOf(String.valueOf(k))+1;
        return answer;
    }
}
