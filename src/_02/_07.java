package _02;

import java.util.Scanner;

/**
 * 7. 점수계산
 */
public class _07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		int[] input = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			input[i] = scan.nextInt();
		}

		int answer = solution(input);
		System.out.println(answer);
	}

	private static int solution(int[] input) {
		int answer = 0;
		int con = 1;
		int a = 2;
		for (int i = 0; i < input.length; i++) {
			if(input[i] == 1) {
				if (i == 0) {
					answer += con;
					continue;
				}
				if (input[i - 1] == 0) {
					answer += con;
				} else {
					answer += a;
					a++;
				}
			} else {
				if(i == 0) continue;
				if (input[i - 1] == 1) {
					a = 2;
				}
			}
		}
		return answer;
	}

}
