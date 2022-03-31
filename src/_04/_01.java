package _04;

import java.util.HashMap;

/**
 * 1. 학급회장 (HashMap)
 */
public class _01 {
	/**
	 * hash map [key|value]
	 */
	public static void main(String[] args) {
		char answer = ' ';
		String s = "BACBACCACCBDEDE";
		HashMap<Character, Integer> map = new HashMap<>();

		for (char x : s.toCharArray()) {
			/*중요함 매우*/
			map.put(x, map.getOrDefault(x, 0)+1);
		}

		//특정 키 존재 확인
		System.out.println(map.containsKey('A')); // T or F
		System.out.println(map.containsKey('F')); // T or F
		//size
		System.out.println(map.size());
		//key remove
		System.out.println(map.remove('A')); // return -> value
		//size
		System.out.println(map.size());


		int max = Integer.MIN_VALUE;
		for (char key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));

			if (map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		System.out.println(answer);
	}
}
