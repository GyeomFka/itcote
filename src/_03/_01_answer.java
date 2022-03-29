package _03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. two pointers algorithm
 */
public class _01_answer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt(); //3
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		int m = scan.nextInt(); //3
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = scan.nextInt();
		}
		ArrayList<Integer> answer = new ArrayList<>();
		//두 배열 합친 후 오름차순 정렬

		int pa = 0, pb = 0;

		while (pa < a.length && pb < b.length) {
			if (a[pa] > b[pb]) {
				answer.add(b[pb++]);
			} else if (a[pa] <= b[pb]) {
				answer.add(a[pa++]);
			}
		}

		while(pa < a.length) answer.add(a[pa++]);
		while(pb < b.length) answer.add(b[pb++]);

		for (int x : answer) {
			System.out.print(x + " ");
		}
	}
}
