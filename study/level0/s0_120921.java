package study.level0;

public class s0_120921 {
    public static void main(String[] args) {
        String A = "hello"; //
        String B = "ohell"; //
        System.out.println(solution(A,B));
    }
    public static int solution(String A, String B) {
        int answer = 0;
        String temp = A;

        // 순방향
        for(int i=0; i<A.length(); i++){
            if(temp.equals(B)){
                break;
            }
            temp = temp.substring(temp.length()-1)+temp.substring(0,temp.length()-1);
            answer++;
        }

        if(answer == A.length()){
            return -1;
        }
        // 역방향
//        if(answer==A.length()){
//            answer=0;
//            for(int i=0; i<A.length(); i++){
//                if(temp.equals(B)){
//                    break;
//                }
//                temp = temp.substring(1)+temp.substring(0,1);
//                System.out.println(temp);
//                answer--;
//            }
//        }
        return answer;
    }
}
