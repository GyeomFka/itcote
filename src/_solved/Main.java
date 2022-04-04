package _solved;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(1, 1);
		map.put(3, 1);
		map.put(4, 1);

		map.remove(1);
		map.put(5, 1);

		for (int x : map.keySet()) {
			System.out.println(x);
		}
	}
}