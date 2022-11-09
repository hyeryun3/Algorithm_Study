package study.level0;

public class s0_120819 {
    public static void main(String[] args) {
        int money = 15000;
        System.out.println(solution(money)[1]);
    }
    public static int[] solution(int money) {
        int[] answer = {};
        int cup = money/5500;
        int leftMoney = money%5500;

        answer = new int[] {cup,leftMoney};
        return answer;
    }
}
