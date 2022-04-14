package _05;

import java.util.Stack;

public class _00_Stack {
	public static void main(String[] args) {

		Stack<Character> stack = new Stack<>();

		System.out.println(stack.empty());
		System.out.println(stack.isEmpty());

		stack.push('A');
		stack.push('B');
		stack.push('C');

		System.out.println(stack.empty());
		System.out.println(stack.isEmpty());

		System.out.println(stack.push('D'));

		System.out.println(stack.search('B'));

		System.out.println("stack get" + stack.get(3));
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());

	}
}
