package _02;

import java.util.Scanner;

/**
 * 11. 임시반장
 * - 본질은 `학생 수` 찾기 이므로 2학년 같은반 -> 3학년 같은반 -> 중복처리 카운트 1
 * - 2이상 중첩의 반복문에서 어느 고정값을 잡을지에 대한 충분한 고려도 필요하다.
 */
public class _11_re {
	public static void main(String[] args) {
		int n = 5;
		int[][] arr;
		int[] score = new int[n];

		arr = new int[][] {
			{2, 3, 1, 7, 3},
			{4, 1, 0, 6, 8},
			{5, 5, 2, 4, 4},
			{6, 5, 2, 6, 7},
			{8, 4, 2, 2, 2}
		};

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				for (int k = 0; k < 5; k++) {
					if (arr[i][k] == arr[j][k]) {
						score[i]++;
						break;
					}
				}

			}
		}

		for (int x : score) {
			System.out.println(x);
		}
	}
}
