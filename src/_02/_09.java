package _02;

import java.util.Scanner;

/**
 * 9. 격자판 최대합
 */
public class _09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] board = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = scan.nextInt();
			}
		}

		int totMax = 0;

		int widthTotMax = 0;
		int heightTotMax = 0;

		int witdhMax = 0;
		int heightMax = 0;
		int xMax = 0;
		int yMax = 0;

		for (int i=0; i<n; i++) {
			witdhMax = 0;
			heightMax = 0;
			xMax += board[i][i];
			yMax += board[(n-1) - i][i];
			for (int j=0; j<n; j++) {
				witdhMax += board[i][j];
				heightMax += board[j][i];
				// System.out.println(max);
			}

			if (widthTotMax < witdhMax) {
				widthTotMax = witdhMax;
			}

			if (heightTotMax < heightMax) {
				heightTotMax = heightMax;
			}

		}

		totMax = Math.max(Math.max(heightTotMax, widthTotMax), Math.max(xMax, yMax));

	}
}
