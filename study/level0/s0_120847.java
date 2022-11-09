package study.level0;

public class s0_120847 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(solution(numbers));
    }
    public static int solution(int[] numbers) {
        int answer = 0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j< numbers.length; j++){
                answer = answer > numbers[i] * numbers[j] ? answer : numbers[i] * numbers[j];
            }
        }
        return answer;
    }
}
