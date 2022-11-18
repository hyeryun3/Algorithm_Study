package study.level0;

public class s0_120866 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 1}, {0, 1, 0, 1, 0}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 1, 0, 0, 0}};
        System.out.println(solution(board));
    }
    public static int solution(int[][] board) {
        int answer = 0;
        int[][] bb = new int[board.length][board[0].length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                try{
                    if(board[i][j] == 1){
                        if(i==0){
                            if(j==0){
                                bb[i][j]=1;
                                bb[i+1][j]=1;
                                bb[i][j+1]=1;
                                bb[i+1][j+1]=1;
                            }else if(j==board[i].length-1){
                                bb[i][j]=1;
                                bb[i+1][j]=1;
                                bb[i][j-1]=1;
                                bb[i+1][j-1]=1;
                            }else{
                                bb[i][j]=1;
                                bb[i+1][j]=1;
                                bb[i][j+1]=1;
                                bb[i][j-1]=1;
                                bb[i+1][j-1]=1;
                                bb[i+1][j+1]=1;
                            }
                        }else if(i==board.length-1){
                            if(j==0){
                                bb[i][j]=1;
                                bb[i-1][j]=1;
                                bb[i][j+1]=1;
                                bb[i-1][j+1]=1;
                            }else if(j==board[i].length-1){
                                bb[i][j]=1;
                                bb[i-1][j]=1;
                                bb[i][j-1]=1;
                                bb[i-1][j-1]=1;
                            }else{
                                bb[i][j]=1;
                                bb[i-1][j]=1;
                                bb[i][j+1]=1;
                                bb[i][j-1]=1;
                                bb[i-1][j-1]=1;
                                bb[i-1][j+1]=1;
                            }
                        }else{
                            if(j==0){
                                bb[i][j]=1;
                                bb[i-1][j]=1;
                                bb[i][j+1]=1;
                                bb[i-1][j+1]=1;
                                bb[i+1][j]=1;
                                bb[i+1][j+1]=1;
                            }else if(j==board[i].length-1){
                                bb[i-1][j-1]=1;
                                bb[i-1][j]=1;
                                bb[i][j-1]=1;
                                bb[i][j]=1;
                                bb[i+1][j-1]=1;
                                bb[i+1][j]=1;
                            }else{
                                bb[i-1][j-1]=1;
                                bb[i-1][j]=1;
                                bb[i][j-1]=1;
                                bb[i][j]=1;
                                bb[i+1][j-1]=1;
                                bb[i+1][j]=1;
                                bb[i-1][j+1]=1;
                                bb[i][j+1]=1;
                                bb[i+1][j+1]=1;
                            }
                        }
                    }
                }catch (Exception e){
                    System.out.print("i: " + i+ "    ");
                    System.out.println("j: " + j);
                    continue;
                }
            }
        }
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(bb[i][j]==0){
                    answer++;
                }
            }
        }

        return answer;
    }
}
