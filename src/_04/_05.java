package _04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class _05 {
	public static void main(String[] args) {
		int n = 11;
		int k = 3;
		int[] arr = {13, 15, 34, 23, 45, 65, 33, 11, 26, 42, 65};

		Arrays.sort(arr);

		Comparator<Integer> comparator = Comparator.reverseOrder();
		Map<Integer, Integer> map = new TreeMap<>(comparator);

		for (int i = 0; i < n; i++) {
			//10 ~ 0
			System.out.println(i + ":" + arr[n-i-1]);
		}
	}
	//19년1119
	//2,333,330
	//

}
