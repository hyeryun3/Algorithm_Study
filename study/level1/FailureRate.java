package study.level1;


public class FailureRate {
	public static void main(String[] args) {
		int n = 4;
		int[] stages = { 4,4,4,4,4 };
		solution(n, stages);
	}

	public static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		float[] answerV = new float[N];
		
		int player = 0;
		int nonClear=0;
		// 실패율 -> (스테이지 도달 && 클리어하지 못한 플레이어 수) / 스테이지 도달 플레이어 수
		for (int j = 1; j <= N; j++) {

			for (int i = 0; i < stages.length; i++) {
				if (stages[i] >= j) {
					player++;
					if(stages[i]<=j) {
						nonClear++;
					}
				}
			}
			answer[j-1]=j;
			answerV[j-1]=(float)nonClear/player;
			player=0;
			nonClear=0;
		}
		
		for(int i=0; i<answerV.length; i++) {
			for(int j=i+1; j<answerV.length; j++) {
				if(answerV[i] < answerV[j]) {
					float tmp = answerV[i];
					answerV[i] = answerV[j];
					answerV[j] = tmp;
					
					int tmpK = answer[i];
					answer[i] = answer[j];
					answer[j] = tmpK;
				}
				
				if(answerV[i] == answerV[j] && answer[i]>answer[j]) {
					int tmp = answer[i];
					answer[i] = answer[j];
					answer[j] = tmp;
				}
			}
		}
		
		return answer;
	}

}
