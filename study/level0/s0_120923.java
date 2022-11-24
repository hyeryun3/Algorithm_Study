package study.level0;

public class s0_120923 {
    public static void main(String[] args) {
        int num = 3;
        int total =12;
        System.out.println(solution(num,total));
    }
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];

        int mid = total/num;
        if(num%2==0){
            for(int i=num/2-1; i<num; i++){
                answer[i] = mid++;
            }
            mid = total/num;
            for(int i=num/2-1-1; i>=0; i--){
                answer[i] = --mid;
            }
        }else{
            for(int i=num/2; i<num; i++){
                answer[i] = mid++;
            }
            mid = total/num;
            for(int i=num/2-1; i>=0; i--){
                answer[i] = --mid;
            }
        }


        for(int a: answer){
            System.out.println(a);
        }
        return answer;
    }
}
