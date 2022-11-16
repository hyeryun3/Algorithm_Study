package study.level0;

public class s0_120861 {
    public static void main(String[] args) {
        String[] keyinput = {"down", "down", "down", "down", "down"};
        int[] board = {7,9};
        solution(keyinput,board);
    }
    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        for(int i=0; i<keyinput.length; i++){
            switch(keyinput[i]){
                case "left":
                    if(answer[0] > -board[0]/2 && answer[0] <= board[0]/2)
                        answer[0] -= 1;
                    break;
                case "right":
                    if(answer[0] >= -board[0]/2 && answer[0] < board[0]/2)
                        answer[0] += 1;
                    break;
                case "up":
                    if(answer[1] >= -board[1]/2 && answer[1] < board[1]/2)
                        answer[1] += 1;
                    break;
                case "down":
                    if(answer[1] > -board[1]/2 && answer[1] <= board[1]/2)
                        answer[1] -= 1;
                    break;
            }
        }

        System.out.print(answer[0]+ " ");
        System.out.println(answer[1]);
/*
        for(int i=0; i<answer.length; i++){
            if(Math.abs(answer[i])>board[i]/2){
                answer[i] = answer[i]>0? board[i]/2:-1*board[i]/2;
            }
        }*/

        return answer;
    }
}
