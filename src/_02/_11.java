package _02;

/**
 * 11. 임시반장
 */
public class _11 {
	public static void main(String[] args) {
		int studentCnt = 5;

		// int[][] tmpLeader = new int[studentCnt][5];
		int[][] tmpLeader = {
			{2,3,1,7,3},
			{4,1,9,6,8},
			{5,5,2,4,4},
			{6,5,2,6,7},
			{8,4,2,2,2}
		};

		int[] score = new int[studentCnt];

		for (int a = 0; a < 5; a++) {

			for (int w = 0; w < studentCnt; w++) {
				for (int h = w+1; h < studentCnt; h++) {
					if(tmpLeader[w][a] == tmpLeader[h][a]) {
						score[w]++;
						score[h]++;
					}
				}
			}
		}

		for (int x : score) {
			System.out.println(x);
		}





	}
}
