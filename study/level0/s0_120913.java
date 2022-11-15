package study.level0;

public class s0_120913 {
    public static void main(String[] args) {
        String my_str = "abc1Addfggg4556b";
        int n=3;
        System.out.println(solution(my_str,n));
    }
    public static String[] solution(String my_str, int n) {
        int len = my_str.length()%n==0 ? my_str.length()/n : my_str.length()/n+1;
        String[] answer = new String[len];
        int size=0;
        for(int i=0; i<my_str.length(); i=i+n){
            answer[size] = my_str.substring(i,i+n);
            size++;
            if(size==len-1){
                answer[size] = my_str.substring(i+n);
                break;
            }
        }

        for(String s : answer){
            System.out.println(s);
        }
        return answer;
    }
}
