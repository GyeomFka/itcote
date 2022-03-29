package _03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 공통원소 구하기
 * runtime?
 */
public class _02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt(); //3
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = scan.nextInt();
		}

		int m = scan.nextInt(); //3
		int[] arr2 = new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = scan.nextInt();
		}
		ArrayList<Integer> answer = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr1[i] == arr2[j]) {
					answer.add(arr1[i]);
					break;
				}
			}
		}

		Collections.sort(answer);
		//answer.sort(Comparator.naturalOrder());

		for (int x : answer) {
			System.out.print(x + " ");
		}
	}
}
