package study.level0;

public class s0_120808 {
    public static void main(String[] args) {
        int denum1=1,num1=2,denum2=3,num2=4;
        System.out.print(solution(denum1, num1, denum2, num2)[0] + " ");
        System.out.print(solution(denum1, num1, denum2, num2)[1]);
    }
    public static int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = {};
        int temp = denum1*num2 + denum2*num1;
        int temp2 = num1*num2;

        int gcd = gcd(temp,temp2);
        answer = new int[] {temp/gcd, temp2/gcd};
        return answer;
    }
    public static int gcd(int a,int b){
        if(a%b==0)
            return b;
        else
            return gcd(b,a%b);
    }
}
