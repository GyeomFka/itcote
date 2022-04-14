package _05;

import java.util.Stack;

public class _01_answer {
	public static void main(String[] args) {
		String answer = "YES";
		String str = "(()(()))(()";
		Stack<Character> stack = new Stack<>();

		for (char x :str.toCharArray()) {
			if(x == '(') {
				stack.push(x);
			} else {
				if(stack.isEmpty()) {
					answer = "NO";
				} else {
					stack.pop();
				}
			}
		}

		if(!stack.isEmpty()) answer = "NO";

		System.out.println(answer);

	}
}