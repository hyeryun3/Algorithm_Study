package study.book1;

public class Q1_1 {

	public static void main(String[] args) {
		System.out.println(max4(50, 330, 3600, 4000));
		System.out.println(min3(12, 53, 100));
		System.out.println(min4(120, 530, 100, 123));
		System.out.println(mid3(1,20,10));
	}

	static int max4(int a, int b, int c, int d) {
		int max = a;

		max = b > max ? b : max;
		max = c > max ? c : max;
		max = d > max ? d : max;

		return max;
	}

	static int min3(int a, int b, int c) {
		int min = a;

		min = b < min ? b : min;
		min = c < min ? c : min;

		return min;
	}

	static int min4(int a, int b, int c, int d) {
		int min = a;

		min = b < min ? b : min;
		min = c < min ? c : min;
		min = d < min ? d : min;

		return min;
	}

	static int mid3(int a, int b, int c) {

		if(a>=b) {
			if(b>=c) {
				return b;
			}else if(a<=c) {
				return a;
			}else {
				return c;
			}
		}else if(a>c) {
			return a;
		}else if(b>c) {
			return c;
		}else {
			return b;
		}
	}
}
