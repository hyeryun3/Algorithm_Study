package study.level0;

public class s0_120890 {
    public static void main(String[] args) {
        int[] array = {7,3,10,28};
        int n= 5;
        System.out.println(solution(array,n));
    }
    public static int solution(int[] array, int n) {
        int answer = array[0];
        int temp = Math.abs(n - array[0]);
        for(int i=1; i<array.length; i++){
            if(Math.abs(n-array[i]) < temp){
                temp = Math.abs(n-array[i]);
                answer = array[i];
            }else if(Math.abs(n-array[i])==temp){
                answer = answer>array[i] ? array[i] : answer;
            }
        }
        return answer;
    }
}
