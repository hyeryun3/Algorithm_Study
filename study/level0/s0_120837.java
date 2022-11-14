package study.level0;

public class s0_120837 {
    public static void main(String[] args) {
        int hp = 999;
        System.out.println(solution(hp));
    }
    public static int solution(int hp) {
        int answer = 0;
        int x=5,y=3,z=1;

        answer += hp/x;
        hp=hp%x;
        answer += hp/y;
        hp=hp%y;
        answer += hp;
        return answer;
    }
}
