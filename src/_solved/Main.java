package _solved;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashMap<Integer, Integer> aMap = new HashMap<>();
		aMap.put(2, 1);
		aMap.put(3, 2);
		aMap.put(4, 1);
		aMap.put(1, 1);

		HashMap<Integer, Integer> bMap = new HashMap<>();
		bMap.put(2, 1);
		bMap.put(3, 2);
		bMap.put(4, 1);
		bMap.put(100, 1);

		System.out.println(aMap == bMap);
		System.out.println(aMap.equals(bMap));


		for (int x : aMap.keySet()) {
			System.out.print(x + " ");
			System.out.println( aMap.keySet());
		}
		System.out.println(" ");
		for (int x : bMap.keySet()) {
			System.out.print(x + " ");
			System.out.println( bMap.keySet());
		}

		System.out.println(aMap.size());
		System.out.println(bMap.size());

	}
}