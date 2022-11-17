package study.level0;

public class s0_120860 {
    public static void main(String[] args) {
        int[][] dots = {{1,2},{2,1},{2,2},{1,2}};
        System.out.println(solution(dots));
    }
    public static int solution(int[][] dots) {
        int answer = 0;
        int minX = dots[0][0], maxX=minX;
        int minY = dots[0][1], maxY=minY;
        for(int i=0; i<dots.length; i++){
            minX = dots[i][0] < minX ? dots[i][0] : minX;
            maxX = dots[i][0] > maxX ? dots[i][0] : maxX;
            minY = dots[i][1] < minY ? dots[i][1] : minY;
            maxY = dots[i][1] > maxY ? dots[i][1] : maxY;
        }
        answer = (maxX-minX) * (maxY-minY);

        return answer;
    }
}

