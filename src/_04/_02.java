package _04;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 2. 아나그램
 */
public class _02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/*
		String a = "AbaAeCe";
		String b = "baeeACA";
		*/
		String a = scan.nextLine();
		String b = scan.nextLine();
		HashMap<Character, Integer> aMap = new HashMap<>();
		HashMap<Character, Integer> bMap = new HashMap<>();

		for (char x : a.toCharArray()) {
			aMap.put(x, aMap.getOrDefault(x, 0)+1 );
		}

		for (char x : b.toCharArray()) {
			bMap.put(x, bMap.getOrDefault(x, 0)+1 );
		}

/*
		for (char key : aMap.keySet()) {
			System.out.print(key + " : " + aMap.get(key) + " / ");
		}
*/

/*
		for (char key : bMap.keySet()) {
			System.out.print(key + " : " + bMap.get(key) + " / ");
		}
*/

		boolean answer = solution(aMap, bMap);
		if (answer == true) {
			System.out.println("YES");
		} else
			System.out.println("NO");
	}

	private static boolean solution(HashMap<Character, Integer> aMap, HashMap<Character, Integer> bMap) {
		if(aMap.size() != bMap.size()) return false;
		for (char key : aMap.keySet()) {
			if (aMap.get(key) != bMap.get(key)) {
				return false;
			}
		}
		return true;
	}
}
