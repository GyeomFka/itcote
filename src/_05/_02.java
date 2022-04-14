package _05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class _02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(solution(scan.next()));
	}

	private static String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		List<Character> arr = new ArrayList<>();


		for (char x : str.toCharArray()) {
			if(x != ')') {
				stack.push(x);
			} else {
				int size = stack.size();
				while (size > 0 && stack.get(size-1) != '(') {
					stack.pop();
					size = stack.size();
				}
				stack.pop();
			}
		}

		for (int i = 0; i < stack.size(); i++) {
			answer += stack.get(i);
		}
		return answer;
	}
}
