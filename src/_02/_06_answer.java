package _02;

import java.util.ArrayList;
import java.util.Scanner;

public class _06_answer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		int[] input = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			input[i] = scan.nextInt();
		}
		ArrayList<Integer> answer = solution(cnt, input);

		for (int x : answer) {
			System.out.print(x + " ");
		}
	}

	private static ArrayList<Integer> solution(int cnt, int[] input) {
		ArrayList<Integer> answer = new ArrayList<>();

		for(int i = 0; i < cnt; i++) {
			int tmp = input[i];
			int res = 0;
			while (tmp > 0) {
				int t = tmp % 10;
				res = res * 10 + t;
				tmp = tmp / 10;
			}
			if (isPrime(res)) answer.add(res);
		}

		return answer;
	}

	private static boolean isPrime(int res) {
		if(res == 1) return false;
		for (int i = 2; i < res; i++) {
			if (res%i==0) return false;
		}
		return true;
	}
}
