package _02;

import java.util.Scanner;

/**
 * 2. 보이는 학생
 */
public class _02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int[] students = new int[len];
		for (int i = 0; i < len; i++) {
			students[i] = scan.nextInt();
		}

		int solution = solution(len, students);
		System.out.println(solution);
	}

	private static int solution(int len, int[] students) {
		int answer = 1;
		int ix = 0;
		for (int i = 1; i < len; i++) {
			if( students[ix] < students[i]) {
				answer++;
				ix = i;
			}
		}
		return answer;
	}
}
