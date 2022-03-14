package _01;

import java.util.Scanner;

/**
 * 12. 암호
 */
public class _12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		String msg = scan.next();
		String answer = solution(length, msg);
		System.out.println(answer);
	}

	private static String solution(int length, String msg) {
		String answer = "";

		msg = msg.replace("#", "1").replace("*","0");

		String[] msgList = new String[length];

		for (int i = 0; i < length; i++) {
			msgList[i] = msg.substring(7 * i, 7 * (i + 1));
		}

		for (String x : msgList) {
			answer += (char)Integer.parseInt(x, 2);
		}

		return answer;
	}
}
