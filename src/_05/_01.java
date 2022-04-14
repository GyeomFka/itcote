package _05;

import java.util.Scanner;
import java.util.Stack;

public class _01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// String str = "()()";
		String str = scan.next();
		String answer = solution(str);
		System.out.println(answer);
	}

	private static String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();

		for (char x : str.toCharArray()) {
			if (x == '(') stack.push(x);
			if (stack.isEmpty() && x == ')') return "NO";
			if (x == ')') stack.pop();
		}

		return answer;
	}
}

