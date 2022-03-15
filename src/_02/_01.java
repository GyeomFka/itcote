package _02;

import java.util.Scanner;

/**
 * 1. 큰 수 출력하기
 */
public class _01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int[] input = new int[len];
		for (int i = 0; i < len; i++) {
			input[i] = scan.nextInt();
		}

		System.out.print(input[0] + " ");

		for (int i = 0; i < len - 1; i++) {
			if(input[i] < input[i+1]) {
				System.out.print(input[i+1] + " ");
			}
		}
	}
}
