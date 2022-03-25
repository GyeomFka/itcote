package _02;

import java.util.Scanner;

/**
 * 봉우리
 */
public class _10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		int[][] mnt = new int[cnt+2][cnt+2];

		// input
		for (int i = 1; i <= cnt; i ++) {
			for (int j = 1; j <= cnt; j++) {
				mnt[i][j] = scan.nextInt();
			}
		}

		int answer = 0;

		// solution
		for (int i = 1; i <= cnt; i ++) {
			for (int j = 1; j <= cnt; j++) {
				if (mnt[i][j] > mnt[i-1][j]/*남*/
					&& mnt[i][j] > mnt[i][j+1]/*동*/
					&& mnt[i][j] > mnt[i+1][j]/*북*/
					&& mnt[i][j] > mnt[i][j-1]/*서*/ ) {
					answer++;
				}
			}
		}

		// output
		/*for (int i = 0; i < cnt+2; i ++) {
			for (int j = 0; j < cnt+2; j++) {
				System.out.print(mnt[i][j] + " ");
			}
			System.out.println(" ");
		}*/

		System.out.println(answer);
	}
}
