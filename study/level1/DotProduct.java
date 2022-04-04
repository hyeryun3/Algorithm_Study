package study.level1;

public class DotProduct {
	public static void main(String[] args) {
		int ans = 0;

		int a[] = { 1, 2, 3, 4 };
		int b[] = { -3, -1, 0, 2 };

		for (int i = 0; i < a.length; i++) {
			ans += a[i] * b[i];
		}
		System.out.println(ans);
	}

}
