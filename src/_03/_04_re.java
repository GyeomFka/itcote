package _03;

import java.util.Scanner;

/**
 * 4. 연속 부분수열
 */
public class _04_re {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 5;
		int m = 4;
		int[] arr = {1, 2, 1, 1, 2, 1};

		int answer = 0;
		for (int i = 0; i < n; i++) {
			int j = i;
			int sum = arr[i];

			if (i == n - 1) {
				sum = arr[i];
				break;
			}

			while (sum < m && j < n-1) {
				sum += arr[j++];
			}
			if (sum == m) answer++;

		}


	}
}
