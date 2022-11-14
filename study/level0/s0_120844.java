package study.level0;

public class s0_120844 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        String direction = "right";
        for(int a:solution(numbers,direction)){
            System.out.print(a+" ");
        }
        System.out.println(solution(numbers,direction));
    }
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        answer = new int[numbers.length];
        for(int i=0; i<numbers.length;i++){
            if(direction.equals("right")){
                if(i==numbers.length-1){
                    answer[0] = numbers[i];
                }else{
                    answer[i+1] = numbers[i];
                }
            }else{
                if(i==numbers.length-1){
                    answer[i] = numbers[0];
                }else{
                    answer[i] = numbers[i+1];
                }
            }
        }
        return answer;
    }
}
