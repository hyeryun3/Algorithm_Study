package study.level0;

public class s0_120843 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        int k=5;
        System.out.println(solution(numbers,k));
    }
    public static int solution(int[] numbers, int k) {
        int answer = 0;
        int temp = 2*k-2;
        if(numbers.length-1 < temp){
            temp = temp%numbers.length;
        }else{
            temp = 2*k-2;
        }
        answer = numbers[temp];

        return answer;
    }
}
