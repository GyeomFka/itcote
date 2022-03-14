package _01;

import java.util.Scanner;

public class _11_self {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		String answer = solution(input);
		System.out.println(answer.replace("1",""));
	}

	private static String solution(String input) {
		String answer = "";
		int cnt = 1;

		for (int i = 0; i < input.length()-1; i++) {
			if (input.charAt(i) == input.charAt(i + 1)) {
				cnt++;
			} else {
				answer += input.charAt(i);
				answer += cnt;
				cnt = 1;
			}
		}

		if (input.charAt(input.length() - 1) == input.charAt(input.length() - 2)) {
			answer += input.charAt(input.length() - 1);
			answer += cnt;
		} else {
			answer += input.charAt(input.length() - 1);
		}

		return answer;

	}
}
