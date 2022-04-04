package _04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		/*int n = 7;
		int k = 4;
		int[] arr = {20, 12, 20, 10, 23, 17, 10};
*/

		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();

		int lt = 0, rt = 0;

		while(lt <= n-k ) {
			while(rt < k+lt) {
				map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
				rt++;
			}

			System.out.println(map.size());

			if (map.get(arr[lt]) > 1) {
				map.put(arr[lt], map.get(arr[lt])-1);
				lt++;
			} else {
				map.remove(arr[lt++]);
			}
		}
	}
}
