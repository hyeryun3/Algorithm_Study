package study.baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Virus {

	static int[][] arr; // 번호 쌍
	static boolean[] visited; // 방문체크
	static int computer,network,v; // 컴퓨터/ 연결선 쌍 / 시작점
	
	public static int bfs(int n) {
		Queue<Integer> que = new LinkedList<Integer>();
		int cnt=0;
		que.offer(n);
		visited[n]=true;
		while(!que.isEmpty()) {
			int temp = que.poll();
			
			for(int j=1; j<=computer; j++) {
				if(arr[temp][j] == 1 && visited[j]==false) {
					que.offer(j);
					visited[j]=true;
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		computer = scan.nextInt();
		network = scan.nextInt();
		int start=1;
		arr = new int[computer+1][computer+1];
		visited= new boolean[computer+1];
		
		for(int i=0; i<network; i++) {
			int a=scan.nextInt();
			int b= scan.nextInt();
			arr[a][b] = arr[b][a]=1;
		}
		System.out.println(bfs(start));
	}
}
