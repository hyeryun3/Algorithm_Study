package study.level0;

public class s0_120912 {
    public static void main(String[] args) {
        int[] array = {7,77,17};
        System.out.println(solution(array));
    }
    public static int solution(int[] array) {
        int answer = 0;
        for(int i=0; i<array.length; i++){
            if(String.valueOf(array[i]).contains("7")){
                for(int j=0; j<String.valueOf(array[i]).length();j++){
                    if(String.valueOf(array[i]).charAt(j)=='7'){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
