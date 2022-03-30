package _03;

import java.util.Scanner;

/**
 * 4. 연속 부분수열
 */
public class _04_re {
	public static void main(String[] args) {
		int n = 8;
		int m = 6;
		int[] arr = {1, 2, 1, 3, 1, 1, 1, 2};

		int answer = 0;

		for (int i = 0; i < 8; i++) {
			int sum = 0;
			int di = i;
			while (sum < m) {
				if (di == n - 1) {
					sum += arr[di];
					break;
				} else {
					sum += arr[di++];
				}
			}
			if (sum==m) answer++;
		}
	}
}
