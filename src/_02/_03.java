package _02;

import java.util.Scanner;

/**
 * 3. 가위 바위 보
 */
public class _03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		int[] a = new int[cnt];
		int[] b = new int[cnt];

		for (int i = 0; i < cnt; i++) {
			a[i] = scan.nextInt();
		}

		for (int i = 0; i < cnt; i++) {
			b[i] = scan.nextInt();
		}

		String[] answer = solution(cnt, a, b);
		for (String x : answer) {
			System.out.println(x);
		}
	}

	private static String[] solution(int cnt, int[] a, int[] b) {
		String[] answer = new String[cnt];

		for (int i = 0; i < cnt; i++) {
			answer[i] = game(a[i], b[i]);
		}

		return answer;
	}

	private static String game(int a, int b) {
		String answer = "";
		if (a == b) {
			answer = "D";
		} else if ( a == 1 ) {//가위
			if( b == 2 ) {//바위
				answer = "B";
			} else {//보
				answer = "A";
			}
		} else if ( a == 2 ) {//바위
			if ( b == 1 ) {
				answer = "A";
			} else {
				answer = "B";
			}
		} else {//보3
			if ( b == 1) {
				answer = "B";
			} else {
				answer = "A";
			}
		}
		return answer;
	}
}
