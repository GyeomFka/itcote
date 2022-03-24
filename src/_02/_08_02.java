package _02;

import java.util.Scanner;

/**
 * 등수 계산
 * 30
 * 65, 54, 81, 56, 54, 70, 61, 87, 99, 58, 78, 99, 99, 70, 96, 60, 77, 84, 67, 86, 84, 98, 63, 96, 83, 54, 52, 86, 78, 69
 */
public class _08_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();

		int[] score = new int[length];
		for (int i = 0; i < length; i++) {
			score[i] = scan.nextInt();
		}

		int[] score_copy = new int[length];
		for (int i = 0; i < length; i++) {
			score_copy[i] = score[i];
		}

		int[] rank = new int[length];

		for (int i = 0; i < length; i++) {
			rank[i] = setRank(score);
		}

		showRank(score, score_copy, rank);
	}

	private static void showRank(int[] score, int[] score_copy, int[] rank) {
		int dup = 0;
		for (int i = 0; i < score.length; i++) {
			if (i > 0 && score_copy[rank[i - 1]] == score_copy[rank[i]]) {
				score[rank[i]] = dup;
			} else {
				score[rank[i]] = i;
				dup = i;
			}
		}

		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i]+1 + " ");
		}
	}

	public static int setRank(int[] score) {
		int max = score[0];
		int index = 0;

		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
				index = i;
			}
		}
		//System.out.println(score[index]);
		score[index] = 0;
		return index;
	}

}