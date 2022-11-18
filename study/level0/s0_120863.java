package study.level0;

public class s0_120863 {
    public static void main(String[] args) {
        String polynomial = "x";
        System.out.println(solution(polynomial));
    }
    public static String solution(String polynomial) {
        String answer = "";
        String[] poly = polynomial.split(" ");
        int sumX = 0;
        int sum = 0;

        for(int i=0; i< poly.length; i++){
            if(poly[i].equals("x")){
                poly[i]="1x";
            }
            if(poly[i].contains("x")){
                sumX += Integer.parseInt(poly[i].substring(0,poly[i].length()-1));
            }else if(poly[i].charAt(0)>47){
                sum += Integer.parseInt(poly[i]);
            }
        }

        if(sum !=0 ){
            if(sumX == 1){
                answer += "x + " + sum;
            }else if(sumX ==0){
                answer = sum+"";
            }else {
                answer += sumX + "x + " + sum;
            }
        }else{
            if(sumX == 1){
                answer += "x";
            }else if(sumX == 0){
                answer = "0";
            }else{
                answer += sumX + "x";
            }
        }
        return answer;
    }
}
