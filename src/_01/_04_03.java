package _01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *4. 단어 뒤집기 - 직접 구현
 */

public class _04_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String[] str = new String[n];

		for(int i = 0; i < n; i++) {
			str[i] = scan.next();
		}

		for(String x : solution(n, str)) {
			System.out.println(x);
		}
	}

	private static ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for (String x : str) {
			char[] s = x.toCharArray();

			int lt = 0, rt = x.length()-1;

			while(lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		return answer;
	}

}
