package study.level0;

public class s0_120816 {
    public static void main(String[] args) {
        int slice=7,n=10;
        System.out.println(solution(slice,n));
    }
    public static int solution(int slice, int n) {
        int answer = (int)Math.ceil((double) n/(double) slice);
        return answer;
    }
}
