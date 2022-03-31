package _03;

import java.util.Scanner;

public class _04_two_pointers_algo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int answer = 0;
		int lt = 0, rt = 0;
		int sum = 0;


		while(rt < n) {
			while (sum < m) {
				if (rt==n-1) {
					sum += arr[rt];
					rt++;
					break;
				} else {
					sum += arr[rt++];
				}
			}
			if (sum == m){
				answer++;
			}
			sum -= arr[lt++];
		}


		System.out.println(answer);
	}
}
