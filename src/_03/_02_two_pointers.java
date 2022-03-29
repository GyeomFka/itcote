package _03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 공통원소 구하기
 * runtime?
 */
public class _02_two_pointers {
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

		Arrays.sort(a);
		Arrays.sort(b);

		ArrayList<Integer> answer = new ArrayList<>();
		//두 배열 합친 후 오름차순 정렬
		int pa = 0, pb = 0;

		while (pa < a.length && pb < b.length) {
			if (a[pa] < b[pb]) {
				pa++;
			} else if (a[pa] > b[pb]) {
				pb++;
			} else {
				answer.add(a[pa]);
				pa++;
				pb++;
			}
		}

		/*while(pa < a.length) answer.add(a[pa++]);
		while(pb < b.length) answer.add(b[pb++]);*/

		for (int x : answer) {
			System.out.print(x + " ");
		}


	}
}
