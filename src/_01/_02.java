package _01;

import java.util.Scanner;

/**
 * 2.대소문자 변환
 char[] chars = {'A', 'a', '1'};
 for (char c : chars) {
 	if (Character.isUpperCase(c)) System.out.println(c + "는 대문자입니다.");
 	if (Character.isLowerCase(c)) System.out.println(c + "는 소문자입니다.");
 	if (Character.isDigit(c)) System.out.println(c + "은 숫자입니다.");
 }
 */
public class _02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = in.next();

		String[] answer = solution(input);

		for (String result : answer) {
			System.out.print(result);
		}
	}

	private static String[] solution(String input) {

		String[] answer = new String[input.length()];

		for (int i = 0; i < input.length(); i++) {
			answer[i] = transfer(input.charAt(i));
		}
		return answer;
	}

	private static String transfer(char c) {
		if (Character.isUpperCase(c)) {
			return String.valueOf(c).toLowerCase();
		} else {
			return String.valueOf(c).toUpperCase();
		}
	}
}
