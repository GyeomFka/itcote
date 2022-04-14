package _05;

import java.util.Stack;

public class _00_Stack_test {
	public static void main(String[] args) {

		Stack<Character> stack = new Stack<>();

		stack.push('A');
		stack.push('B');
		stack.push('C');

		/*System.out.println(stack.get(0));
		System.out.println(stack.get(1));
		System.out.println(stack.get(2));
		System.out.println(stack.peek());*/

		int[][] board = {
			{0, 0, 0, 0, 0},
			{0, 0, 1, 0, 3},
			{0, 2, 5, 0, 1},
			{4, 2, 4, 4, 2},
			{3, 5, 1, 3, 1},
		};

		System.out.println(board[0][0]);
		System.out.println(board[1][0]);
		System.out.println(board[2][0]);
		System.out.println(board[3][0]);
		System.out.println(board[4][0]);


	}
}
