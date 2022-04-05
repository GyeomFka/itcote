package _04;

import java.util.HashMap;

public class _02_answer {
	public static void main(String[] args) {

		//길이가 같은 두 단어
		String a = "AbaAeCe";
		String b = "baeeACA";

		String answer = "YES";

		HashMap<Character, Integer> map = new HashMap<>();

		for (char x : a.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}

		for (char x : b.toCharArray()) {
			if(!map.containsKey(x) || map.get(x)==0) answer = "NO";
			map.put(x, map.get(x)-1);
		}

		System.out.println(answer);
	}
}
