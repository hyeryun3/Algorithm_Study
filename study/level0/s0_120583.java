package study.level0;

public class s0_120583 {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,4,5};
        int n = 1;
        System.out.println(solution(array,n));
    }

    public static int solution(int[] array, int n) {
        int answer = 0;
        for(int i=0; i<array.length; i++){
            if(array[i]==n){
                answer++;
            }
        }
        return answer;
    }
}
