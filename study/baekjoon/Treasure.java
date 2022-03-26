package study.baekjoon;

import java.util.*;

public class Treasure {

	public static void main(String[] args) {
		solution2();
	}

	public static void solution1() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = scan.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b);

		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += a[i] * b[n - 1 - i];
		}

		System.out.println(sum);
	}

	public static void solution2() {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int n = scan.nextInt();
		
		int a[] = new int[n];
		int b[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = scan.nextInt();
		}
		
		scan.close();
		
		Arrays.sort(a);
		ArrayList<Integer> b2 = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			b2.add(b[i]);
		}

		int j2 = 0;
		int tmp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < b2.size(); j++) {
				if (a[i] == 0) {
					if (tmp < b2.get(j)) {
						tmp=b2.get(j);
						j2 = j;
					}
				} else {
					if (tmp < a[i] * b2.get(j)) {
						tmp = a[i] * b2.get(j);
						j2 = j;
					}
				}
			}
			if(a[i]==0) {
				tmp=0;
			}
			b2.remove(j2);
			sum += tmp;
			tmp = 0;
		}
		
		
		System.out.println(sum);
	}
}

