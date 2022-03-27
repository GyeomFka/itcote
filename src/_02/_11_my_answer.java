package _02;

import java.util.Scanner;

/**
 * 11. 임시반장
 */
public class _11_my_answer {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int studentCnt = scan.nextInt();

		// int[][] tempClassLeader = new int[studentCnt][5];
		int[][] tempClassLeader = {
			{9, 8, 7, 6, 5},
			{5, 6, 7, 8, 9},
			{1, 2, 3, 7, 8},
			{4, 5, 3, 4, 2},
			{6, 2, 8, 4, 2}
		};

		/*for (int i = 0; i < studentCnt; i++) {
			for (int j = 0; j < 5; j++) {
				tempClassLeader[i][j] = scan.nextInt();
			}
		}*/

		int[] score = new int[studentCnt];

		for (int a = 0; a < 5; a++) {
			for (int w = 0; w < studentCnt; w++) {
				for (int h = w+1; h < studentCnt; h++) {
					if(tempClassLeader[w][a] == tempClassLeader[h][a]) {
						score[w]++;
						score[h]++;
					}
				}
			}
		}

		int answer = 0;
		for (int i = 0; i < studentCnt; i++) {
			if (score[i] > score[answer]) {
				answer = i;
			}
			System.out.print(score[i] + " ");
		}

		System.out.println(answer+1);

	}
}
