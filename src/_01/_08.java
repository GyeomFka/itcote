package _01;

import java.util.Scanner;

/**
 * 8. 유효한 팰린드룸
 *  -> 알파벳 만(대소문자 구분 X)
 *  -> 알파벳 이외의 문자들 무시
 */
public class _08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(solution(input));
    }

    private static String solution(String input) {
        //replace에는 정규식 사용을 못 한다 -> replaceAll 정규식 사용
        input = input.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(input).reverse().toString();
        System.out.println(tmp);
        if (input.equals(tmp)) {
            return "YES";
        } else return "NO";
    }
}