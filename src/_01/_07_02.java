package _01;

import java.util.Locale;
import java.util.Scanner;

/**
 * 7. 회문 문자열
 */
public class _07_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        String solution = solution(input);
        System.out.println(solution);
    }

    private static String solution(String input) {
        String tmp = new StringBuilder(input).reverse().toString();
        if (input.equalsIgnoreCase(tmp)) {
            return "YES";
        } else return "NO";
    }
}
