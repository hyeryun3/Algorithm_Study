package study.level0;

public class s0_120899 {
    public static void main(String[] args) {
        int[] array = {1,8,3};
        System.out.println(solution(array)[1]);
    }
    public static int[] solution(int[] array) {
        int[] answer = {};
        int max = 0;
        int idx = 0;
        for(int i=0; i<array.length; i++){
            if(max < array[i]){
                max = array[i];
                idx = i;
            }
        }
        answer = new int[] {max,idx};
        return answer;
    }
}
