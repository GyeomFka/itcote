package _05;

import java.util.Scanner;
import java.util.Stack;

public class _03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] board = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = scan.nextInt();
			}
		}

		int m = scan.nextInt();
		int[] moves = new int[m];

		for (int i = 0; i < m; i++) {
			moves[i] = scan.nextInt();
		}

		System.out.println(solution(n, board, m, moves));
	}

	private static int solution(int n, int[][] board, int m, int[] moves) {
		Stack<Integer> box = new Stack<>();

		int answer = 0;
		/* logic */
		for (int i = 0; i < m; i++) {
			Integer getOjb = getObj(moves[i], board);
			if(getOjb == 0) continue;

			if(box.size() > 0 && getOjb == box.peek()) {
				answer += 2;
				box.pop();
			} else box.push(getOjb);

		}
		/* logic */

		return answer;
	}



	private static Integer getObj(int move, int[][] board) {
		int obj = 0;
		int n = board.length;
		for (int i = 0; i < n; i++) {
			//board[move-1][i] 선택 행의 0이 아니면서, 숫자를 가져온다. 모든 예외처리 해야함. 0도 바꿔야함
			if (board[i][move-1] != 0) {
				obj = board[i][move-1];
				board[i][move-1] = 0;
				break;
			}
		}
		return obj;
	}
}
