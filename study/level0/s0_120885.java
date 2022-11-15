package study.level0;

public class s0_120885 {
    public static void main(String[] args) {
        String bin1 = "10", bin2 = "11";
        System.out.println(solution(bin1,bin2));
    }
    public static String solution(String bin1, String bin2) {
        String answer = "";
        int bin1I= Integer.parseInt(bin1,2);
        int bin2I= Integer.parseInt(bin2,2);
        answer = Integer.toBinaryString(bin1I+bin2I);

        return answer;
    }
}
