package _01;

import java.util.Scanner;

/**
 * 1.문자 찾기 - 맞왜틀? ㅡㅡ? - 대,소 문자 구분
 */
public class _01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input1 = in.nextLine();
		String input2 = in.nextLine();

		System.out.println(solution(input1.toUpperCase(), input2.toUpperCase()));
	}

	private static int solution(String input1, String input2) {
		int result = 0;
		for (int i = 0; i <= input1.length() - input2.length(); i++) {
			if (input1.substring(i, input2.length() + i).equals(input2)) {
				result++;
			}
		}
		return result;
	}

}