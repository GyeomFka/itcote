package _03;

import java.util.Scanner;

/**
 * 3. 최대 매출
 *  Time Limit Exceeded ?
 */
public class _03 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int answer = 0;

		for (int i = 0; i <= n-k; i++) {
			int sum = 0;
			for (int j = i; j < i+k; j++) {
				sum += arr[j];
			}
			answer = Math.max(answer, sum);
		}
		System.out.println(answer);
	}
}
