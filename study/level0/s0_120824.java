package study.level0;

public class s0_120824 {
    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5};
        System.out.println(solution(num_list)[0]);
        System.out.println(solution(num_list)[1]);
    }

    public static int[] solution(int[] num_list) {
        int[] answer = {};
        int tmp=0,tmp2=0;
        for(int i=0; i< num_list.length; i++){
            if(num_list[i]%2==0){
                tmp++;
            }else{
                tmp2++;
            }
        }
        answer= new int[] {tmp,tmp2};
        return answer;
    }
}
