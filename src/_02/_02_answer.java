package _02;

import java.util.Scanner;

public class _02_answer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int[] students = new int[len];
		for (int i = 0; i < len; i++) {
			students[i] = scan.nextInt();
		}

		int solution = solution(len, students);
		System.out.println(solution);
	}

	private static int solution(int len, int[] students) {
		int answer = 1, max = students[0];
		for(int i = 1; i < len; i++) {
			if(students[i] > max) {
				answer++;
				max = students[i];
			}
		}
		return answer;
	}
}
