package _01;

import java.util.Scanner;

/**
 * 9. 숫자만 추출
 */
public class _09_answer_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        int answer = solution(input);
        System.out.println(answer);
    }

    private static int solution(String input) {
        String answer = "";
        for (char x : input.toCharArray()) {
            if (Character.isDigit(x)) {
                answer += x;
            }
        }
        return Integer.parseInt(answer);
    }
}
