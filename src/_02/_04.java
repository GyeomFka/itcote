package _02;

import java.util.Scanner;

/**
 * 4. 피보나치 수열
 */
public class _04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[n];

		array[0] = 1;
		array[1] = 1;

		for (int i = 2; i < n; i++ ) {
			array[i] = array[i - 1] + array[i - 2];
		}

		for (int x : array) {
			System.out.print(x + " ");
		}
	}
}
