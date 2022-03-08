package _01;

import java.util.Scanner;

/**
 * 3.문장 속 단어
 * 입력 : it is time to study
 * 출력 : study
 */
public class _03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();
		// String input = "it is time to study";

		System.out.println(solution(input));

	}

	private static String solution(String input) {
		String[] words = input.split(" ");

		String answer = words[0];

		for(int i = 1; i < words.length; i++) {
			if(answer.length() < words[i].length()) {
				answer = words[i];
			}
		}
		return answer;
	}
}
