package study.level2;

import java.util.LinkedList;
import java.util.Queue;

public class KakaoColoring {

	public static void main(String[] args) {
		int m = 6;
		int n = 4;
		int[][] picture = { { 1, 1, 1, 0 }, 
							{ 1, 2, 2, 0 }, 
							{ 1, 0, 0, 1 }, 
							{ 0, 0, 0, 1 },
							{ 0, 0, 0, 3 },
							{ 0, 0, 0, 3 },

		};

//		BFS( QUEUE 이용 )
		solution(m, n, picture);
	}
	public static int bfs(int m,int n, int x, int y, int[][] picture) {
		
		int cnt =1;
		Queue<Integer> que = new LinkedList<Integer>();
		
		int[] moveX = {1,0,-1,0};
		int[] moveY= {0,1,0,-1};
		boolean[][] visit = new boolean[picture.length][picture[0].length]; 

		int tmp1 = 0;
		int tmp2 = 0;
		for(int i=0; i<4; i++) {
			
			if( tmp1 >=0 && tmp2 >=0 && tmp1<picture.length && tmp2<picture[0].length) {
				
				que.add(picture[tmp1][tmp2]);
				visit[tmp1][tmp2]=true;
				cnt++;
				System.out.println(que);
			}
		}
		
		
		
		
		return cnt;
	}

	public static int[] solution(int m, int n, int[][] picture) {
		int numberOfArea = 0;
		int maxSizeOfOneArea = 0;

		int[] answer = new int[2];

		for (int i = 0; i < picture.length; i++) {
			for (int j = 0; j < picture[i].length; j++) {
				if (picture[i][j] != 0) {
					numberOfArea++;
				}
			}
		}

		for (int i = 0; i < picture.length; i++) {
			for (int j = 0; j < picture[i].length; j++) {
				if (picture[i][j] != 0) {
					if (j + 1 < picture[i].length && picture[i][j] == picture[i][j + 1]) {
						numberOfArea--;
					}
					if (i + 1 < picture.length && picture[i][j] == picture[i + 1][j]) {
						numberOfArea--;
					}
				}
			}
		}

		System.out.println(numberOfArea);
		
		
		Queue<Integer> que = new LinkedList<Integer>();
		int cnt=0;
		while(true) {
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					if(picture[i][j] > 0 && que.isEmpty()) {
						que.add(picture[i][j]);
						picture[i][j]=-1;
						System.out.println("["+i+"]["+j+"] = " + que.size()); 
					}
				}
			}
			
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					if(picture[i][j] > 0 && que.isEmpty()) {
						que.add(picture[i][j]);
						picture[i][j]=-1;
						System.out.println("["+i+"]["+j+"] = " + que.size()); 
					}
					
					if(i>0) {
						if(que.peek() == picture[i-1][j]) {
							que.add(picture[i-1][j]);
							picture[i-1][j]=-1;
							System.out.println("["+i+"]["+j+"] = " + que.size());
							cnt++;
						}
					}
					if(j<n-1) {
						if(que.peek() == picture[i][j+1]) {
							que.add(picture[i][j+1]);
							picture[i][j+1]=-1;
							System.out.println("["+i+"]["+j+"] = " + que.size());
							cnt++;
						}
					}
					if(i<m-1) {
						if(que.peek() == picture[i+1][j]) {
							que.add(picture[i+1][j]);
							picture[i+1][j]=-1;
							System.out.println("["+i+"]["+j+"] = " + que.size());
							cnt++;
						}
					}
					if(j>0) {
						if(que.peek() == picture[i][j-1]) {
							que.add(picture[i][j-1]);
							picture[i][j-1]=-1;
							System.out.println("["+i+"]["+j+"] = " + que.size());
							cnt++;
						}
					}
					
				}
			}
			System.out.println(que.size());
			maxSizeOfOneArea = maxSizeOfOneArea < que.size() ? que.size() : maxSizeOfOneArea;
			
			if(que.isEmpty()) {
				break;
			}
			que.clear();
			
			
		}
		
		
//		System.out.println(maxSizeOfOneArea);

		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;
		return answer;
	}
}
