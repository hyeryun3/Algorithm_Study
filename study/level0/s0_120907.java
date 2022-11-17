package study.level0;

public class s0_120907 {
    public static void main(String[] args) {
        String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        System.out.println(solution(quiz));
    }
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] temp = {};
        int res = 0;
        for(int i=0; i<quiz.length; i++){
            temp = quiz[i].split(" ");
            if(temp[1].equals("+")){
                res = Integer.parseInt(temp[0]) + Integer.parseInt(temp[2]);
            }else if(temp[1].equals("-")){
                res = Integer.parseInt(temp[0]) - Integer.parseInt(temp[2]);
            }
            answer[i] = Integer.parseInt(temp[4]) == res ? "O" : "X";
        }
        for(String a:answer){
            System.out.println(a);
        }

        return answer;
    }
}
