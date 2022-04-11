package _05;

import java.util.Stack;

public class _01 {
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		stack.push('a');
		stack.push('b');
		stack.push('c');
		stack.push('d');
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
