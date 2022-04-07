package _04;

import java.util.HashMap;
import java.util.Scanner;

public class _04_my_answer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String b = scan.nextLine();

		int answer = solution(s, b);
		System.out.println(answer);
	}

	private static int solution(String s, String b) {
		int answer = 0;

		HashMap<Character, Integer> sMap = new HashMap<>();

		int sLen = s.length();
		int bLen = b.length();

		int lt = 0, rt = 0;

		while(lt <= sLen - bLen) {
			while(rt < lt + bLen) {
				char x = s.charAt(rt);
				sMap.put(x, sMap.getOrDefault(x, 0) + 1);
				rt++;
			}

			boolean cntCheck = isAna(sMap, b);//논리적으로 문제가 없는데 cntCheck method를 통해 map요소가 변했다.

			if(cntCheck){
				answer++;
			}
			char x = s.charAt(lt);
			if(sMap.get(x) > 1) {
				sMap.put(x, sMap.get(x) - 1);
				lt++;
			} else {
				sMap.remove(x);
				lt++;
			}
		}


		return answer;
	}

	private static boolean isAna(HashMap<Character, Integer> sMap, String b) {
		HashMap<Character, Integer> bMap = new HashMap<>();
		for (char x : b.toCharArray()) {
			bMap.put(x, bMap.getOrDefault(x, 0) + 1);
		}

		for (char x : sMap.keySet()) {
			if (sMap.get(x) != bMap.get(x)) {
				return false;
			}
		}

		return true;
	}
}
