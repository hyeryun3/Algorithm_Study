package study.level1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GiveupMath {

	public static void main(String[] args) {

		int[] answers = { 1, 2, 3, 4, 5 };
		solution(answers);
	}

	public static int[] solution(int[] answers) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] c = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		
		int[] scores = new int[3];

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == a[i % 5]) {
				scores[0]++;
			}
			if (answers[i] == b[i % 8]) {
				scores[1]++;
			}
			if (answers[i] == c[i % 10]) {
				scores[2]++;
			}
		}
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<scores.length; i++) {
			map.put(i+1, scores[i]);
		}
		
		List<Map.Entry<Integer, Integer>> entry = new LinkedList<>(map.entrySet());
		
		entry.sort(new Comparator<Map.Entry<Integer, Integer>>() {
			
			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return o2.getValue()-o1.getValue();
			}
		});
				

//		System.out.println("--------------------");
//		System.out.println(entry.get(0).getValue());
//		System.out.println(entry.get(1).getValue());
//		System.out.println(entry.get(2).getValue());
//		System.out.println("--------------------");
		
		int cnt =0 ;
		int max = entry.get(0).getValue();
		for(int i=0; i<entry.size(); i++) {
			if(max == entry.get(i).getValue()) {
				cnt++;
			}
		}
		
		int[] answer = new int[cnt];
		for(int i=0; i<cnt; i++) {
			answer[i] = entry.get(i).getKey();
		}
		

		return answer;
	}
}
