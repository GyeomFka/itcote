package _02;

import java.util.Scanner;

/**
 * 12.멘토링
 */
public class _12_answer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int studentCnt = scan.nextInt();
		int testCnt = scan.nextInt();

		int[][] arr = new int[testCnt][studentCnt];

		for (int i = 0; i < testCnt; i++) {
			for (int j = 0; j < studentCnt; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		int answer = 0;

		for (int i = 1; i <= studentCnt; i++) {
			for (int j = 1; j <= studentCnt; j++) {

				int cnt = 0;
				for (int k = 0; k < testCnt; k++) {
					int di = 0, dj = 0;
					for (int s = 0; s < studentCnt; s++) {
						if(arr[k][s] == i) di = s;
						if(arr[k][s] == j) dj = s;
					}
					if(di < dj) cnt++;
				}
				if(cnt == testCnt) answer++;

			}
		}
		System.out.println(answer);
	}
}