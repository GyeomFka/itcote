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

		int[][] dupCnt = new int[studentCnt][5];

		//input
		for (int w = 0; w < studentCnt; w++) {
			for (int h = 0; h < 5; h++) {
				if (h == 0) {
					System.out.println(tmpLeader[w][h]);
				}
			}
		}
	}
}
