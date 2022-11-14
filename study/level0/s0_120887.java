package study.level0;

public class s0_120887 {
    public static void main(String[] args) {
        int i=1,j=13,k=1;
        System.out.println(solution(i,j,k));
    }
    public static int solution(int i, int j, int k) {
        int answer = 0;
        for(int q=i; q<=j; q++){
            if(String.valueOf(q).contains(String.valueOf(k))){
                for(int w=0; w<String.valueOf(q).length(); w++){
                    if((String.valueOf(q).charAt(w)+"").equals(String.valueOf(k))){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
