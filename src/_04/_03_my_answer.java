package _04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _03_my_answer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		//int[] arr = {20, 12, 20, 10, 23, 17, 10};
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> answer = new ArrayList<>();

		for (int i = 0; i < k; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}

		answer.add(map.size());

		int lt = 0;
		for (int rt = k; rt < n; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt]) == 0) map.remove(arr[lt]);
			answer.add(map.size());
			lt++;
		}

		for (int x : answer) {
			System.out.print(x + " ");
		}
	}
}
