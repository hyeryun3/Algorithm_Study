package study.level0;

public class s0_120821 {
    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5};
        System.out.println(solution(num_list)[0]);
    }
    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[num_list.length-1-i];
        }
        return answer;
    }
}
