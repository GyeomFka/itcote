package _03;

import java.util.Scanner;

/**
 * 3. 최대 매출
 *  Time Limit Exceeded ?
 */
public class _03_sliding_window {
	public static void main(String[] args) {

		int n = 10; // 매출 길이
		int m = 3; // 최대 합
		int[] arr = {12, 15, 11, 20, 25, 10, 20, 19, 13, 15};

		int answer = 0;
		int sum = 0;

		for (int i = 0; i < m; i++) {
			sum += arr[i];
			answer = sum;
		}

		for (int i = m; i < n; i++) {
			sum += arr[i];
			sum -= arr[i-m];
			if (answer < sum) {
				answer = sum;
			}
		}
		System.out.println(answer);
	}
}
