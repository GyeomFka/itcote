package _02;

import java.util.Scanner;

/**
 * 12.멘토링
 */
public class _12_my_answero {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int studentCnt = 4;
		int testCnt = 3;

		int[][] arr = {
			{3,4,1,2},
			{4,3,2,1},
			{3,1,4,2}
		};

		for (int i = 0; i < testCnt; i++) {
			for (int j = 1; j < studentCnt; j++) {
				if(i==j) continue;
				for (int k = 0; k < testCnt; k++) {
					int mento = arr[k][i];
					int menti = arr[k][j];
				}
			}
		}


	}
}
