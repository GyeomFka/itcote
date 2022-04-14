package _04;

import java.util.HashMap;

public class _04_answer {
	public static void main(String[] args) {
		String a = "";
		String b = "";

		int answer = 0;

		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();

		for (char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0)+1);

		int L = b.length()-1;

		for (int i = 0; i < L; i++) {
			char key = a.charAt(i);
			am.put(key, am.getOrDefault(key, 0)+1);
		}

		int lt = 0;
		for (int rt = L; rt < a.length(); rt++) {
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1);
			if(am.equals(bm)) answer++;
			am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
			if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
		}


	}
}
