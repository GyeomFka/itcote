package _01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *4. 단어 뒤집기 - StringBuilder reverse 활용
 */

public class _04_02 {
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
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}

}
