package study.baekjoon;

import java.util.Scanner;

public class Padovan {
	static long[] padovan;
	
	public static long pado(int N) {
		if(padovan[N] == -1) {
			padovan[N] = padovan[N-2] + padovan[N-3];
		}
		return padovan[N];
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int N[] = new int[num];
		for(int i=0; i<num; i++) {
			N[i] = scan.nextInt();
		}

		padovan = new long[100+1];
		
		for(int i=0; i<num; i++) {
			for(int j=0; j< N[i]; j++) {
				padovan[j] = -1;
			}
			
			padovan[0]=1;
			padovan[1]=1;
			padovan[2]=1;
			
			for(int j=3; j<N[i]; j++) {
				pado(j);
			}
			System.out.println(pado(N[i]-1));
		}
		
	}
	
	
}
