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
public class _02_answer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		System.out.println(solution(str));
	}

	private static String solution(String str) {
		String answer = "";

//		for (char x : str.toCharArray()) {
//			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
//			else answer += Character.toLowerCase(x);
//		}

		for (char x : str.toCharArray()) {
			if (x >= 97 && x <= 122) {
				System.out.println(x);
			}
		}

		//up 65 ~ 90
		//lo 97 ~ 122
		//lo - up = 32

		return answer;
	}
}
