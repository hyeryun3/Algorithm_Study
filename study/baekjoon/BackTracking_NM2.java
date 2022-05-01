package study.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class BackTracking_NM2 {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static int[] arr;
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
 
		int n= Integer.parseInt(st.nextToken());
		int m= Integer.parseInt(st.nextToken());
 
		arr = new int[m];
        
		backtracking(n,m,0);
		
		br.close();
		
		bw.flush();
		bw.close();
	}
 
	public static void backtracking(int n, int m, int depth) throws IOException {
		if (depth == m) {
			for (int i = 0; i < m; i++) {
				bw.write(String.valueOf(arr[i] + " "));
			}
			bw.newLine();
			return;
		}
 
		for (int i = 1; i <= n; i++) {
			arr[depth] = i;
			backtracking(n,m,depth + 1);
		}

	}
 
}