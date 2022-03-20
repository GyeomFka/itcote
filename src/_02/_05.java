package _02;

import java.util.Scanner;

/**
 * 5. 소수(에라토스테네스 체)
 * 1 ~ n 까지의 소수 구하기
 * 걸러내는 알고리즘
 */
public class _05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();

		int answer = solution(cnt);
		System.out.println(answer);

	}

	private static int solution(int cnt) {
		int answer = 0;
		int[] ch = new int[cnt + 1];
		for (int i = 2; i <= cnt; i++) {
			if (ch[i] == 0) {
				answer++;
				for (int j = i; j <= cnt; j=j+i) {
					ch[j] = 1;
				}
			}
		}
		return answer;
	}
}
