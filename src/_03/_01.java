package _03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. 두 배열 합치기
 */
public class _01 {
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

		int[] answer = new int[n + m];

		int position = 0;

		for (int x : arr1) {
			answer[position] = x;
			position++;
		}
		for (int x : arr2) {
			answer[position] = x;
			position++;
		}

/*
		for (int i = 0; i < arr1.length; i++) {
			answer[i] = arr1[i];
		}

		int j = 0;
		for (int i = n; i < n+m; i++) {
			answer[i] = arr2[j];
			j++;
		}*/

		Arrays.sort(answer);

		for (int x : answer) {
			System.out.print(x + " ");
		}

	}
}
