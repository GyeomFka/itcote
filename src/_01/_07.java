package _01;

import java.util.Scanner;

/**
 * 7. 회문 문자열
 */
public class _07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        String turnString = getTurnString(input);
        String isTurnString = getTurnStringYn(input, turnString);

        System.out.println(isTurnString);
    }

    private static String getTurnString(String input) {
        String turnString = "";
        for (int i = input.length() -1; i >= 0; i--) {
            turnString += String.valueOf(input.charAt(i));
        }
        return turnString;
    }

    private static String getTurnStringYn(String input, String turnString) {
        String a = input.toUpperCase();
        String b = turnString.toUpperCase();
        if (a.equals(b)) {
            return "YES";
        } else return "NO";
    }
}
