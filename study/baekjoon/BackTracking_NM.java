package study.baekjoon;

import java.util.Scanner;

public class BackTracking_NM {
	public static boolean[] check; // 중복체크
	public static int[] arr; // 저장
	public static int n,m;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n= scan.nextInt();
		m =scan.nextInt();
		// depth = m
		arr= new int[m];
		check= new boolean[n];
		
		backtracking(0);
	}

	public static void backtracking(int depth) {
		if(depth==m) {
			for(int i=0; i<m; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=0; i<n; i++) {
			if(!check[i]) {
				check[i] = true;
				System.out.println("check["+i+"]="+check[i]);
				arr[depth] = i+1;
				System.out.println("arr["+depth+"]="+(i+1));
				backtracking(depth+1);
				check[i]=false;
				System.out.println("check["+i+"]="+check[i]);
			}
		}
	}
}
