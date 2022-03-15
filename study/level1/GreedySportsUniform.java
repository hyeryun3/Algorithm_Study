package study.level1;

import java.util.Arrays;

public class GreedySportsUniform {

	public static void main(String[] args) {
		int n = 7; // 전체 학생 수
		int[] lost = { 2, 3, 4 }; // 도난당한 학생 번호
		int[] reserve = { 1, 2, 3, 6 }; // 여벌있는 학생 번호
		solution2(n, lost, reserve);
	}

	
	public static int solution2(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length; // 체육수업 들을 수 있는 학생 최대 수

		Arrays.sort(lost);
		Arrays.sort(reserve);

		// 도난학생과 여벌학생이 같으면 0으로 바꾼다. 참여학생 ++
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					answer++;
					lost[i] = 0;
					reserve[j] = 0;
					break;
				}
			}
		}
		
		for (int i = 0; i < lost.length; i++) {
			if (lost[i] > 0) {
				for (int j = 0; j < reserve.length; j++) {
					if ((reserve[j] >= lost[i] - 1) && (reserve[j] <= lost[i] + 1) && reserve[j]>0) {
						answer++;
						lost[i]=0;
						reserve[j] = 0;
						break;
					}
				}
			}
		}

		System.out.println(answer);
		return answer;
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0; // 체육수업 들을 수 있는 학생 최대 수

		Arrays.sort(lost);
		Arrays.sort(reserve);
		answer = n - lost.length;
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					answer++;
					lost[i] = -10;
					reserve[j] = -20;
				}
			}
		}
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if ((reserve[j] >= lost[i] - 1) && (reserve[j] <= lost[i] + 1)) {
					answer++;
					reserve[j] = -20;
					break;
				}
			}
		}
		System.out.println(answer);
		return answer;
	}
	
	
	public static int solution3(int n, int[] lost, int[] reserve) {
		int answer = n; // 체육수업 들을 수 있는 학생 최대 수
		int[] count = new int[n];
		
		for(int a:lost) {
			count[a-1]--;
		}
		for(int b:reserve) {
			count[b-1]++;
		}
		
		for(int i=0; i<n; i++) {
			if(count[i]== -1) {
				if(i-1>=0 && count[i-1]==1) {
					count[i]++;
					count[i-1]--;
				}else if(i+1<n && count[i+1]==1) {
					count[i+1]--;
					count[i]++;
				}else {
					answer--;
				}
			}
		}
		System.out.println(answer);
		
		return answer;
	}
}
