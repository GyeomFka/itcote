package _02;

import java.util.Scanner;

/**
 * 9. 격자판 최대합
 */
public class _09_answer_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] board = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = scan.nextInt();
			}
		}

		int answer = 0;
		int sum1, sum2; //행, 열
		for (int i = 0; i < n; i++) {
			sum1 = sum2 = 0;
			for (int j = 0; j < n; j++) {
				sum1 += board[i][j];
				sum2 += board[j][i];
			}
			answer = Math.max(sum1, sum2);
		}

		sum1 = sum2 = 0;
		for (int i = 0; i < n; i++) {
			sum1 += board[i][i];
			sum2 += board[i][(n - i) - 1];
		}

		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);

	}
}
