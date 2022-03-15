package study.book1;

import java.util.Scanner;

public class Q1_2 {

	public static void main(String[] args) {
//		Q7();
//		Q8();
//		System.out.println(sumof(6, 4));
//		Q10();
//		Q11();
//		Q12();
//		Q13();
//		Q14();
//		triangleB(5);
//		tringleLU(5);
//		tringleRU(5);
//		tringleRB(5);
//		spira(4);
		npira(4);
	}

	static void Q7() {
		int sum = 0;
		for (int i = 1; i < 8; i++) {
			sum += i;
			if (i < 7) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			}
		}
		System.out.print(sum);
		System.out.println();
	}

	static void Q8() { // 가우스의 덧셈 (1~10까지의 합을 구하라)
		int n = 100;
		int sum = (1 + n) * (n / 2);
		System.out.println(sum);
	}

	static int sumof(int a, int b) { // Q9
		int sum = 0;
		if (b > a) {
			for (int i = a; i <= b; i++) {
				sum += i;
			}
		} else {
			for (int i = b; i <= a; i++) {
				sum += i;
			}
		}
		return sum;
	}

	static void Q10() {
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0;
		boolean flag = false;
		while (!flag) {
			System.out.print("a의 값 : ");
			a = scan.nextInt();

			System.out.print("b의 값 : ");
			b = scan.nextInt();

			if (a >= b) {
				System.out.println("a보다 큰 값을 입력하세요.");
				System.out.print("b의 값 : ");
				b = scan.nextInt();
			}
			System.out.println("b - a는 " + (b - a) + "입니다.");
			flag = true;
		}
	}

	static void Q11() {
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수 입력 : ");
		int a = scan.nextInt();
		int leng = String.valueOf(a).length();
		System.out.println("그 수는 " + leng + "자리 입니다.");
	}

	static void Q12() {
		System.out.print("   | ");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%2d ", i);
		}
		System.out.println();
		System.out.println("---+----------------------------");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%2d |", i);
			for (int j = 1; j < 10; j++) {
				System.out.printf(" %2d", i * j);
			}
			System.out.println();
		}
	}

	static void Q13() {
		System.out.print("   | ");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%2d ", i);
		}
		System.out.println();
		System.out.println("---+----------------------------");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%2d |", i);
			for (int j = 1; j < 10; j++) {
				System.out.printf(" %2d", i + j);
			}
			System.out.println();
		}
	}

	static void Q14() {
		System.out.println("사각형을 출력합니다.");
		System.out.printf("단 수 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void triangleB(int n) { // Q15	왼쪽 아래 직각
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void tringleLU(int n) { // Q15	왼쪽 위 직각
		for(int i=0; i<n;i++) {
			for(int j=n; j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void tringleRU(int n) { // Q15	오른쪽 위 직각
		for(int i=0; i<n; i++) {
			for(int j=0; j<i;j++) {
				System.out.print(" ");
			}
			for(int j=n; j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void tringleRB(int n) { // Q15	오른쪽 아래 직각
		for(int i=0; i<n; i++) {
			for(int j=n; j>i;j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void spira(int n) {	//Q16
		for(int i=0; i<n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	static void npira(int n) {	//Q17
		for(int i=0; i<n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print(i+1);
			}
			for(int j=0; j<i; j++) {
				System.out.print(i+1);
			}
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
