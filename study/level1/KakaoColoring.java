package study.level1;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

import org.w3c.dom.Node;

public class KakaoColoring {

	public static void main(String[] args) {
		int m = 6;
		int n = 4;
		int[][] picture = { 
				{ 1, 1, 1, 0 }, 
				{ 1, 2, 2, 0 }, 
				{ 1, 0, 0, 1 },
				{ 0, 0, 0, 1 },
				{ 0, 0, 0, 3 },
				{ 0, 0, 0, 3 },

		};

		solution2(m, n, picture);
	}

	
	public static int[] solution2(int m, int n, int[][] picture) {
		System.out.println("아 어려워.....");
		
		return new int[2];
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
		
		int tmp=1;
		
		
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
		
		
		
		
		System.out.println(maxSizeOfOneArea);

		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;
		return answer;
	}
}
