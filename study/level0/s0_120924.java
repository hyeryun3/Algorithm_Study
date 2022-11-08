package study.level0;

public class s0_120924 {
    public static void main(String[] args) {
        int[] common1 = {1,2,3,4};
        int[] common2 = {2,4,8};
        System.out.println(solution(common1));
    }

    public static int solution(int[] common) {
        int answer = 0;

        if(common[0]-common[1] == common[1]-common[2]){
            answer = common[common.length-1] + (common[1]-common[0]);
        }else{
            answer = common[common.length-1] * (common[1]/common[0]);
        }
        return answer;
    }
}
