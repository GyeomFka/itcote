package _03;

import java.util.Scanner;

/**
 * 4. 연속 부분수열
 * 이거봐 맞출 수 있잖아 씨발
 */
public class _04_re_answer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int answer = 0;
		for (int i = 0; i < n; i++) {
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
		System.out.println(answer);
	}
}
