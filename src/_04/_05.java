package _04;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _05 {
	public static void main(String[] args) {
		int n = 10;
		int k = 3;
		int[] arr = {13, 15, 34, 23, 45, 65, 33, 11, 26, 42};

		Map<Integer, Integer> map = new TreeMap<>();

		for (int x : arr) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}

		for (int x : map.keySet()) {
			System.out.println(x + " : " + map.get(x));
		}
	}


	//19년1119
	//2333330
	//
}
