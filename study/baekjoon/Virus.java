package study.baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Virus {

	static int[][] arr; //인접행렬
	static boolean[] visited; // 방문체크
	static int computer,network; // 컴퓨터/ 연결선 쌍
	
	public static int bfs(int start) {
		Queue<Integer> que = new LinkedList<Integer>();
		int cnt=0; // 연결된 컴퓨터 수
		que.offer(start);
		visited[start]=true;
		while(!que.isEmpty()) {
			int temp = que.poll();
			
			for(int j=1; j<=computer; j++) {
				if(arr[temp][j] == 1 && visited[j]==false) { //연결 & 방문X
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
