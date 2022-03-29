package _03;

import java.util.Scanner;

/**
 * 4. 연속 부분수열
 */
public class _04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int answer = 0;

		for (int i = 0; i < n; i++) {
			int j = i;
			int mNum = arr[i];

/*
			if (i == n-1) {
				mNum = arr[i];
				break;
			}
*/

			while(mNum < m || j < n-1 ) { //j의 제한도 걸어야 한다.
				j++;
				mNum += arr[j];
			}

			if(mNum == m) answer++;
		}

		System.out.println(answer);
	}
}
