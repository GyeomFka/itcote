package _04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * sliding window
 * two pointer algorithm
 */
public class _04 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();
		String t = scan.nextLine();
		/*String s = "bacaAacba";
		String t = "abc";*/
		int sLen = s.length();
		int tLen = t.length();

		HashMap<Character, Integer> sMap = new HashMap<>();
		HashMap<Character, Integer> tMap = new HashMap<>();

		int answer = 0;
		int lt = 0;

		for (char x : t.toCharArray()) {
			tMap.put(x, tMap.getOrDefault(x, 0)+1);
		}

		for (int i = 0; i < tLen; i++) {
			char x = s.charAt(i);
			sMap.put(x, sMap.getOrDefault(x, 0)+1);
		}

		if(sMap.equals(tMap)) answer++;

		for (int i = tLen; i < sLen; i++) {
			char x = s.charAt(i);
			char y = s.charAt(lt);
			sMap.put(x, sMap.getOrDefault(x, 0)+1);
			sMap.put(y, sMap.get(y)-1);
			if(sMap.get(y)==0) sMap.remove(y);
			lt++;
			if(sMap.equals(tMap)) answer++;
		}

		System.out.println(answer);
	}
}
