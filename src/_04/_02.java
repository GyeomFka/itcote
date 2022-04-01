package _04;

import java.util.HashMap;

/**
 * 2. 아나그램
 */
public class _02 {
	public static void main(String[] args) {
		String a = "AbaAeCe";
		String b = "baeeACA";

		HashMap<Character, Integer> aMap = new HashMap<>();
		HashMap<Character, Integer> bMap = new HashMap<>();

		for (char x : a.toCharArray()) {
			aMap.put(x, aMap.getOrDefault(x, 0)+1 );
		}

		for (char x : b.toCharArray()) {
			bMap.put(x, bMap.getOrDefault(x, 0)+1 );
		}

		for (char key : aMap.keySet()) {
			System.out.print(key + " : " + aMap.get(key) + "/");
		}
		System.out.println(" ");

		for (char key : bMap.keySet()) {
			System.out.print(key + " : " + bMap.get(key) + "/");
		}

		boolean answer = solution(aMap, bMap);
	}

	private static boolean solution(HashMap<Character, Integer> aMap, HashMap<Character, Integer> bMap) {
		if(aMap.size() != bMap.size()) return false;

		return true;
	}
}
