package _01;

import java.util.Scanner;

/**
 * 6. 중복문자제거
 */
public class _06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = scan.next();
		String answer = "";

		for (int i = 0; i < input.length(); i ++) {
			//System.out.println(input.charAt(i) + " : " + input.indexOf(input.charAt(i)));
			if (input.indexOf(input.charAt(i)) == i) {
				answer += input.charAt(i);
			}
		}

		System.out.println(answer);
	}
}

