package _01;

import java.util.Scanner;

/**
 *4. 단어 뒤집기
 */

public class _04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		String[] words = new String[length];

		for (int i = 0; i < words.length; i ++) {
			solution(scan.next());
			System.out.println("");
		}
	}

	private static void solution(String word) {
		for (int i = word.length()-1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
	}
}
