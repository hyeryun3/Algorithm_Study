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

		
		Queue<Integer> que = new LinkedList<Integer>();
		while(true) {
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					if(picture[i][j] > 0 && que.isEmpty()) {
						System.out.println("Que삽입");
						que.add(picture[i][j]);
						picture[i][j]=-1;
						break;
					}
				}
			}
			
			if(que.isEmpty()) {
				break;
			}
			
			System.out.println("que는? " + que);
			int cnt=0;
			for(int j=0; j<n; j++) {
				for(int i=0; i<m; i++) {
					if(picture[i][j] != 0) {
						if(i>0 && que.peek() == picture[i-1][j]) {
							que.add(picture[i-1][j]);
							System.out.println("["+i+"]["+j+"] = " + picture[i-1][j]);
							picture[i-1][j]=-1;
						}else if(i<m-1 && que.peek() == picture[i+1][j] ) {
							que.add(picture[i+1][j]);
							System.out.println("["+i+"]["+j+"] = "  + picture[i+1][j]);
							picture[i+1][j]=-1;
						}else if(j<n-1 && que.peek() == picture[i][j+1] ) {
							que.add(picture[i][j+1]);
							System.out.println("["+i+"]["+j+"] = "  + picture[i][j+1]);
							picture[i][j+1]=-1;
						}else if(j>0 && que.peek() == picture[i][j-1] ) {
							que.add(picture[i][j-1]);
							System.out.println("["+i+"]["+j+"] = "  + picture[i][j-1]);
							picture[i][j-1]=-1;
						}else if(picture[i][j]== -1){
							continue;
						}else {
							cnt++;
						}
					}
				}
				if(cnt>=2) {
					maxSizeOfOneArea = maxSizeOfOneArea < que.size() ? que.size() : maxSizeOfOneArea;
					que.clear();
				}
				if(cnt>=2) {
					cnt=0;
					break;
				}
			}
			
			System.out.println("==========");
			
		}
		
		
//		System.out.println(maxSizeOfOneArea);

		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;
		return answer;
	}
}
