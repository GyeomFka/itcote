package _04;

import java.util.HashMap;

public class _04 {
	public static void main(String[] args) {

		String s = "bacaAacba";
		String t = "abc";

		HashMap<Character, Integer> aMap = new HashMap<>();
		HashMap<Character, Integer> bMap = new HashMap<>();

		int sLen = s.length();
		int tLen = t.length();

		for (char x : t.toCharArray()) {
			bMap.put(x, bMap.getOrDefault(bMap.get(x), 0)+1);
		}

		int lt = 0, rt = 0;
		int answer = 0;

		while(lt <= sLen - tLen) {
			while(rt < lt + tLen) {
				char x = s.charAt(rt++);
				aMap.put(x, aMap.getOrDefault(aMap.get(x), 0) + 1);
			}

			boolean isAna = solution(aMap, bMap);
			if (isAna) {
				answer++;
			}

			char key = s.charAt(lt);

			if (aMap.get(key) > 1) {
				aMap.put(key, aMap.get(key)-1);
				lt++;
			} else{
				aMap.remove(key);
				lt++;
			}
			// aMap.remove(key);
		}
		System.out.println(answer);

	}

	private static boolean solution(HashMap<Character, Integer> aMap, HashMap<Character, Integer> bMap) {
		for (char x : aMap.keySet()) {
			if (aMap.get(x) != bMap.get(x)) {
				return false;
			}
		}
		return true;
	}
}
