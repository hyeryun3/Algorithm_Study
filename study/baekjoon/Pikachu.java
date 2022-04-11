package study.baekjoon;

import java.util.Scanner;

public class Pikachu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String[] pikachu = {"pi","ka","chu"};
		
		for(int i=0; i<pikachu.length;i++) {
			s=s.replaceAll(pikachu[i], " ");
		}

		if(s.trim().equals("")) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
