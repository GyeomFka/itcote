package _02;

import java.util.Scanner;

public class _03_answer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		int[] a = new int[cnt];
		int[] b = new int[cnt];

		for (int i = 0; i < cnt; i++) {
			a[i] = scan.nextInt();
		}

		for (int i = 0; i < cnt; i++) {
			b[i] = scan.nextInt();
		}

		System.out.println(solution(cnt, a, b));
	}

	private static String solution(int cnt, int[] a, int[] b) {
		String answer = "";
		for (int i = 0; i < cnt; i++) {

		}
		return answer;
	}
}
