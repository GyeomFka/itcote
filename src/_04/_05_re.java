package _04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class _05_re {
	public static void main(String[] args) {
		int n = 11;
		int k = 3;
		Integer[] arr = {13, 15, 34, 23, 45, 65, 33, 11, 26, 42, 65};

		Arrays.sort(arr, Collections.reverseOrder());
		Map<Integer, Integer> map = new TreeMap<>();


		for (int x : arr) {
			System.out.println(x);
		}

		for (int x : arr) {
			map.put(x, map.getOrDefault(x,0)+1);
		}

		for (int x : map.keySet()) {
			System.out.println(x + " : " + map.get(x));
		}



		int lt = 0, rt = 0;
		int sum = 0;


		int index = arr[2];
		map.put(index, map.get(index)-1);
		if(map.get(index) == 0) {
			map.remove(index);
		}


	}
}
